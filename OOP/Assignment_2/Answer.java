package assignmentOOP_2;

public class Answer 
{
	int questionNo;
	String answer;
	String answerType;
	public Answer(int questionNo, String answer, String answerType) {
		super();
		this.questionNo = questionNo;
		this.answer = answer;
		this.answerType = answerType;
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
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * @return the answerType
	 */
	public String getAnswerType() {
		return answerType;
	}
	/**
	 * @param answerType the answerType to set
	 */
	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}
	
	


}
