package com.learn.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<Object> call = new DemoCallable();
		FutureTask<Object> ft = new FutureTask<>(call);
		
		Thread t = new Thread(ft);
		t.start();
		
		System.out.println(ft.get().toString());
		
	}

}

class DemoCallable implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		
		return "call method invoked from Demo Callable";
	}
	
}
