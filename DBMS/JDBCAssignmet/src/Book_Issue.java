import java.util.Date;

/**
 * This class act as class for the book issuse table
 * 
 * @author Shishir Date 16th September 2015
 */
public class Book_Issue {
	private Date issue_date;// variable for issue date
	private int accession_number;// variable for accession number
	private int member_id;// variable for member_id
	private Date due_date;// variable for due_date

	// getter for issue date
	public Date getIssue_date() {
		return issue_date;
	}

	// setter for issue date
	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	// getter for accession number
	public int getAccession_number() {
		return accession_number;
	}

	// setter for accession number
	public void setAccession_number(int accession_number) {
		this.accession_number = accession_number;
	}

	// getter for member id
	public int getMember_id() {
		return member_id;
	}

	// setter for member id
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	// getter for due date
	public Date getDue_date() {
		return due_date;
	}

	// setter for due date
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

}
