class Sample4
{
	int var3,var4;
	void disp(){
}
	void disp(int var3,int var4)
	{
	 this.var3=var3;
	this.var4=var4;
	System.out.println(var3);
	System.out.println(var4);
	}
}
public class Assign9
{
public static void main(String args[])
{
	Sample4 s1=new Sample4();
	Sample4 s2=new Sample4();
	s1.disp();	
	s2.disp(1,3);
}
}