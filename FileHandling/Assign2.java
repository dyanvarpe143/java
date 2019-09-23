package Second;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Assign2 implements Serializable{


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter CustId,CustName,Address,age");
	int custid=sc.nextInt();
	
	String custname=sc.next();
	String address=sc.next();
	int age=sc.nextInt();
	Assign2 a=new Assign2();
	try(FileOutputStream fos=new FileOutputStream("d:\\write.txt"); )
	{
		try(ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
			oos.writeObject(a);
		}
		
	}
	catch(Exception ae)
	{
		
	}
	System.out.println(custname+"\n"+custid+"\n"+address+"\n"+age+"\n");
	//a=null;
	//Assign2 b=new Assign2();
	try(FileInputStream fis=new FileInputStream("d:\\write.txt");)
	{
		try(ObjectInputStream ois=new ObjectInputStream(fis))
		{
			Assign2 b=(Assign2)ois.readObject();
			//System.out.println(b.custid+"id");
		}
		
	}
	catch(Exception ae)
	{
		
	}
}
}
