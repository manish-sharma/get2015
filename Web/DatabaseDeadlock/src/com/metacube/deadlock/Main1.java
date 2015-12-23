package com.metacube.deadlock;

public class Main1 {

	static JDBCHelper JDBCHelper = new JDBCHelper();

	public static void main(String args[]) {
		Thread1 t1 = new Thread1();

		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}

	private static class Thread1 extends Thread {
		public void run() {
			
			JDBCHelper.deadlock1();
		}
	};

	private static class Thread2 extends Thread {
		public void run() {
			
			JDBCHelper.deadlock2();
		}
	};

}