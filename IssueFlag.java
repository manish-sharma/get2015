package Com.Question2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * @Discription this class use Given the name of the book, to be issued by an existing member.
 * Return flag to indicate whether the  the book has been issued or not.
 * @author Sumitra
 *
 */

public class IssueFlag {

         static Scanner scan = new Scanner(System.in);
	
         public static void main(String[] args) {
   
		boolean issued= executeQueryUsingPreparedStatement();
		if(issued){
			System.out.println("Book issued Successfully");
		}
		else
			System.out.println("Book not Issued");

		System.out.println("\nExiting . . .");
	}

/**
 * 
 * @return
 */

	/* execute query using prepared statement*/
	@SuppressWarnings("resource")
	/**
	 * this method take book name check for book is exist in book table or not if not then return false
	 * @return true of false
	 * it take member id from user check if member exist in table or not if not return false
	 * if exist then check is book that is in library is available or not 
	 * if available then issued to member and return true
	 * if not available then return false
	 */
	private static boolean  executeQueryUsingPreparedStatement() {
		
		
		Connection con = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		ConnectionUtil conUtil = new ConnectionUtil();
		int accession_no=0;
		boolean flag= true;
		try {
			con = conUtil.getConnection();
		System.out.println("Enter Book Name ");
		String bookName = scan.next();
		
		 System.out.println("Enter member ID ");
			int memberID = scan.nextInt();
			String query = "select accession_no from books,(select title_id from title where title = ?) as title_id_of_given_book_name "
                         + "where title_id_of_given_book_name.title_id = books.title_id ";
                         
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1,bookName);
			
			resultSet = preparedStatement.executeQuery();
			String query3= "select member_id from member where member_id=?";
			preparedStatement = con.prepareStatement(query3);
			preparedStatement.setInt(1,memberID);
			
			ResultSet resultSet2 = preparedStatement.executeQuery();
			if(!resultSet.next()){
				System.out.println("Book not Exist");
				return false;
			}
			if(!resultSet2.next()){
				System.out.println("Member not Exist");
				return false;
			}
			if(resultSet.next() ){
				
				do {
					
					String query1 = "select book_issue.accession_no from book_issue where accession_no=? and (accession_no,member_id,issue_date) not  in (select accession_no,member_id,issue_date from book_return)";
					preparedStatement = con.prepareStatement(query1);
					preparedStatement.setInt(1,resultSet.getInt(1));
					ResultSet resultSet1 = preparedStatement.executeQuery();
					
					if(resultSet1.next()){
						
						flag =false;
					}
					else{
						accession_no = resultSet.getInt(1);
						
						flag = true;
						break;
					}
					
				}while(resultSet.next());
				if(!flag) {
					System.out.println("Book not Available");
					return false;
				}
				
			}
			
			String query2 = "INSERT INTO book_issue(accession_no,member_id,issue_date,due_date) VALUES(?, ?,now(),DATE_ADD(now(),interval 15 day))";
			
			preparedStatement = con.prepareStatement(query2);
			preparedStatement.setInt(1,accession_no);
			preparedStatement.setInt(2,memberID);
			 preparedStatement.executeUpdate();
				
		
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return flag;

	}

	
}
