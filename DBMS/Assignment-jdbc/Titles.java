package jdbc;

public class Titles {
	private int titleId;
	private String titleName;
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

	public void setTitleName(String titleName) {
		this.titleName = titleName;
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
		return "[titleId=" + titleId + ", titleName= " + titleName +", publishreId=" + publishreId
				+ ", SubjectId=" + SubjectId + "] \n";
	}

	
}
