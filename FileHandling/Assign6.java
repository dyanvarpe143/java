package Assign6;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
class Car
{
	int num1=20;
  public Car()
	{
	  System.out.println("car Name: ");
	}
}
class Nano extends Car implements Serializable
{
	int num2=53;
	public Nano()
	{
		
		System.out.println("This is Nano Engine");
	}
}

public class Assign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nano n=new Nano();
	
		n.num1=100;
		n.num2=200;
		try(FileOutputStream fos=new FileOutputStream("d:\\Dnyaneshwar.txt"))
		{
			try(ObjectOutputStream ob=new ObjectOutputStream(fos))
			{
				ob.writeObject(n);
				ob.close();
				
			}
			//n=null;
			//System.out.println("Success");
		}
		catch(Exception e)
		{
			
		}
		
		try(FileInputStream fis=new FileInputStream("d:\\Dnyaneshwar.txt"))
		{
			try(ObjectInputStream ois=new ObjectInputStream(fis))
			{
				Nano s=(Nano)ois.readObject();
				System.out.println(s.num1+" "+ s.num2);
			}
			//
		}
		catch(Exception e)
		{
			
		}
		
	}

}
