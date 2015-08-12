
public class Assignment2 {

	private String outputString[];
	private  int count;
	
	/**
	 * @param number
	 * @return factorial
	 */
	private int factorial(int number){
		if(number<2)
			return 1;
		else
			return number*factorial(number-1);
	}
	
	/**
	 * @param Input String for which you wish to have combinations
	 * @return different combinations of string
	 */
	public String[] generatePermutations(String Input){
		String PrefixString="";
		count=0;
		outputString=new String[factorial(Input.length())];
		recusiveFunctionForPermutation(PrefixString, Input);
		return outputString;
	}

	/**
	 * @param PrefixString
	 * @param input
	 */
	private void recusiveFunctionForPermutation(String PrefixString, String input){
		int length=input.length();
		if(length==0)
			outputString[count++]=PrefixString;
		else
		{
			for(int count=0;count<length;count++)
				recusiveFunctionForPermutation(PrefixString+input.charAt(count), input.substring(0,count)+input.substring(count+1,length));  
		}
	}
}




