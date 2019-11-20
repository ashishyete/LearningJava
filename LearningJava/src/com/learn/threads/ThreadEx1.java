/**
 * 
 */
package com.learn.threads;

/**
 * @author AC03582
 *
 */
public class ThreadEx1 extends Thread {

	/**
	 * @param args
	 */
	public void run() {
		System.out.println("Thread Started : "+Thread.currentThread().getName() );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1 t = new ThreadEx1();
		t.start();
	}

}
