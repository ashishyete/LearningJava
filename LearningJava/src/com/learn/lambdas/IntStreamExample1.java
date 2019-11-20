package com.learn.lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExample1 {

	public static void main(String[] args) throws IOException {

		IntStream.range(1, 10).skip(5).forEach(System.out::print);
		System.out.println("-------------------------");
		System.out.println(IntStream.range(1, 5).sum());

		Stream.of("AAva", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);
		System.out.println("----");
		Stream.of("Ava", "Aneri", "Alberto", "Nidhi", "Deepak").filter(p -> p.startsWith("D")).sorted().findFirst()
				.ifPresent(System.out::println);
		System.out.println("---------------------------");

		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(p -> p * p).average().ifPresent(System.out::println);

		String [] strArr = {"Ava","Aneri","Alberto","Nidhi","Deepak"};
		List<String> strList = Arrays.asList(strArr);
		System.out.println("--------------------------");
		strList.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("--------------------------");
		Stream<String> bands = Files.lines(Paths.get("bands.txt")); 
		bands.sorted().filter(p->p.contains("Roll")).findFirst().ifPresent(System.out::println);
		System.out.println("--------------------------");
		List<String> bandList = Files.lines(Paths.get("bands.txt")).filter(c->c.startsWith("A")).sorted().collect(Collectors.toList());
		bandList.forEach(System.out::println);
		System.out.println("--------------------------");
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		int rowCount = (int) rows1.map(p->p.split(","))
				.filter(p->p.length==3)
				.count();
		System.out.println(rowCount);
	}
}
