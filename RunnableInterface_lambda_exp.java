
public class RunnableInterface_lambda_exp 
{
	public static void main(String[] args) 
	{
	Runnable r=()->{
    	for(int i=1;i<=8;i++)
    	{
    		System.out.println("Ran by child thread");
    	} 
    };
	
		Thread t1=new Thread(r);
		t1.start();
		
		for(int i=1;i<=8;i++)
    	{
    		System.out.println("Ran main thread");
    	}
		
	}
    
}
