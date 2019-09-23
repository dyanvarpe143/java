package Gen;
class Shape
{
	Shape draw()
	{
		return this;
	}
}
class rect extends Shape
{
	Shape draw()
	{
		System.out.println("In rect");
		return this;//System.out.println("Rect draw");
	}
}
class triangle extends Shape
{
	Shape draw()
	{
		return this;
	}
}

class common<T extends Shape>
{
	T ob;
	public common(T ob)
	{
		this.ob=ob;
		
	}
	public T fun()
	{
		return ob;
	}
}
public class GenericSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		common<rect> t=new common<rect>(new rect());
		System.out.println(t.fun());
		
		
		
		
	}

}
