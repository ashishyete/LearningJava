package com.learn.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Thread thread = new Thread(new Task());
		for(int i=0;i<10;i++) {
			executor.submit(thread);
			if(i%2==0)
			thread.sleep(2000);	
		}
		
		Runnable task = ()-> System.out.println("Helo tread");
		new Thread(task).start();
	}
	
}

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Starting Thread with Thead Number : "+Thread.currentThread().getName() + " Random Seq : "+Util.getRandomNum());
	}
	
}

class Util{
	public static int getRandomNum() {
		return (int)((Math.random()*90000)+10000);
	}
}