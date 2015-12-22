package demo;

/**
 * Class to differentiate String, StringBuilder and StringBuffer
 * @author Arushi
 *
 */
public class TestString {

	public static void main(String[] args) {
		//Checking for strings
		String  string = " java " ;
		// It can't be modified
		System.out.println(string.hashCode()+"--------------------------"+string);


		string="C" ;     //when we replace it with other value ,new object is created
		System.out.println(string.hashCode()+"--------------------------"+string);
		//Checking for string buffers
		StringBuffer stringBuffer = new StringBuffer("stringBuffer") ;
		// The above object stored in heap and its value can be changed .
		System.out.println(stringBuffer.hashCode()+"--------------------------"+stringBuffer.append('h'));
		//now checking for hash code
		System.out.println(stringBuffer.hashCode()+"--------------------------");
		
		//Checking for string builders
		StringBuilder stringBuilder= new StringBuilder("stringBuilder");
		// The above object too is stored in the heap and its value can be modified
		System.out.println(stringBuilder.hashCode()+"--------------------------"+stringBuilder.append('h'));
		System.out.println(stringBuilder.hashCode()+"--------------------------");
		
		stringBuilder=new StringBuilder("newObject"); 
		// Above statement is right as it modifies the value which is allowed in the StringBuilder
		System.out.println(stringBuilder.hashCode()+"--------------------------"+stringBuilder);
	}

}
