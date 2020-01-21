package com.thread.appleobject;

class A implements Runnable {
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B implements Runnable {
	public void run(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		A obj = new A();
		B obj1 = new B();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();
		try{Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		
	

	}

}
