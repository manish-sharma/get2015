
public class Thread1 implements Runnable{
 
		public void run() {
			synchronized (DeadlockExample.rc1) {
				System.out.println(DeadlockExample.rc1);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (DeadlockExample.rc2){
					DeadlockExample.rc2+=DeadlockExample.rc1;
					System.out.println(DeadlockExample.rc2);
				}
				
			}
		}
}
