class Assign implements Runnable {
	
	 public void run()
	{
		 synchronized(this)
		 {
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		 }
	}

}
public class Assign4 
{
	public static void main(String[] args) {
		Assign a=new Assign();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		t1.start();
		t2.start();
	}
}

