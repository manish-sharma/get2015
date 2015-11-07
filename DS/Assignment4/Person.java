package ds4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**this class is use to hold the data of person
 * @author Khemanshu
 *
 */
public class Person {

	// name of the person
	String name;
	//age of the person
	int age;
	
	/**get the name of the person
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	String inputName(){
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		return name;
	}
	/** set the name of the person
	 * @param name
	 */
	public void setName() {
		this.name = inputName();
	}
	
	/**get the age of person
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
	int inputAge() {
		Scanner scanner = new Scanner(System.in);
		int number;
		try{
			number = scanner.nextInt();
			if(number<=0){
				System.out.println("age can't be equal to or less than 0. enter correct age");
				number = inputAge();
			}
			return number;
		}
		catch(InputMismatchException e){
			System.out.println("kindly enter age in integer only");
			number = inputAge();
		}
		return 0;
	}
	/**set the age of person
	 * @param age
	 */
	public void setAge() {
		this.age = inputAge();
	}
	
}
