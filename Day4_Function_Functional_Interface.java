import java.util.function.Function;

public class Day4_Function_Functional_Interface
{
	/*
     =========================
     Function Functional Interface
     =========================

    -> Function is predefined functional interface

   -> Function interface having one abstract method i.e apply(T r)

		interface Function<R,T>
		{
			R apply (T t);
		}	

   -> It takes input and it returns output
  */

	public static void main(String[] args) 
	{
		Function<String, Integer> f = (name) -> name.length();

		System.out.println(f.apply("ashokit"));
		System.out.println(f.apply("hyd"));
		System.out.println(f.apply("sachin"));

	}
}

