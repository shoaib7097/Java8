import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Day3_Predicate_Program3 
{
	/*Wap to take list of persons and print persons whose age is >=18 using lambda expression*/
	
	String name;
	int age;
	
	public Day3_Predicate_Program3(String name,int age) 
	{
		this.name=name;
		this.age=age;
	}
	
 public static void main(String[] args) 
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Emter 3 members names and age");
   Day3_Predicate_Program3 obj1=new Day3_Predicate_Program3(sc.next(),sc.nextInt());
   Day3_Predicate_Program3 obj2=new Day3_Predicate_Program3(sc.next(),sc.nextInt());
   Day3_Predicate_Program3 obj3=new Day3_Predicate_Program3(sc.next(),sc.nextInt());
   
    ArrayList<Day3_Predicate_Program3> al=new ArrayList<Day3_Predicate_Program3>();
    al.add(obj1);
    al.add(obj2);
    al.add(obj3);
    
    Predicate<Day3_Predicate_Program3> p=Object->Object.age>=18;
    for(Day3_Predicate_Program3 data:al)
    {
    	if(p.test(data))
    	{
    		System.out.println("The name of the persons whose age are beyond or equal to 18 are "+data.name);
    	}
    }
 }
}
