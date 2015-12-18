package com.metacube.deadlock;

/**
 * 
 * @author Sumitra
 * this java class is used to create deadlock condition
 * here there threads running at a time and holding two object 
 * when a thread is in sleep mood next thread come to run but the one of two object passed with
 * that thread is holding by other thread which in waiting state
 * so it occur deadlock condition
 *
 */
public class DeadlockOccurance {	
	public static void main(String[] args) throws InterruptedException {
		Object deadlockObj1 = new Object();
		Object deadlockObj2 = new Object();
		Object deadlockObj3 = new Object();

		Thread thread1 = new Thread(new SyncThread(deadlockObj1, deadlockObj2), "thread1");
		Thread thread2 = new Thread(new SyncThread(deadlockObj2, deadlockObj3), "thread2");
		Thread thread3 = new Thread(new SyncThread(deadlockObj3, deadlockObj1), "thread3");

		thread1.start();
		Thread.sleep(5000);
		thread2.start();
		Thread.sleep(5000);
		thread3.start();
		Thread.sleep(5000);

	}

}

   class SyncThread implements Runnable {
	private Object obj1;
	private Object obj2;

	public SyncThread(Object o1, Object o2) {
		this.obj1 = o1;
		this.obj2 = o2;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name);
		System.out.println(name + " there is lock on first obj of thread running currently before synchronization" + obj1);

		synchronized (obj1) {

			System.out.println(name + " there is lock on first obj of thread running currently after locking " + obj1);
			work();
			
			System.out.println(name + " there is lock on second  obj of thread running currently after locking" + obj2);
			synchronized (obj2) {
				//this part is never run due to deadlock no thread is reach here and all are waiting other thread
				System.out.println(name + " there is lock on obj of thread in deadlock " + obj2);
				work();
			}
			System.out.println(name + " released lock on obj " + obj2);
		}
		System.out.println(name + " released lock on obj " + obj1);
	
		System.out.println(name + " finished execution.final");
	}

	private void work() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


