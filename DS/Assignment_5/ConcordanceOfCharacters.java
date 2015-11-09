package assignmentDS_5;
/**
 * below method is to create a concordance of characters occurring in a string 
 * (i.e which characters occur where in a string). 
 * @author  Neha Bansal
 * @version 1.0
 * @since   2015-09-2
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//class ConcordanceOfCharacters 
class ConcordanceOfCharacters 
{
	HashMap<String,ArrayList<Integer> >hashMap;
	public ConcordanceOfCharacters ()
	{
		hashMap=new HashMap<String,ArrayList<Integer> >(); 
			
	}
	
	/**
	 * below method is to create concordance of characters occurring in a string 
	 * @param str :string whose concordance of characters is to be created
	 */
	public void findConcordanceOfCharacters(String str)
	{
		int i=0;
		ArrayList<Integer> arrayList;
		while(i<str.length())
		{
			String chAtIthPosition=str.substring(i,i+1);
			if(hashMap.containsKey(chAtIthPosition))
			{
				arrayList=hashMap.get(chAtIthPosition);
			}
			else
			{
				arrayList=new ArrayList<Integer>();
			}
			arrayList.add(i);
				hashMap.put(chAtIthPosition,arrayList);
				i++;
		}
		
	}
	
	/**
	 * below method is to print concordance of characters in given String
	 */
	public void show()
	{
		Set set = hashMap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) 
		{
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("\n\nCharacter : " + mentry.getKey()+"   Position : ");
			ArrayList<Integer> a1 = (ArrayList<Integer>) mentry.getValue();
			Iterator itr = a1.iterator();
			while (itr.hasNext()) 
			{
				System.out.print(" "+itr.next());
			
			}
			
		}
	}
	public static void main(String args[])
	{
		ConcordanceOfCharacters concordanceOfCharacters=new ConcordanceOfCharacters();
		concordanceOfCharacters.findConcordanceOfCharacters("helloutteev");
		concordanceOfCharacters.show();
		
	}
}
