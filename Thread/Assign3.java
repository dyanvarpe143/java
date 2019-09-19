
public class Assign3 extends Thread

{
    public void run()
    {
    	for(int i=0;i<=5;i++)
    	{
    		System.out.println("Exec"+i);
    	}
    	
    }
    
    public static void main(String[] args) {
		
    	Assign3 t1=new Assign3();
    	Assign3 t2=new Assign3();
    	Assign3 t3=new Assign3();
    	t1.start();
    	t2.start();
    	t3.start();
    	
    	try
    	{
    		
    		Thread.sleep(200);
    		//t1.join();
    		//t3.join();
    		
    	}
    	catch(Exception ae)
    	{
    		ae.printStackTrace();
    	}
	}
 	
}