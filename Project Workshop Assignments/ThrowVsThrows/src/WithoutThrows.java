import java.io.IOException;


public class WithoutThrows {
	void mymethod(int num){ 
	     if(num==1)
			try {
				throw new IOException("Exception Message1");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			try {
				throw new ClassNotFoundException("Exception Message2");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  } 
	} 

	class Demo2{ 
	  public static void main(String args[]){ 
	   try{ 
	     WithoutThrows obj=new WithoutThrows(); 
	     obj.mymethod(1); 
	   }catch(Exception ex){
	     System.out.println(ex);
	    } 
	  }
}
