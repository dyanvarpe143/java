
public class DemoMain {

	static void perform(Demo d)
	{
		Demo2 d2=(Demo2)d;
		d2.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new Demo2());
	}

}
