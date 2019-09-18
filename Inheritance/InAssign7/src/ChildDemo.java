
public class ChildDemo {
	
	{
		System.out.println("non static in main");
		
	}
	static {
		System.out.println("in main static");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.abc();
		c.abc2();

	}
	

}
