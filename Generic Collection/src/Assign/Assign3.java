package Assign;
interface Game
{
	
	public void play();
}
class Cricket implements Game
{
	public void play()
	{
		System.out.println("play cricket");
	}
}
class Tennis implements Game
{
	public void play()
	{
		System.out.println("play Tennis");
	}
	public void disp()
	{
		System.out.println("This is specific to tennis");
	}
}
class FootBall implements Game
{
	public void play()
	{
		System.out.println("play FootBall");
	}
}

public class Assign3<T> 
{
	

	static void perform(Game ref)
	{
		if(ref instanceof FootBall)
		{
			FootBall b=(FootBall)ref;
			b.play();
			
		}
		if(ref instanceof Tennis)
		{
			Tennis b=(Tennis)ref;
			b.disp();
			b.play();
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g[]=new Game[3];
		g[0]=new Cricket();
		g[1]=new FootBall();
		g[2]=new Tennis();
		
		perform(new Tennis());
	}

}
