
public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s[]=new Shape[3];
		s[0]=new Triangle();
		s[1]=new Polygon();
		s[2]=new Circle();		
		for(int i=0; i < s.length;i++)
		{
		    if(s[i] instanceof Triangle)
			{
				s[i].draw();
				
			}
			else if(s[i] instanceof Polygon)
			{
				s[i].draw();
				
			}
			else if(s[i] instanceof Circle)
			{
				s[i].draw();
				
			}
			//System.out.println(s[i]);
		}
		
		
	}

}
