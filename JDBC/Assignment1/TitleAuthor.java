public class TitleAuthor {

	private int titleId;
	private int authorId;

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(Title t) {
		this.titleId = t.getTitleId();
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Author a) {
		this.authorId = a.getAuthorId();
	}

}
