package Assign4;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Assign4 {
 
	
	public static void main(String[] args) {
      // TODO Auto-generated method stub
		//char ar[]=new char[10];
		//Scanner sc=new Scanner(System.in);
		//ar=sc.ne
		char a[]={'a','b','c','d'};
		try(FileWriter fw=new FileWriter("d:\\Dnyan.txt"))
		{ 
			for(int i=0;i<a.length;i++)
			{
				fw.write("\n"+a[i]);	
			}
			
			
		}
		catch(Exception e)
		{
			
		}
		try(FileReader fr=new FileReader("d:\\Dnyan.txt"))
		{
			fr.read(a);
			for(int i=0;i<a.length;i++)
			{				
			System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
