package Assign;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Assign5 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(1,"Sachin");
		map.put(2,"Sehwag");
		map.put(3,"Gambir");
		map.put(4,"Dhoni");
		map.put(5,"Rohit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rank:");
		int ss=sc.nextInt();
		
		System.out.println(map.get(ss));
	}

}
