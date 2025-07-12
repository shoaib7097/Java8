import java.util.function.Predicate;

public class Day2_Predicate_program2 
{
 /*
  * Task: Declare names in an array and print names which are starting with 'A' using lambda expression.

		String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };
*/
	public static void main(String[] args) {

		String[ ] names = { "Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };

		Predicate<String> p = name -> name.charAt(0) == 'A';

		for (String name : names)
		{
			if ( p.test(name) ) 
			{
				System.out.println(name);
			}
		}
	}
}
