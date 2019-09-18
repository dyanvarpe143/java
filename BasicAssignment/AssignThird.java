class Third
{
  
int i;
void PrintNum(int i)
{
	 this.i=i;
	while(i<31)
	{

		
	   if (i==24)
	     {
		System.out.println("");	
             }	
	
		
	else		
          {
  	System.out.println(i);
	}
  	i++;
	}

}
}
public class AssignThird
{
 public static void main(String args[])
  {
	Third t = new Third();
	t.PrintNum(3);

  }
}