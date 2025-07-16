import java.util.TreeSet;

public class SortingInTreeSet_Using_lambdaExp 
{
  public static void main(String[] args) 
  {
	  TreeSet<Integer> ts=new TreeSet<Integer>((num1,num2)->(num1>num2)?-1:(num1<num2)?1:0);//passing lambda exp to sort in desc order
	  ts.add(10);
	  ts.add(15);
	  ts.add(11);
	  ts.add(49);
	  ts.add(29);
	  ts.add(38);
	  ts.add(50);

	  System.out.println("After sorting by using lambda expression");
	  System.out.println(ts);
	  
	  /*tree set has predefined natural sorting order but if we want to sort according to our requirement we need to
	    implement comparator interface as comparator interface is functional interface so we can write lambda expression
	    of compare method 
	   */
}
}
