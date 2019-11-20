/**
 * 
 */
package com.learn.threads;

/**
 * @author AC03582
 *
 */
public class ThreadEx3 implements Runnable {

	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(i);

			try {

				Thread.sleep(2000);
				Thread.interrupted();
			} catch (InterruptedException ex) {
				System.out.println("I'm interrupted");
			}
		}
	}

	public static void main(String[] args) {
		Runnable task = new ThreadEx3();
		Thread thread = new Thread(task);
		thread.start();
	}
}
