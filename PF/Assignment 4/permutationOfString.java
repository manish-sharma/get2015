import java.util.ArrayList;
import java.util.List;

/*This class finds all the possible permutation of the string*/
public class permutationOfString {
/*This function keeps track of which letters of string are already used through a boolean 
 * array where the letter which is used is set to true and it takes the input string as
 * argument*/
	public List<String> permute(String input){
		/*variable for keeping the input length*/
		int inputLength = input.length();
		/*boolean array for keeping check of character*/
		boolean[] usedCharacter = new boolean[inputLength];
		/*string buffer to keep the string for appending the output*/
		StringBuffer outputString = new StringBuffer();
		/*object of list type*/
		List<String> Result=new ArrayList<String>();
		/*converting input string into character array*/
		char in[]=input.toCharArray();
		Result=doPermutation(in,Result,outputString,usedCharacter,inputLength,0);
	    return Result;
	}

	/*This function performs the permutation of the input string and returns 
	 * the list of the string using recursive approach.It takes input string as character array
	 * StringBuffer as output String,boolean Array for keeping check of the used letter fixed,length of string,level as starting value
	 * to compare with the length of the inputLength*/
	private List<String> doPermutation(char[] in,List<String> Result, StringBuffer outputString, boolean[] usedCharacter, int inputLength, int level){
		
		/*if level is equal to inputLength reached the end of array*/
		boolean flag=false;
		if(level==inputLength)
		{
			/*to add value to List object*/
			for(String s : Result)
			{
			  if(s.equals(new String(outputString)))
			  {
			  flag = true;
			  break;
			  }
			}
			if(flag == false)
			Result.add(outputString.toString());
			return Result;
		}
		
		for(int index=0;index<inputLength;index++)
		{   
			/*if this condition is true than the characters is already fixed*/
			if(usedCharacter[index])
				continue;
			/*append to existing output string*/
			outputString.append(in[index]);
			/*when the character is used value is set to true in*/
			usedCharacter[index]=true;
			/*value so calculated is added the list object*/
		    doPermutation(in,Result, outputString,usedCharacter,inputLength,level+1);
			/*changing back the value of used character to false for using again*/
			usedCharacter[index]=false;
			/*value length of string is used*/
			outputString.setLength(outputString.length()-1);
		}
	  return Result;
	}
	
/*main function start here*/
public static void main(String args[]){
	List<String> result=new ArrayList<String>();//object of list type
	permutationOfString stringPermutation=new permutationOfString(); //object of class
	result=stringPermutation.permute("abb"); //object to hold the value of output
	for(int index=0;index<result.size();index++)
	{
		System.out.println(result.get(index));
	}
   }
}
	
	
	


