package com.learn.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExample {
	
	// Fixed thread Pool uses Blocking Queue internally
	// Blocking Queue is Thread Safe.

	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		for (int i = 0; i < 10; i++) {
			service.execute(new FixedThreadPool());
		}
		
		if(!service.isShutdown()) {
			Thread.sleep(100);
			System.out.println("Executor Service is still Running! :: Now shutting down.");
			service.shutdown();
		}
	}

}

class FixedThreadPool implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Running : " + Thread.currentThread().getName());
	}

}
