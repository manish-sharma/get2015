/* The TowerOfHanoi program implements an application that
* solve the problem of Tower of Hanoi.
* @author  Neha Bansal
* @version 1.0
* @since   2015-08-13
*/
import java.util.ArrayList;
import java.util.List;


public class GeneratePermutation
{
	/*It return the list of string of all possible permutation of given string.
	 *
	 * @param input
	 * @param index
	 * @param list
	 * @return list
	 */
	public List<String>  generatePermutation(String input,int index,List<String> list)
	{
	    int temp=0;	
		if(index==input.length()-1)
		{
			for (int i = 0; i < list.size(); i++)
				if(list.get(i).equals(input))
					temp=1;
			if(temp==0)
			list.add(input);
			return list;
			}
		
		String str="";
		for(int i=index;i<input.length();i++)
		{
			str=swap(input,index,i);
			list=generatePermutation(str,index+1,list  );
			}
		return list;
		
	}
	
	//below code is used to swap character in a string at i position with character at j  position.
	public String swap(String str,int i,int j)
	{
		if(i==j)
			return str;
		if(j!=str.length()-1)
		str=str.substring(0, i)+str.charAt(j)+str.substring(i+1, j)+str.charAt(i)+str.substring(j+1);
		else
			str=str.substring(0, i)+str.charAt(j)+str.substring(i+1, j)+str.charAt(i);
		
		return str;
		
		
	}
	public static void main(String args[])
	{
		GeneratePermutation ab=new GeneratePermutation();
		List<String> list = new ArrayList<String>(); 
		list=ab.generatePermutation("abc", 0,list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
