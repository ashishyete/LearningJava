package com.learn.general;

public class PassByValExample {

	int data = 50;

	public void modify(int data) {
		data = data + 100;
	}
	
	public void modifyByObj(PassByValExample obj) {
		obj.data = obj.data+90;
	}

	public static void main(String[] args) {
			
		PassByValExample obj =  new PassByValExample();
		obj.modify(500);
		System.out.println(obj.data);
		obj.modifyByObj(obj);
		System.out.println(obj.data);
		//obj.sayHello();
	}
	
	public void sayHello() {
		System.out.println("Hello");
	sayHello();
	}

}
