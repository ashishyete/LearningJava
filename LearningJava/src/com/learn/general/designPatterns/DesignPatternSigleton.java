package com.learn.general.designPatterns;

public class DesignPatternSigleton {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(DPSingleton.getSingletonInstance().hashCode());
		}
	}
	
}

class DPSingleton {
	private volatile static DPSingleton _instance;

	private DPSingleton() {
	}

	public static DPSingleton getSingletonInstance() {
		if (_instance == null) {
			synchronized (DPSingleton.class) {
				if (_instance == null) {
					_instance = new DPSingleton();
				}
			}
		}
		return _instance;
	}
}
