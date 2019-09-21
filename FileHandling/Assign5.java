package Assign5;

import java.io.RandomAccessFile;
import java.util.*;
public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try(RandomAccessFile rf=new RandomAccessFile("d:\\Dnyan1.txt","rw"))
		{
			

			System.out.println("Enter data");
			byte b[]=new byte[200];
			int k=System.in.read(b);
			rf.write(b,0,k);
			rf.seek(0);
			byte c[]=new byte[(int)rf.length()];
			rf.read(c);
			String ss=new String(c);
			System.out.println(ss);
			rf.seek(rf.length());
			System.out.println("Enter data again");
			k=System.in.read(b);
			rf.write(b,0,k);
			System.out.println("Finally reading all data");
			rf.seek(0);
			c=new byte[(int)rf.length()];
			rf.read(c);
			ss=new String(c);
			System.out.println(ss);
			
			
			
		}
		catch(Exception ae)
		{
			
		}
		
		
	}

}
