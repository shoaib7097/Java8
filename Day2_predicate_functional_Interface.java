import java.util.function.Predicate;

public class Day2_predicate_functional_Interface 
{
	   /*   ========
			Predicate
			========

			-> It is predefined Functional interface

			-> It is used check condition and returns true or false value

			-> Predicate interface having only one abstract method that is test (T t)


						interface Predicate{
							boolean test(T t);
						}		
        */

			// Predicate Example

     public static void main(String[] args) 
	 {
					Predicate<Integer> p = i -> i > 10;
					System.out.println(p.test(5));
					System.out.println(p.test(15));
	 }
}
