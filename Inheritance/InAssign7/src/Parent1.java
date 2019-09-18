
public class Parent1 {
	
	private int num;
	static 
	{
		System.out.println("int Parent1 static ");
	}
	
	public Parent1(int num)
	{
		this.num=num;
		System.out.println(num);
		
	}
	public void abc()
	{
		//this.num=num;
		System.out.println("Parent1 method");
	}
	{
		System.out.println("non static in parent1");
		
	}
}
