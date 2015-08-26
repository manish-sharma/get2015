package assignmentOOP_2;

public class Question 
{
	int questionNo;
	String questionText;
	String questionType;
	public Question(int questionNo, String questionText, String questionType) {
		super();
		this.questionNo = questionNo;
		this.questionText = questionText;
		this.questionType = questionType;
	}
	/**
	 * @return the questionNo
	 */
	public int getQuestionNo() {
		return questionNo;
	}
	/**
	 * @param questionNo the questionNo to set
	 */
	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}
	/**
	 * @return the questionText
	 */
	public String getQuestionText() {
		return questionText;
	}
	/**
	 * @param questionText the questionText to set
	 */
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	/**
	 * @return the questionType
	 */
	public String getQuestionType() {
		return questionType;
	}
	/**
	 * @param questionType the questionType to set
	 */
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	
}
