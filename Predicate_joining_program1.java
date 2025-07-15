import java.util.ArrayList;
import java.util.function.Predicate;

/*
================
Predicate Joining
===============

-> To combine multiple predicates we will use Predicate Joining

and ( ) method

or ( ) method

*/

//Wap to print employees names who are working in "Hyderabad" location and 	"java" department
public class Predicate_joining_program1 
{
 String name;
 String location;
 String department;
 
 public Predicate_joining_program1(String name,String location,String department)
 {
    	this.name=name;
    	this.location=location;
    	this.department=department;
 }
 public static void main(String[] args) 
 {
   Predicate_joining_program1	obj1=new Predicate_joining_program1("Shoaib", "Hyderabad", "Java");
   Predicate_joining_program1	obj2=new Predicate_joining_program1("Ali", "Bihar", "Java");
   Predicate_joining_program1	obj3=new Predicate_joining_program1("Amer", "Hyderabad", "Pharmacy");
   Predicate_joining_program1	obj4=new Predicate_joining_program1("hasmuddin", "Hyderabad", "Java");
   
    ArrayList<Predicate_joining_program1> al=new ArrayList<Predicate_joining_program1>();
    al.add(obj1);
    al.add(obj2);
    al.add(obj3);
    al.add(obj4);
    
    Predicate<Predicate_joining_program1> p1=ObjectData->ObjectData.location.equals("Hyderabad");
    Predicate<Predicate_joining_program1> p2=ObjectData->ObjectData.department.equals("Java");
    
    
    Predicate<Predicate_joining_program1> p3=p1.and(p2);//predicate joining 
    //We can add any number of predicate like p3=p1.and(p2).add(p4).add(p5)
    
    for(Predicate_joining_program1 ObjectData:al)
    {
    	if(p3.test(ObjectData))
    	{
    		System.out.println(ObjectData.name);
    	}
    }
   
}
}
