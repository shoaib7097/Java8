import java.util.TreeMap;

public class SortingInTreeMap_Using_lambdaExp 
{
   public static void main(String[] args) 
   {
	 TreeMap<Integer, String> tm=new TreeMap<Integer, String>((num1,num2)->(num1>num2)?-1:(num1<num2)?1:0);
	 tm.put(100, "shoaib");
	 tm.put(400, "Hasmuddin");
	 tm.put(200, "shahabuddin");
	 tm.put(300, "Amer");
	 tm.put(500, "Ali");
	 
	 System.out.println(tm);
	 
	 /*Treemap has natural sorting order by default if we want customized sorting order we should pass object of 
	  comparator implement class object as comparator is functional interface so we are writing lambda inside treemap
	  arguments*/ 
   }
}
