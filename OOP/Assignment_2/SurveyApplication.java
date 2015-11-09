package assignmentOOP_2;

/*This is Survey Application where we ask Participant to fill the survey. Survey will have number of questions.
 Participant will answer question one by one.
 Single, Multiple choice question will have validation to choose answer from available options only.
 All questions are mandatory to answer.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import org.apache.commons.lang.StringUtils;

public class SurveyApplication {
	ArrayList<Question> questionArrayList = new ArrayList<Question>();
	HashMap<Integer, ArrayList<Answer>> hmap = new HashMap<Integer, ArrayList<Answer>>();
	int noOfParticipent;

	/*
	 * Below code is to read questions from text file,then create an object of
	 * Question class,fill all the data and make a arraylist of that objects.
	 */
	public void readQuestions() {
		try {
			String line = "";
			Scanner scanner = new Scanner(System.in);
			BufferedReader brQuestion;
			brQuestion = new BufferedReader(new FileReader("D:\\Questions.txt"));
			while ((line = brQuestion.readLine()) != null
					&& StringUtils.isNotEmpty(line)) // read question from text
														// file
			{
				String[] lineArray = line.split(","); // use comma as separator
				int questionNo = Integer.parseInt(lineArray[0].trim());
				String questionText = lineArray[1].trim();
				String QuestionType = lineArray[2].trim();
				questionArrayList.add(new Question(questionNo, questionText,
						QuestionType)); // initialize object of Question class
										// and add them in arraylist
			}
			brQuestion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Below function is to take survey.
	 */
	public void takeSurvay() {
		try {
			Scanner scanner = new Scanner(System.in);
			// create arraylist of participent
			ArrayList<Participent> participentArrayList = new ArrayList<Participent>();
			String nameOfParticipent;
			int ageOfParticipent;
			int idOfParticipent;
			String answer = "yes";
			do {
				noOfParticipent++;
				System.out.println("Enter Name Of Participent"); // ask name of
																	// participent
				nameOfParticipent = scanner.next();
				System.out.println("Enter age of Partcipent");
				ageOfParticipent = scanner.nextInt();
				System.out.println("Enetr id of Participent");
				idOfParticipent = scanner.nextInt();
				participentArrayList.add(new Participent(nameOfParticipent,
						ageOfParticipent, idOfParticipent)); // initialize
																// object of
																// Participent
																// class and add
																// them in
																// arraylist
				ArrayList<Answer> answerArrayList = new ArrayList<Answer>();

				for (int i = 0; i < questionArrayList.size(); i++) {
					Question st = questionArrayList.get(i);
					System.out
							.println(st.getQuestionNo() + " "
									+ st.getQuestionText() + " "
									+ st.getQuestionType());
					String answerGivenByUser = scanner.next();

					// below code is to check that whether participant give
					// answer of single select question within given choice
					if (st.getQuestionType().equalsIgnoreCase("Single select")) {
						switch (answerGivenByUser) {
						case "1":
						case "2":
						case "3":
						case "4":
							answerArrayList.add(new Answer(st.getQuestionNo(),
									answerGivenByUser, st.getQuestionType()));
							break;
						default:
							System.out.println("Please select one of the given choice(1,2,3,4)");
							i--;
						}

					} else
						answerArrayList.add(new Answer(st.getQuestionNo(),
								answerGivenByUser, st.getQuestionType())); // initialize
																			// object
																			// of
																			// Answer
																			// class
																			// and
																			// add
																			// them
																			// in
																			// arraylist
					System.out.println();

				}
				hmap.put(noOfParticipent, answerArrayList); // put the arraylist
															// of answer in
															// hashmap

				System.out.println("Do you want to continue"); // check whether
																// there is any
																// other
																// participant
																// who take to
																// part in
																// survey or not
				answer = scanner.next();
			} while (answer.equalsIgnoreCase("Yes"));
			scanner.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Below code is to Print the feedfack Report It mainly display the
	 * percentage of participants who select particular answer of particular
	 * single select question
	 */
	public void feedbackReport() {
		try {
			for (int j = 0; j < questionArrayList.size(); j++) {
				int choice1 = 0, choice2 = 0, choice3 = 0, choice4 = 0;
				Question question = questionArrayList.get(j);
				if (question.getQuestionType()
						.equalsIgnoreCase("Single Select")) // if the question
															// is of single
															// select type
				{
					Set set = hmap.entrySet();
					Iterator iterator = set.iterator();
					while (iterator.hasNext()) {
						Map.Entry mentry = (Map.Entry) iterator.next();
						ArrayList<Answer> a1 = (ArrayList<Answer>) mentry
								.getValue();

						Answer answer = a1.get(j);

						switch (answer.getAnswer()) {
						case "1":
							choice1++; // increase the value of choice1 if user
										// select 1st option of given question
							break;
						case "2":
							choice2++;
							break;
						case "3":
							choice3++;
							break;
						case "4":
							choice4++;
							break;
						}

					}
					// print the feedback
					System.out.println("Q" + (j + 1) + "  "
							+ question.getQuestionText());
					System.out.println("    1-"
							+ (int) ((float) choice1 / noOfParticipent * 100)
							+ "%");
					System.out.println("    2-"
							+ (int) ((float) choice2 / noOfParticipent * 100)
							+ "%");
					System.out.println("    3-"
							+ (int) ((float) choice3 / noOfParticipent * 100)
							+ "%");
					System.out.println("    4-"
							+ (int) ((float) choice4 / noOfParticipent * 100)
							+ "%");
					System.out.println("");

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * below code is to print overall survey report It mainly print the answer
	 * given by each participant for each question
	 */
	public void survayReport() {
		try {
			Set set = hmap.entrySet();
			Iterator iterator = set.iterator();
			while (iterator.hasNext()) {
				Map.Entry mentry = (Map.Entry) iterator.next();
				System.out.println("Participent  " + mentry.getKey());
				ArrayList<Answer> a1 = (ArrayList<Answer>) mentry.getValue();
				Iterator itr = a1.iterator();
				while (itr.hasNext()) {
					Answer st = (Answer) itr.next();
					int i = st.getQuestionNo() - 1;
					Question question1 = questionArrayList.get(i);
					System.out.println("Q" + (i + 1) + "  "
							+ question1.getQuestionText()); // print the
															// question
					System.out.println(st.getAnswer()); // print the answer
					System.out.println();
				}
				System.out.println();
				System.out.println();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Main function
	public static void main(String args[]) {

		SurveyApplication surveyApplication = new SurveyApplication();
		surveyApplication.readQuestions();
		surveyApplication.takeSurvay();
		System.out.println("");
		System.out.println("Survey Report");
		surveyApplication.feedbackReport();
		surveyApplication.survayReport();
	}

}
