package oop2;

public class Answer {
	//answer1 stores the answer of question 1.
	public  int answer1;
	// answer2 stores the answer of question2.
	public  String answer2="";
	// answer3 stores the answer of question3.
	public  String answer3="";
	/**
	 * default constructor.
	 */
	public Answer(){};
	/** Parameterized constructor.
	 * @param ans1 value of answer 1.
	 * @param ans2 value of answer 2.
	 * @param ans3 value of answer 3.
	 */
	public Answer(int ans1, String ans2, String ans3)
	{
		this.answer1=ans1;
		this.answer2=ans2;
		this.answer3=ans3;
	}
	/**
	 * @return the answer 1.
	 */
	public int getAnswer1() {
		return answer1;
	}
	/** set answer 1.
	 * @param answer1
	 */
	public void setAnswer1(int answer1) {
		this.answer1 = answer1;
	}
	/**
	 * @return the answer 2.
	 */
	public String getAnswer2() {
		return answer2;
	}
	/** set answer 2.
	 * @param answer2
	 */
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	/**
	 * @return the answer 1.
	 */
	public String getAnswer3() {
		return answer3;
	}
	/** set answer 3.
	 * @param answer3
	 */
	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}
}
