public class Th6 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println("Hello"+i);
		}
	}
	public static void main(String args[])
	{
		Th6 ob=new Th6();
		Thread t1=new Thread();
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
	}
}
