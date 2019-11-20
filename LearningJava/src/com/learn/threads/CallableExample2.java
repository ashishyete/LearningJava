package com.learn.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		Callable<Object> call = new CallableEx2();
		FutureTask<Object> ft = new FutureTask<>(call);
		
		Thread t = new Thread(ft);
		t.start();
		System.out.println(t.getName());
		System.out.println(ft.get());
		
		Thread t1=  new Thread(new RunnableEx2());
		t1.start();
		
	}
}

class CallableEx2 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		String str ="Returning message from CallableEx2";
		return str;
	}	
}
class RunnableEx2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Calling Runnable from Runnable Ex2");
	}
	
}


