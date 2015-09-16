package pojoClasses;

public class BookIssue {
	private String issueDate;
	private int accessionNo;
	private String memberId;
	private String dueDate;
	
	public String getIssueDate() {
		return issueDate;
	}
	
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	public int getAccessionNo() {
		return accessionNo;
	}
	
	public void setAccessionNo(int accessionNo) {
		this.accessionNo = accessionNo;
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

}
