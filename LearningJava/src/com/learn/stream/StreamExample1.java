package com.learn.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample1 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Ashish", "ML",11000);
		Employee e2 = new Employee(2,"Biswa", "SSE",9000);
		Employee e3 = new Employee(3,"Amit", "PO",8000);
		Employee e4 = new Employee(4,"Rahul", "SE",7000);
		Employee e5 = new Employee(5,"Kiara", "SA",9500);
		
		List<Employee> ll = new ArrayList<>();
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		ll.add(e4);
		ll.add(e5);
		
		List<String> newlist = ll.stream()
		.sorted(Comparator.comparingInt(Employee::getEmpSal).reversed())
		.limit(3)
		.map(Employee::getEmpName)
		.collect(Collectors.toList());
		
		System.out.println(newlist);
		
	}
	

}
