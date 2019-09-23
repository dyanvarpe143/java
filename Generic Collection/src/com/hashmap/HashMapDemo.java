package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
		private int deptid;
		private int cityid;
		private String empid;
		
		public HashMapDemo(int deptid,int cityid,String empid)
		{
			this.deptid=deptid;
			this.cityid=cityid;
			this.empid=empid;
		}
		@Override
		public int hashCode()
		{
			System.out.println("in hshcode");
			return deptid;
			
		}
		@Override
		public boolean equals(Object ref)
		{
			boolean flag=cityid==((HashMapDemo)ref).cityid;
			System.out.println("int equals method "+flag);
			return flag;
		}
		
		@Override
		public String toString()
		{
			return empid+"\t"+cityid+"\t"+deptid;
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			HashMapDemo h1=new HashMapDemo(101,200,"e001");
			HashMapDemo h2=new HashMapDemo(102,300,"e002");
			HashMapDemo h3=new HashMapDemo(103,400,"e003");
			HashMapDemo h4=new HashMapDemo(103,500,"e004");
			
			Map<HashMapDemo, String>map=new HashMap<HashMapDemo,String>();
			map.put(h1, "Akash");
			map.put(h2, "Snajay");
			map.put(h3, "Chinmay");
			map.put(h4, "Dnyanesh");
			System.out.println("\n"+map+"\n");
			String val=map.get(h2);
			String val1=map.get(h4);
			System.out.println(val+"\n"+val1);
	}

}
