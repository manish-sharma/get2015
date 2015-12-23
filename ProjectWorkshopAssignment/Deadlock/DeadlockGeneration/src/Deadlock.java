/**This class shows that how deadlock is generated in multi-threading 
 * 
 * @author Riddhi
 *
 */
public class Deadlock extends Thread {
   public static Object l1 = new Object();
   public static Object l2 = new Object();
   private int index;
   public static void main(String[] a) {
      Thread t1 = new Thread1();
      Thread t2 = new Thread2();
      t1.start();
      t2.start();
   }
   /**This is a static class and hence does not need the main method and in it thread 1 accquires lock on resource hence making it unavailable for 

   private static class Thread1 extends Thread {
      public void run() {
         synchronized (l1) {
            System.out.println("Thread 1: Holding lock 1...");
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 1: Waiting for lock 2...");
            synchronized (l2) {
               System.out.println("Thread 2: Holding lock 1 & 2...");
            }
         }
      }
   }
   /**This is a static class and hence does not need the main method and in it thread 2 acquires lock on resource hence making it unavailable for 

   private static class Thread2 extends Thread {
      public void run() {
         synchronized (l2) {
            System.out.println("Thread 2: Holding lock 2...");
            try { Thread.sleep(10); }
            catch (InterruptedException e) {}
            System.out.println("Thread 2: Waiting for lock 1...");
            synchronized (l1) {
               System.out.println("Thread 2: Holding lock 2 & 1...");
            }
         }
      }
   }
}
