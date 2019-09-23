package First;

//import java.util.ArrayList;
import java.util.*;
//import java.util.List;

public class First {
	
	void disp(List mylist)
	{
		Iterator itr=mylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(40);
		First f=new First();
		f.disp(l);
		System.out.println(l);
	}

}
