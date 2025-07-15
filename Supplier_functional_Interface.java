import java.util.function.Supplier;

public class Supplier_functional_Interface
{
	       /*
	        ==========================
			Supplier Functional Interface
			==========================

			-> Supplier is a predefined functional interface introduced in java 1.8v

			-> It contains only one abstract method that is get ( ) method

			-> Supplier interface will not take any input, it will only returns the value.

			Ex:
			----
			OTP Generation
			
			*/

		public static void main(String[] args) 
		{
		  Supplier<String> s = () -> 
		  {
			String otp = "";
			for (int i = 1; i <= 6; i++)
			{
			otp = otp + (int) (Math.random() * 10);
		    }
			return otp;
		};

					System.out.println(s.get());
					System.out.println(s.get());
					System.out.println(s.get());
					System.out.println(s.get());
					System.out.println(s.get());
					System.out.println(s.get());
				
			}

}
