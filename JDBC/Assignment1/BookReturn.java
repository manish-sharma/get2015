import java.sql.Date;

public class BookReturn {

	private int memberId;
	private int accessionNumber;
	private Date issueDate;
	private Date returnDate;

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

	public void setIssueDate(BookIssue bi) {
		this.issueDate = bi.getIssueDate();
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

}
