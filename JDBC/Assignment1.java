import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import pojoClasses.Author;
import pojoClasses.Titles;
import connection.ConnectionUtil;

public class Assignment1 {

	static ArrayList<Author> arrayListA = new ArrayList<Author>();
	static ArrayList<Titles> arrayListT = new ArrayList<Titles>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Author Name: ");
		String authorName = scanner.nextLine();

		executeQueryUsingStatement(authorName);
		// executeQueryUsingPreparedStatement();

		java.util.Iterator<Author> iterator = arrayListA.iterator();
		java.util.Iterator<Titles> iterator2 = arrayListT.iterator();

		if (arrayListA.isEmpty())
			System.out.print("Book for author '" + authorName
					+ "' not available");

		else {
			System.out.println("Author ID\tAuthor Name\tTitle Name");
			while (iterator.hasNext()) {
				Author author = (Author) iterator.next();
				Titles titles = (Titles) iterator2.next();

				System.out
						.println(author.getAuthorId() + "\t\t "
								+ author.getAuthorName() + "\t"
								+ titles.getTitleName());
			}
		}
		System.out.println("\nExiting . . .");
	}

	/* execute query using statement */
	public static void executeQueryUsingStatement(String authorName) {

		String query = "SELECT a.author_id,a.author_name,t.title_name "
				+ "FROM authors a INNER JOIN title_author ta ON a.author_id=ta.author_id "
				+ "INNER JOIN titles t ON ta.title_id=t.title_id "
				+ "WHERE a.author_name='" + authorName + "';";

		Connection con = null;
		ResultSet rs = null;
		Statement stmt = null;

		ConnectionUtil connectionUtil = new ConnectionUtil();
		con = connectionUtil.getConnection();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				Author author = new Author();
				Titles titles = new Titles();

				author.setAuthorId(rs.getString(1));
				author.setAuthorName(rs.getString(2));
				titles.setTitleName(rs.getString(3));

				arrayListA.add(author);
				arrayListT.add(titles);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			/* close connection */
			try {
				if (con != null) {
					con.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (rs != null) {
					rs.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
