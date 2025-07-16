import java.util.function.BiFunction;

public class Day4_Bifunction_functional_Interface 
{
	       /* 
	        ========================================================
			Task : Take 2 inputs and perform sum of two inputs and return output
			=======================================================
			*/

   public static void main(String[] args)
   {
	   BiFunction<Integer, Integer,Integer>  bifunc=(a,b)->a+b;
	   int a=bifunc.apply(10, 20);
	   System.out.println(a);
   }
}
