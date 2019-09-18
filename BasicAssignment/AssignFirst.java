class Table
{

  int a;


 void TabelFun(int a)
  {	this.a=a;
    for(int i=1;i<=10;i++)
    {
      
        System.out.println("\n"+i*this.a); 
    }

}


}

public class AssignFirst
{
  public static void main(String args[])
    {
        Table t=new Table();
        
 		
         t.TabelFun(15);

	 

     }
  	
 
}