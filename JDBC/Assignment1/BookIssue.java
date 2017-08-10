import java.sql.Date;

public class BookIssue {

	private int memberId;
	private int accessionNumber;
	private Date issueDate;
	private Date dueDate;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(Members m) {
		this.memberId = m.getMemberId();
	}

	public int getAccessionNumber() {
		return accessionNumber;
	}

	public void setAccessionNumber(Book b) {
		this.accessionNumber = b.getAccessionNumber();
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
}
