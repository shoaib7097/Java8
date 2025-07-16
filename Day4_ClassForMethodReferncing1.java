import java.util.ArrayList;

public class Day4_ClassForMethodReferncing1 
{
	 void normalMethod()
     {
    	ArrayList<Object> al=new ArrayList<Object>();
    	al.add(21);
    	al.add("Shoaib");
    	al.add(23);
    	al.add(50);
    	System.out.println(al);
     }
     static void staticMethod()
     {
    	 System.out.println("This is static method");
     }
     Day4_ClassForMethodReferncing1()
     {
    	 System.out.println("This is constructor");
     }
     Day4_ClassForMethodReferncing1(int Y)
     {
    	 System.out.println("parameterized constructor");
     }
}
