package com.learn.lambdas;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface MyAddInterface {
	public int add(int a, int b);
}

interface MySafeDivisionInterface{
	public int div(int a,int b);
}


public class LambdaExpression1 {

	public int addOperation(MyAddInterface myinter, int a, int b) {
		return myinter.add(a, b);
	}
	public int divOperation (MySafeDivisionInterface myinter, int a, int b) {
		return myinter.div(a, b);
	}

	public static void main(String[] args) {
		
		MyAddInterface myinterface = (int a,int b)-> a+b;
		System.out.println("Addition Result is : "+myinterface.add(10, 20));
		
		MySafeDivisionInterface mySafeDivInteface = (int a,int b)->{
			if(b==0)
				return 0;
			return a/b;
		};
		System.out.println("Division Result is : "+ mySafeDivInteface.div(10, 0));
		
		
		List<String> ll = new ArrayList<String>();
		
		for(int i=0;i<20;i++) {
			ll.add("User-"+i);
		}
		
		ll.stream().filter(x->!x.equals("User-2")).forEach(System.out::println);
		
	}
	
}