package Assign;

import java.util.List;

import org.omg.CORBA.DataInputStream;

import java.io.DataInput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo implements Serializable{
		
	private int num;
	public ArrayListDemo(int num)
	{
		this.num=num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo a1=new ArrayListDemo(101);
		ArrayListDemo a2=new ArrayListDemo(102);
		ArrayListDemo a3=new ArrayListDemo(103);
		ArrayListDemo a4=new ArrayListDemo(104);
		
		List<Integer>l=new ArrayList<Integer>();
		l.add(10);
		l.add(12);
		l.add(14);
		l.add(15);
		
		try
		{
			FileOutputStream fos=new FileOutputStream("d:\\second.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(l);
			FileInputStream fis=new FileInputStream("d:\\second.txt");
			ObjectInputStream ois= new ObjectInputStream(fis);
			List<?>l1=(List)ois.readObject();
			Iterator<?> it=l1.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			
			}
			
			//(ArrayListDemo)ois.readObject();
			
			
		}
		catch(Exception e)
		{
			
		}
		
		
		
		
		
	}

}
