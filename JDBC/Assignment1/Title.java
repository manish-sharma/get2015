public class Title {
	private int titleId;
	private int subjectId;
	private int publisherId;
	private String titleName;

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Subject s) {
		this.subjectId = s.getSubjectId();
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Publisher p) {
		this.publisherId = p.getPublisherId();
	}

	public String getTitleName() {
		return titleName;
	}

	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
