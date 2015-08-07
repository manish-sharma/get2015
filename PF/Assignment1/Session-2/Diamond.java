import java.util.Scanner;
public class Diamond {
	public static void main(String[] args) {
		int m, n, j;
		Diamond object2 = new Diamond();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows. ");
		n = sc.nextInt();
		m = 2*n-1;
		String[] result = new String[m];
		result = object2.printDiamond(n);
		for(j=0;j<m;j++){
			System.out.println(result[j]);
		}
		sc.close();
	}
	String[] printDiamond(int n){
		String spaceStr, digitStr, arrayRow;
		int m = 2*n-1;
		String[] output = new String[m];
		int i, j=0;
		for(i=1;i<=n;i++){
			spaceStr = spaces(i,n);
			digitStr = digits(i,n);
			arrayRow = spaceStr + digitStr;
			output[j] = arrayRow;
			j++;
		}
		for(i=n-1;i>=1;i--){
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
		for(int j=0;j<n-i;j++)
			temp = temp + " ";
		return temp;
	}
	public static String digits(int i, int n){
		String temp = "";
		int j;
		for(j=1;j<=i;j++)
			temp = temp + j;
		for(j=i-1;j>=1;j--)
			temp = temp + j;
		return temp;
	}
}
