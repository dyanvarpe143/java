package First;
import java.io.*;
import java.util.*;
public class Assign1 {
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//int count=0;
      try(FileOutputStream fos=new FileOutputStream("d:\\newsa.txt",true);)
      {	    
    	  try(DataOutputStream dos=new DataOutputStream(fos))
    	  {
	  Scanner sc=new Scanner(System.in);
			 	 	  
		  System.out.println("Enter number:");
			 while(true)
			 { 
				 
			  int k= sc.nextInt();
			  if(k==0)
			  {		
				  System.out.println("Exit");
				  break;
			  }
			  dos.writeInt(k);
			  
     	   }
			 
			 
			 
			
			 
    	  }
	  
	  //System.out.println();
      } 
  catch(Exception ae)
  {
	  ae.printStackTrace();
  }
	
  try(FileInputStream fis=new FileInputStream("d:\\newsa.txt");DataInputStream dis=new DataInputStream(fis))
  {		  	  
		  int j=dis.available();
		  //System.out.println(j);
		 while(j!=0)
		  {			  System.out.println(dis.readInt());
			  
		  }
  }          
	  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
} 
    
  
}

