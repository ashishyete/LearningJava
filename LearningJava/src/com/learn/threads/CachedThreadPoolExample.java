package com.learn.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExample {

	
	//Cached thread Pool Uses Synchronous Queue internally.
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		try {
		for(int i=0;i<100;i++) {
			service.execute(new CachedThreadPool());
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			service.shutdown();
		}
	}
}

class CachedThreadPool implements Runnable {

	@Override
	public void run() {
		System.out.println("Running Thread is : " + Thread.currentThread().getName());
	}
}
