
/**class for Storing Answers of every individual and returning it
 * 
 * @author Gaurav Saini
 *
 */
public class Answer {
	int single[] = new int[10];
	String multiple[] = new String[10];
	String text[] = new String[10];

	/**
	 * @param number
	 *            ->answer of individual
	 * @param count
	 *            ->individual number
	 */
	void singleAnsSet(int number, int count) {
		single[count] = number;
	}

	/**
	 * @param answer
	 *            ->answer of multiple Questions
	 * @param count
	 *            ->individual number
	 */
	void multipleAnsSet(String answer, int count) {
		multiple[count] = answer;
	}

	/**
	 * @param answer
	 *            ->answer of individual
	 * @param count
	 *            ->individual number
	 */
	void textSet(String answer, int count) {
		text[count] = answer;
	}

	/**
	 * @param count
	 *            ->individual no
	 * @return->answer of that individual
	 */
	int singleAnsGet(int count) {
		return single[count];
	}

	/**
	 * @param count
	 *            ->individual no
	 * @return->answer of that individual for multiple Question
	 * 
	 */
	String multipleAnsGet(int count) {
		return multiple[count];
	}

	/**
	 * @param count
	 *            ->individual no
	 * @return->answer of feedback
	 */
	String textAnsGet(int count) {
		return text[count];
	}

}
