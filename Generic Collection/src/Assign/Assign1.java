/*1) create a class "MyClass".create 5 different objects of it.add them in a ArrayList.
store ArrayList in file.Now open a file, read ArrayList and display all objects.*/

package Assign;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
public class Assign1 implements Serializable {
	int num;
	public Assign1(int num)
	{
		this.num=num;
	}
	public String toString()
	{
		return "["+num+"]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assign1 a=new Assign1(101);
		Assign1 a1=new Assign1(102);
		Assign1 a2=new Assign1(103);
		Assign1 a3=new Assign1(104);
		Assign1 a4=new Assign1(105);
		List<Assign1>l=new ArrayList<Assign1>();
		l.add(a);
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
		try(FileOutputStream fos=new FileOutputStream("d:\\abcde.txt"))
		{
			try(ObjectOutputStream oos=new ObjectOutputStream(fos))
			{
			oos.writeObject(l);
			}
					
		}
		catch(Exception e)
		{
			
		}
		try(FileInputStream fis=new FileInputStream("d:\\abcde.txt"))
				{
					ObjectInputStream ois=new ObjectInputStream(fis);
					List<?>n=(List<?>)ois.readObject();
							System.out.println(n);
				}
		catch(Exception ae)
		{
			
		}
		//System.out.println();
		//System.out.println(a[i]);
		}
		
		
	}

		/*try(FileOutputStream fos=new FileOutputStream("d:\\new1.txt"))
		{
			try(DataOutputStream dos=new DataOutputStream(fos))
			{
				//for(int i=0;i<l.iterator())
				
				dos.write(l[]);;
		     // List<String> l=new ArrayList<String>();
		      			}
		}
		catch(Exception ae)
		{
			
		}
		
	}

}
*/