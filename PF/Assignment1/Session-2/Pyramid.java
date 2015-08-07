import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		int n, j;
		Pyramid object1 = new Pyramid();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows. ");
		n = sc.nextInt();
		String[] result = new String[n];
		result = object1.printPyramid(n);
		for(j=0;j<n;j++){
			System.out.println(result[j]);
		}
		sc.close();
	}
	String[] printPyramid(int n){
		String spaceStr, digitStr, arrayRow;
		String[] output = new String[n];
		int i, j=0;
		for(i=1;i<=n;i++){
			spaceStr = spaces(i,n);
			digitStr = digits(i,n);
			arrayRow = spaceStr + digitStr;
			output[j] = arrayRow;
			j++;
		}
		return output;		
	}
	public static String spaces(int i, int n){
		String temp = "";
		for(int j=1;j<i;j++)
			temp = temp + " ";
		return temp;
	}
	public static String digits(int i, int n){
		String temp = "";
		int j;
		for(j=1;j<=n-i+1;j++)
			temp = temp + j;
		return temp;
	}
}
