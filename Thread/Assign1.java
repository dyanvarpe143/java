
public class Assign1 extends Thread {
	
	synchronized public void run()
	{
		String str="a";
		
		for(int i=0;i<10;i++)
			
		{	
			
			System.out.println((char)(str.charAt(0)+i));
		}
	}
	public static void main(String args[])
	{
		Assign1 t1=new Assign1();
		Assign1 t2=new Assign1();
		
		
		t1.start();
		t2.start();
		
	}

}
