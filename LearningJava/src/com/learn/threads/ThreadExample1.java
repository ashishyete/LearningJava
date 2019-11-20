package com.learn.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample1 {

	public static void main(String[] args) throws InterruptedException {
		
		int numOfCores = Runtime.getRuntime().availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(numOfCores);
		
		for(int i=0;i<10;i++) {
			service.execute(new MyTask());
		//Thread t = new Thread(new MyTask());
		//t.start();
		//Thread.sleep(100);
		}
	}
	
}

class MyTask implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread Name : " + Thread.currentThread().getName());
	}
}
