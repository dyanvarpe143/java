import java.util.Scanner;
class SwitchSecond
{
   
     String ch;

   void SwitchFun(String ch)
   {
          this.ch=ch;
      switch(ch)
       {
	case  "a":
 		
			System.out.println("Charater is a First OVAL");
			break;
		
    	
	case  "e" :
                    
  			System.out.println("Charater is a SECOND OVAL");
               
		break;

        case  "i" :
			
  			System.out.println("Charater is a Third OVAL");
                  
	     break;
       case "o":
       
		  
  			System.out.println("Charater is a Fourth OVAL");
                  
		break;


       case "u" :
                  
  			System.out.println("Charater is a Last OVAL");
                 

		break;
   		
         default :
  			
			System.out.println("Charater is  not a OVAL");
  			 break;
				
  			
        }
   
   
  }
 

}
public class AssignSecond
{
  public static void main(String args[])
    {
  	Scanner sc=new Scanner(System.in);
         System.out.println("Enter Charater to check OVAL: ");
		String ch=sc.nextLine();
	  SwitchSecond t=new SwitchSecond ();
        
 		
         t.SwitchFun(ch);

	 

     }
  	
 
}