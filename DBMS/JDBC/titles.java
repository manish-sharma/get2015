import java.util.Date;

public class titles {
	private int titleId;
	private String titleName;
	private String purchaseDate;
	private int publishreId;
	private int SubjectId;

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleFname) {
		this.titleName = titleFname;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getPublishreId() {
		return publishreId;
	}

	public void setPublishreId(int publishreId) {
		this.publishreId = publishreId;
	}

	public int getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}

	@Override
	public String toString() {
		return "[titleId=" + titleId + ", titleName=" + titleName
				+ ", purchaseDate=" + purchaseDate + ", publishreId="
				+ publishreId + ", SubjectId=" + SubjectId + "] \n";
	}

}
