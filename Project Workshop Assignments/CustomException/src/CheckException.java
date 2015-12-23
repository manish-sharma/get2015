
public class CheckException {

	 public static void main(String args[]){
		 try{
			 testException("Shishir");
		 }
		 
		 catch(CustomException e){
			 e.printStackTrace();
		 }
	 }
	 
	 public static void testException(String string) throws CustomException{
		 if(string==null){
			 throw new CustomException("The String value is null");
		 }
		 
		 else{
			 System.out.println("Keep calm Everything is all right");
		 }
	 }
}
