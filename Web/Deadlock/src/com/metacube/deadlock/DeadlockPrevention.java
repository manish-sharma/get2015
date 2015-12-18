package com.metacube.deadlock;

/**
 * 
 * @author Sumitra
 * this java class is used to prevent deadlock condition
 * here there threads running at a time and holding two object 
 * when a thread is in sleep mood next thread come to run but the one of two object passed with
 * that thread is holding by other thread which in waiting state
 * so it occur deadlock condition to handle this it release the lock on every object after performing its operation
 *
 */
public class DeadlockPrevention {


	public static void main(String[] args) throws InterruptedException {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		Thread thread1 = new Thread(new SyncThread1(obj1, obj2), "thread1");
		Thread thread2 = new Thread(new SyncThread1(obj2, obj3), "thread2");
		Thread thread3 = new Thread(new SyncThread1(obj3, obj1), "thread3");

		thread1.start();
		Thread.sleep(50);
		thread2.start();
		Thread.sleep(50);
		thread3.start();
		Thread.sleep(50);

	}

}

class SyncThread1 implements Runnable {
	private Object obj1;
	private Object obj2;

	public SyncThread1(Object obj12, Object obj22) {
		this.obj1 = obj12;
		this.obj2 = obj22;
	}

	
	@Override
	public void run() {
	    String name = Thread.currentThread().getName();
	    System.out.println(name + " there is lock on  first obj of thread running currently before synchronization " + obj1);
	    synchronized (obj1) {
	        System.out.println(name + " there is lock on first obj of thread running currently after synchronization " + obj1);
	        work();
	    }
	    System.out.println(name + " released lock on first obj of thread running currently after synchronization to prevent deadlock " + obj1);
	    System.out.println(name + " there is lock on second obj of thread running currently before synchronization " + obj2);
	    synchronized (obj2) {
	        System.out.println(name + " there is lock on second obj of thread running currently after synchronization " + obj2);
	        work();
	    }
	    System.out.println(name + " released lock on second obj of thread running currently after synchronization to prevent deadlock  " + obj2);
	 
	    System.out.println(name + " finished execution.");
	}
	
	private void work() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

