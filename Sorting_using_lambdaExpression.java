import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_using_lambdaExpression //implements Comparator<Integer>
{
	
	/*
	 This is  one of the ways to sort
	 public int compare(Integer num1,Integer num2)
	{
		if(num1<num2)
		{
			return -1;
		}
		else if(num1>num2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
		How sorting work internally?
		ans:If object1 has to come before object2 it will return -1
		    If object1 has to come after object2 it will return 1
		    If object1 and object2 are equal it will return 0
		*/
	
	 /*This is the 2nd way to sort by using conditional statement
	  public int compare(Integer num1,Integer num2)
	  {
	    return (num1<num2)?-1:(num1>num2)?1:0;
	  }
	  */
	  
	  
  public static void main(String[] args) 
  {
    ArrayList<Integer>	al=new ArrayList<Integer>();
    al.add(20);
    al.add(40);
    al.add(10);
    al.add(0);
    al.add(16);
    al.add(100);
    al.add(105);
    System.out.println("Before sorting");

    System.out.println(al);
    
    //System.out.println("After sorting");
    //Collections.sort(al);This is sort in natural defining order(ascending order) here parameter we should have to pass only list implementation class
    //Collections.sort(al,new Sorting_using_lambdaExpression());//This is the way to customized the sorting order we need to pass collection class reference and object of the class where comparator interface implements
    System.out.println("sorting in descending order using lambda expression");
    Collections.sort(al,(num1,num2)->(num1>num2)?-1:(num1<num2)?1:0);
    
    System.out.println(al);
  }

}
