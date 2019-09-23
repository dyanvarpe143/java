interface Sample
{
	static void disp()
	{
		System.err.println("interface static method");
	}
	default void disp1()
	{
		System.out.println("Defaultmethod");
	}
	void lambda(int a);
}
/*class demo implements Sample
{
	
}*/
public class AbsClass implements Sample
{
	
	public void disp1()
	{
		System.out.println("Sub disp1 Dfault");
	}
	

	public static void main(String[] args) {
		//demo d=new demo();
		AbsClass a=new AbsClass();
		/*Sample s=(b)->{
			System.out.println("lambda"+b);
		};	*/
		
		Sample.disp();
		a.disp1();
		//Sample.disp();
	}

}
