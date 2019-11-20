package com.learn.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample {

	// ScheduledThreadPool uses Delay Queue

	public static void main(String[] args) {

		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		
		for (int i = 0; i < 100; i++) {

			//service.schedule(new ScheduledThreadPool(),10,TimeUnit.SECONDS);
			service.scheduleAtFixedRate(new ScheduledThreadPool(), 5, 10, TimeUnit.SECONDS);
		}

	}
}

class ScheduledThreadPool implements Runnable {

	public void run() {
		System.out.println("Currently Running Thread : " + Thread.currentThread().getName());
	}
}