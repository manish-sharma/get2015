/*
 * This program prints the concordance of all character of a string
 * String should be given by command line
 */
public class Concordance {
	
	/*
	 * This method for checking a specific character is present in string or not
	 * 
	 */
	public boolean containsChar(String s, char search) {
	    if (s.length() == 0)
	        return false;
	    else
	        return s.charAt(0) == search || containsChar(s.substring(1), search);
	}
	
	public static void main(String [] arg) 
	{
		Concordance obj = new Concordance();
		String str ="";
		//merge all command line tokens into a string s 
		for ( String string : arg)
		{
			str = str+string;
		}	
		
		//Now check all  character present in string and print index where present 
		for(int i=0 ; i<256; i++)
		{ 
			if( obj.containsChar(str,(char)i) )
			{
			    System.out.print("\n"+(char)i+" = ");
		        for(int j=0 ; j<str.length(); j++)
		        {
		    	    if( str.charAt(j) == (char)i)
		    		System.out.print(" "+j);
		        }			
		   }
		}
		
	}

}
