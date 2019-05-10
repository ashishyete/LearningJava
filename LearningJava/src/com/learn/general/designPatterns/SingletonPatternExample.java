package com.learn.general.designPatterns;

public class SingletonPatternExample {

	public static void main(String[] args) {
		System.out.println(SingletonPattern.getInstance().hashCode());
	}
}

class SingletonPattern {

	private static volatile SingletonPattern _instance;

	private SingletonPattern() {
	}

	public static SingletonPattern getInstance() {
		if (_instance == null) {
			synchronized (SingletonPattern.class) {
				if (_instance == null)
					_instance = new SingletonPattern();
			}
		}
		return _instance;
	}

}
