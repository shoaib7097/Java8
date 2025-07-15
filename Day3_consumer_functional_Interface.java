import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Day3_consumer_functional_Interface 
{
	/*
	        ==========================
			Consumer Functional Interface
			==========================

			-> Consumer is predefined functional interface

			-> It contains one abstract method i.e accept (T t)

			-> Consumer will accept input but it won't return anything

			Note: in java 8 forEach ( ) method got introduced. forEach(Consumer consumer) method will take Consumer as parameter.
	*/

		public static void main(String[] args) 
		{

		    Consumer<String> c = (name) -> System.out.println(name + ", Good Evening");
            c.accept("Ashok");
		    c.accept("John");
			c.accept("Rani");

					List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
					// for loop
					// for each loop
					// iterator
					// list iterator
					
					numbers.forEach(i -> System.out.println(i));
				}
			}

