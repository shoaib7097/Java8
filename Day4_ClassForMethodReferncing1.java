import java.util.ArrayList;

public class Day4_ClassForMethodReferncing1 
{
	/*Java8 introduce a new feature called method reference
	 *Method reference is an implementation of Functional interface
	 *It is a simple way of defining lambda expression
	 *If lambda expression required to provide implementation of existing method we use method reference
	 *NOTE=Argument type of existing method should match with functional interface method
	 
	 We can provide method reference of Static method(),Instance method,Constructor
	 
	 syntax for static method reference=>  functionalInterface_Name  reference=existingMethod_className :: existingMethodName;//write only method name don't write parenthesis
     syntax for Instance method reference=>functionalInterface_Name  reference=Create_existingMethod_ClassObject ::existingMethodName;
     syntax for Instance method reference=>functionalInterface_Name reference=existingConstructor_class_name :: new 
     Note=Refer "Day4_ClassForMethodReferencing2" class for better understanding of syntax 
     
     When we use method Referencing?
     whenever we are writing lambda expression of any existing method than no need to write  entire lambda expression 
     just refer that method using method referencing.
	 */
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
