import java.util.Scanner;

public class Account extends MyExceptoin
{
	public Account(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	int num;
	public void disp() throws MyExceptoin
	{
		
		Calc c=new Calc("new");
		int reslt=0;
		System.out.println("Enter Amount");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		reslt=c.sqrt(num);
		
		System.out.println(reslt);	
	}
	
}
