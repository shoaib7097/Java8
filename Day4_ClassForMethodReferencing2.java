
public class Day4_ClassForMethodReferencing2 
{
	 void show()
	    {
	      InterfaceA x=new Day4_ClassForMethodReferncing1():: normalMethod; //normal method referencing
	      x.method();
	      
	      InterfaceA y= Day4_ClassForMethodReferncing1 :: staticMethod;//static method referencing
	      y.method();
	      
	      InterfaceA z= Day4_ClassForMethodReferncing1 :: new;//Constructor referencing
	      z.method();
	      
//	      InterfaceA paracon=ClassForMethodRefrencing::new;//method referencing for parameterized constructor
//	      paracon.method(90);
	    }
	    public static void main(String[] args)
	    {
			new Day4_ClassForMethodReferencing2().show();
		}
}
