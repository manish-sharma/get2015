package multithreading;
 class JoinExample1 extends Thread {
	 
	public void run()
	{
		 for(int i = 1 ; i<=5; i++ )
		 {
			 try {
				Thread.sleep(500);
				System.out.println(this.getName()+" "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
		 }
	}
}	
 class JoinExample2 extends Thread {
	 
	public void run()
	{
		 for(int i = 1 ; i<=5; i++ )
		 {
			 try {
				Thread.sleep(500);
				System.out.println(this.getName()+" "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
		 }
	}
}	
 class JoinExample3 extends Thread {
	 
	public void run()
	{
		 for(int i = 1 ; i<=5; i++ )
		 {
			 try {
				Thread.sleep(500);
				System.out.println(this.getName()+" "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
		 }
	}
}	

public class JoinExample extends Thread {
	 

	
	public static void main(String[] args) {
		JoinExample1 j1 =  new JoinExample1();
		JoinExample2 j2 =  new JoinExample2();
		JoinExample3 j3 =  new  JoinExample3();
	
		j1.start();
		j2.start();
		try {
			j1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j3.start();
	}

}


