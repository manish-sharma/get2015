
public class Assignment1 {

	//Method for adding spaces
	public static String spaces(int row,int n){
		int a=0;
		String spaceCount= new String();
		for(int i=n;i>row;i--)
		{
			spaceCount=spaceCount + " ";
		}
		return spaceCount;

	}

	//Method for adding values
	public static String number(int row, int n){

		String valCount=new String();
		for(int i=1;i<=row;i++){
			valCount=valCount+i;
		}
		for(int i=row-1;i>=1;i--){
			valCount=valCount+i;
		}
		return valCount;

	}

	//Method to print pattern
	public static String[] printWholePyramid(int n){
		int a=0;
		String [] finalPattern= new String[(2*n)-1];
		for(int i=1;i<=n;i++){
			finalPattern[a]=spaces(i,n)+number(i, n);
			a++;
		}
		for(int i=4;i>=1;i--){
			finalPattern[a]=spaces(i,n)+number(i, n);
			a++;
		}

		return finalPattern;

	}
}
