import java.util.*;

/**
 * @author Sumitra
 * This program is create all the possible combination of string using recursion.
 *
 */
public class Permutation {
	static List<String> result;
	
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		result=new ArrayList<String>();
		Permutation objectOfPermutation=new Permutation();
		System.out.println("enter the string");
		String value=scan.next();
		result=objectOfPermutation.permutation(value);
		Iterator<String> itr=result.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		scan.close();
	}
	List<String> permutation( String value)
	{
		Permutation objectOfPermutation=new Permutation();
		result=objectOfPermutation.createPermutation("",value);
		Set<String> set = new HashSet<String>();
		set.addAll(result);
		result.clear();
		result.addAll(set);
		return result;
	}
	List<String> createPermutation(String prefix,String value)
	{
		int n=value.length();
		if(n==0)
		{
			result.add(prefix);
		}
		else
		{
			for(int i=0;i<n;i++)
			{
			createPermutation(prefix+value.charAt(i),value.substring(0, i)+value.substring(i+1, n));

			}
		}
		return result;
	}

}
