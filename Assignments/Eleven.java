package Assignments;

import java.util.stream.IntStream;

public class Eleven 
{
	public static void main(String[] args) {
		
		
		IntStream il=IntStream.range(1, 10);
		il.forEach(System.out::println);
		System.out.println("parallel stream number");
		IntStream i2=IntStream.range(1, 10);
		i2.parallel().forEach(System.out::println);
		
	}

}
