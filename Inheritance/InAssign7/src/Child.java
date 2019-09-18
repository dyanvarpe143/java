
public class Child extends Parent1 implements Parent2{

	static 
	{
		System.out.println("int child static ");
	}
	public Child()
	{
		super(10);
		System.out.println("Child Constructor");
	}
	public void abc2()
	{
		System.out.println("abc2 Interface in child");
	}
	public void abc()
	{
		System.out.println("override from parent1");
	}
}
