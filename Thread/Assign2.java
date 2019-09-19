
public class Assign2 implements Runnable {
	synchronized static void disp1()
	{
String str="a";
		
		for(int i=0;i<10;i++)
			
		{	
			
			System.out.println((char)(str.charAt(0)+i));
		}
	}
	
	public void run()
	{
		disp1();
	}
	public static void main(String args[]) throws InterruptedException
	{
		Assign2 ob=new Assign2();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
		
	}

}
