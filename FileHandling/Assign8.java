package Assign8;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Assign8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char a[]=new char[10];
		Scanner sc=new Scanner(System.in);
		
		try(FileWriter fos=new FileWriter("d:\\newfile.txt"))
		{
		//a[]=sc.next(pattern)();
			
			System.out.println("Enbter character");
			for(int i=0;i<a.length;i++)
			{
				char a1=sc.next().charAt(a[i]);
				fos.write(a1);
			}			
		   //char b=fos.write(a[]);
		   
		
		}
			
		catch(Exception e)
		{
			
		}
		try(FileReader fr=new FileReader("d:\\newfile.txt"))
		{
			fr.read(a);
			System.out.println(a);
		}
		catch(Exception e)
		{
			
		}
		

	}

}
