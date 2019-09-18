
public class Calc extends MyExceptoin {

	public Calc(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	int num;
	public int sqrt(int num) throws MyExceptoin 
	{
		this.num=num;
		if(num<1000)
		{
			throw new MyExceptoin("Maintin balance up to 1000");
		}
		return num+num;
		
	}
}
