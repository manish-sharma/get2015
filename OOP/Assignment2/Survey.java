//To conduct a survey using open end methodology
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Survey {
	public static void main(String args[]) {
		try {
			Scanner scan = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			SurveyQuestion object1 = new SurveyQuestion();
			Answer object2 = new Answer();
			int ch, count = 0, i, result;
			double totalA = 0.0, totalB = 0.0, totalC = 0.0, totalD = 0.0;
			char choice;
			String[] multiChoice = new String[10];
			String answer = "";
			String a = "";
			do {
				System.out.println("Menu");
				System.out.println("1.Take survey");
				System.out.println("2.View Statistics");
				System.out.println("3.View people and answers");
				System.out.println("Enter your choice");
				ch = scan.nextInt();

				switch (ch) {
				case 1:
					count = count + 1; // To ask survey questions from user
					System.out.println(object1.singleSelect());
					result = scan.nextInt();
					if (result<0 || result>5) {
						while (result<0 || result>5) {
							System.out.println("Add correct value(1-4)");
							result = scan.nextInt();
							object2.singleAnsSet(result, count);	
						}
					} else {
						object2.singleAnsSet(result, count);	
						}
					System.out.println(object1.multipleSelect());
					int j = 0;
					while ((!answer.equals("#")) && (j < 4)) {
						answer = br.readLine();
						if (!answer.equals("1") && !answer.equals("2") && !answer.equals("3") && !answer.equals("#")) {
							while (!answer.equals("1") && !answer.equals("2") && !answer.equals("3") && !answer.equals("#")) {
								System.out.println("Add correct value(1-3 or #)");
								answer = br.readLine();
								object2.multipleAnsSet(answer, count);
								j++;	
							}}
						else
						{
						
						a = a + " " + answer;
						object2.multipleAnsSet(answer, count);
						j++;
						}
					}
					multiChoice[count] = a;
					System.out.println(object1.text());
					answer = br.readLine();
					;
					object2.textSet(answer, count);
					break;
				case 2:
					for (i = 1; i <= count; i++) // To display single select
													// answer statistics
					{
						result = object2.singleAnsGet(i);
						if (result == 1) {
							totalA += 1.0; // how many users selected option 1
						} else if (result == 2) {
							totalB += 1.0;
						} else if (result == 3) {
							totalC += 1.0;
						} else if (result == 4) {
							totalD += 1.0;
						}
					}
					System.out.println("Total percentage of 1: " + totalA
							/ count * 100);
					System.out.println("Total percentage of 2: " + totalB
							/ count * 100);
					System.out.println("Total percentage of 3: " + totalC
							/ count * 100);
					System.out.println("Total percentage of 4: " + totalD
							/ count * 100);
					break;
				case 3:
					for (i = 1; i <= count; i++) // To display all participant
													// information
					{
						System.out.println("Participant " + i);
						System.out.println(object1.singleSelect());
						result = object2.singleAnsGet(i);
						System.out.println(result);
						System.out.println(object1.multipleSelect());
						// answer=object2.multipleAnsGet(i);
						System.out.println(multiChoice[count]);
						System.out.println(object1.text());
						answer = object2.textAnsGet(i);
						System.out.println(answer);
					}
					break;
				}
				System.out.println("Do you want to continue(y/n)");
				choice = scan.next().charAt(0);
			} while (choice == 'y'); // While user chooses to continue
		} catch (IOException e) {
			System.out.println("Exception handled");
		}
	}
}
