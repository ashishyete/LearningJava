package com.learn.threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerDesignExample {

	
	public static void main(String[] args) {
		
		BlockingQueue sharedQueue = new LinkedBlockingQueue();
		 
	     //Creating Producer and Consumer Thread
	     Thread prodThread = new Thread(new Producer(sharedQueue));
	     Thread consThread = new Thread(new Consumer(sharedQueue));

	     //Starting producer and Consumer thread
	     prodThread.start();
	     consThread.start();
		
	}
}

class Producer implements Runnable {

	private final BlockingQueue<Integer> sharedQueue;

	public Producer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Produced: " + i);
				sharedQueue.put(i);
			} catch (InterruptedException ex) {
				System.out.println(Producer.class.getName() + " -- " + ex);
			}
		}

	}
}

class Consumer implements Runnable {
	private final BlockingQueue<Integer> sharedQueue;

	public Consumer(BlockingQueue<Integer> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	public void run() {
		while (true) {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("Consumed : "+sharedQueue.take());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}