import java.util.Date;

/**
 * This class act as POJO class for Book return table
 * 
 * @author Shishir Date 16th September 2015
 *
 */
public class Book_Return {
	private Date return_date;// //variable for return date
	private int accession_number;// variable for accession number
	private int member_id;// variable for member id
	private Date issue_date;// variable for issue date

	// getter for return date
	public Date getReturn_date() {
		return return_date;
	}

	// setter for return date
	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	// getter for accession date
	public int getAccession_number() {
		return accession_number;
	}

	// setter for accession number
	public void setAccession_number(int accession_number) {
		this.accession_number = accession_number;
	}

	// getter for getter id
	public int getMember_id() {
		return member_id;
	}

	// setter for member id
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	// getter for issue date
	public Date getIssue_date() {
		return issue_date;
	}

	// setter for issue date
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

}
