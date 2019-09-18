
public class Sub1 extends base1 {

		Sub1()
		{
			super(12);
			System.out.println("default from sub1");
		}
		Sub1(int a)
		{
			super(10);
			System.out.println("Para from Sub1");
		}
		Sub1(int a,int b)
		{
			super(11);
			System.out.println("two para from sub1");
		}
}
