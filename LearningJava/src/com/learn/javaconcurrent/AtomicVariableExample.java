package com.learn.javaconcurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AtomicVariableExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executorSvc = Executors.newFixedThreadPool(2);
		ExampleClass ex = new ExampleClass();
		
		Runnable runnable1 = () ->{
			for(int i=0;i<10000;i++) {
				ex.increment();
			}
		};
		
		Runnable runnable2= ()->{
			for(int i=0;i<10000;i++) {
				ex.increment();
			}
		};
		
		executorSvc.execute(runnable1);
		executorSvc.execute(runnable2);
		executorSvc.awaitTermination(1, TimeUnit.SECONDS);
		
		System.out.println("Counter Val : "+ex.getVal());
	}

}


class ExampleClass{
	
	private volatile int counter;
	
	public int getVal() {
		return counter;
	}
	
	public synchronized int increment() {
		return this.counter++;
	}
	
}