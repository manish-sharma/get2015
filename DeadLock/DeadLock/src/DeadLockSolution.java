

public class DeadLockSolution {
 
    static String str1 = "Java";
    static String str2 = "UNIX";
     
    public static void main(String args[]) {
    	Thread1 t1 = new Thread1();
    	Thread2 t2 = new Thread2();
    	t1.start();
    	t2.start();
    }
    private static class Thread1 extends Thread {
    	public void run() {
    		synchronized(str1) {
    		System.out.println("Thread 1: Holding str1...");
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 1: Waiting for str2...");
            synchronized (str2) {
               System.out.println("Thread 1: Holding str 1 & 2...");
            }
         }
    	}
    };
    
 private static class Thread2 extends Thread {
	 public void run() {
 		synchronized(str1) {
 		System.out.println("Thread 2: Holding str1...");
         try { Thread.sleep(10); }
         catch (InterruptedException e) {}
         System.out.println("Thread 2: Waiting for str2...");
         synchronized (str2) {
            System.out.println("Thread 2: Holding str 1 & 2...");
         }
      }
 	}
    };
   
     
    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                    synchronized(str1){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };
     
}
