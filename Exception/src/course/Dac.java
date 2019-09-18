package course;
import java.util.*;

public class Dac {
	private int a,b;
	public void term1(int a,int b)
	{
		this.a=a;
		this.b=b;
		
		
		int c=a+b;
		System.out.println("add"+c);
	}
	private  String msg;
	public void term2(String msg)
	{
		this.msg=msg;
		System.out.println(msg);
	}

}
