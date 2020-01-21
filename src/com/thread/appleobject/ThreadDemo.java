package com.thread.appleobject;
public class ThreadDemo {

	public static void main(String[] args) {
	Thread t1 = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		try{Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		
	

	}

}
