package com.learn.threads;

public class ThreadEx2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		Runnable r = new ThreadEx2();
		Thread t = new Thread(r);
		t.start();
	}

}
