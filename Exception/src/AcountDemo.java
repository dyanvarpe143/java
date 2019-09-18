
public class AcountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("New");
		try
		{
			a.disp();
		}
		catch(MyExceptoin e)
		{
			e.printStackTrace();
		}

	}

}
