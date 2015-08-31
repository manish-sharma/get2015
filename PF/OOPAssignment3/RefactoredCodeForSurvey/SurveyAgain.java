import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sumitra
 *this is the main class which contain the menu and all the statics functions
 */
public class SurveyAgain {
	static List<Answers> answerList;
	static SurveyQuestion surveyQuestionObj = new SurveyQuestion();
	static BufferedReader bufferedReaderObj = null;
	static Scanner scanner = null;
	static int count;

	public static void main(String arg[]) {
		SurveyAgain survey = new SurveyAgain();

		try {
			scanner = new Scanner(System.in);
			bufferedReaderObj = new BufferedReader(new InputStreamReader(
					System.in));

			answerList = new ArrayList<Answers>();
			int choice = 1;
			do {
				System.out.println("Menu");
				System.out.println("1.Take survey");
				System.out.println("2.View Statistics");
				System.out.println("3.View people and answers");
				System.out.println("Enter your choice");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					survey.askQuestion();
					break;
				case 2:
					if (count == 0) {
						System.out
								.println("Please take the survey at least once to view results");
						break;

					}
					survey.statistics();
					break;

				case 3:
					if(count == 0)
					{
						System.out.println("Please take the survey at least once to view results");
						break;
					}
					survey.show();
					break;
				default:
					System.out.println("Enter number in tha range 1 to 3\n");
				}

			} while (choice != 4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			scanner.close();
			return;
		}
	}
/**
 * this method is to take survey
 */
	void askQuestion() {
		count++;
		Answers ans = new Answers();
		System.out.println(surveyQuestionObj.age(false));
		int age = scanner.nextInt();
		if (age < 18) {
			System.out.println("Survey is Available only for 18+ people");

		}
		ans.setAge(age);

		/* Second question */
		System.out.println(surveyQuestionObj.nationality(false));
		String nationality = "";
		try {
			nationality = bufferedReaderObj.readLine();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ans.setNationality(nationality);
		/* Third question */
		System.out.println(surveyQuestionObj.gender(false));
		String gender = "";
		try {
			gender = bufferedReaderObj.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ans.setGender(gender);

		/* Fourth question */
		System.out.println(surveyQuestionObj.ratingHaritages(false));
		int rating = scanner.nextInt();
		if (rating != 1 && rating != 2 && rating != 3 && rating != 4) {
			System.out.println("Please enter from available options");
			rating = scanner.nextInt();
		}
		ans.setRating(rating);

		/* Fifth question */
		System.out.println(surveyQuestionObj.favouriteHaritages(false));
		String heritage = "";
		try {
			heritage = bufferedReaderObj.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ans.setHeritage(heritage);

		/* Sixth question */
		System.out.println(surveyQuestionObj.feedback(false));
		String feedback = "";
		try {
			feedback = bufferedReaderObj.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ans.setFeedback(feedback);
		answerList.add(ans);
	}
/**
 * this method is to calculate statistics
 */
	void statistics() {
		double totalA = 0.0, totalB = 0.0, totalC = 0.0, totalD = 0.0;
		Iterator<Answers> itrb = answerList.iterator();
		
		while (itrb.hasNext()) {
			Answers ans = itrb.next();
			int result = ans.getRating();
			if (result == 1)
				totalA += 1.0;

			if (result == 2)
				totalB += 1.0;

			if (result == 3)
				totalC += 1.0;

			if (result == 4)
				totalD += 1.0;
		}
		/* total percentage of answers */
		System.out.println("Total percentage of Excellent: " + totalA / count
				* 100);
		System.out.println("Total percentage of Good: " + totalB / count * 100);
		System.out.println("Total percentage of Fair: " + totalC / count * 100);
		System.out.println("Total percentage of Bad: " + totalD / count * 100);
	}
	/**
	 * this method is to show the survey
	 */
	void show()
	{
		Iterator<Answers> itrb = answerList.iterator();
		
		while (itrb.hasNext())
		{
			Answers ans = itrb.next();
			System.out.println("\nTourist \n");
			 /* first question */
			System.out.print(surveyQuestionObj.age(true));
			int age=ans.getAge();	
			System.out.println(age+"\n");
			
			/* Second question */
			System.out.print(surveyQuestionObj.nationality(true));
			String nation=ans.getNationality();	
			System.out.println(nation+"\n");
			
			/* third question */
			System.out.print(surveyQuestionObj.gender(true));
			String gender = ans.getGender();
			System.out.println(gender+"\n");
			
			/* Fourth question */
			System.out.print(surveyQuestionObj.ratingHaritages(true));
			int rating = ans.getRating();
			System.out.println(rating+"\n");
			
			/* Fifth question */
			System.out.print(surveyQuestionObj.favouriteHaritages(true));
			String heritage = ans.getHeritage();
			System.out.println(heritage+"\n");
			
			/* Sixth question */
			System.out.println(surveyQuestionObj.feedback(true));
			String feedback = ans.getFeedback();
			System.out.println(feedback);
		}
	}
}
