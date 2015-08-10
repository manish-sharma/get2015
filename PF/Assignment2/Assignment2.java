
public class Assignment2 {
	//Method for adding spaces
	static String spaces(int row,int n){
		String space=new String();
		for(int i=1;i<=row-1;i++){
			space=space+" ";
		}
		return space;

	}

	//Method for adding values
	static String number(int row, int n){
		String val= new String(); 
		for(int i=1;i<=n+1-row;i++){
			val=val+i;
		}
		return val;

	}

	//Method to print pattern
	static String[] printWholePattern(int n){
		int a=0;
		String [] finalPrint= new String[n];
		for(int i=1;i<=n;i++){
			finalPrint[a]=spaces(i,n)+number(i, n);
			a++;
		}
		return finalPrint;
	}
}
