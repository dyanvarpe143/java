/*create a HashMap.store  prn no. and students name of 10 students inside the HashMap.
display it using iterator.*/
package Assign;
import java.util.Map.Entry;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import com.sun.javafx.webkit.KeyCodeMap.Entry;

public class Assign2 implements Serializable{

	private int prn_No;
	private String student_Name;
	public Assign2(int prn_No,String student_Name)
	{
		this.prn_No=prn_No;
		this.student_Name=student_Name;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Assign2 a1=new Assign2(101, "Dnyaneshwar");
		//Assign2 a2=new Assign2(101, "Student2");
		
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(101, "Student1");
		map.put(102, "Student2");
		map.put(103, "Student3");
		map.put(104, "Student4");
		map.put(105, "Student5");
		//map.compute(key, remappingFunction)
		//
		Set<Entry<Integer,String>>s=map.entrySet();
		try
		{
			FileOutputStream fos=new FileOutputStream("d:\\hash1.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(map);
			FileInputStream fis=new FileInputStream("d:\\hash1.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			//Set<?>s1=(Set)ois.readObject();
			Iterator<?>it=s.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		}
		catch(Exception e)
		{
			
		}
		
		
	}

}
