package First;

import java.util.ArrayList;
import java.util.List;

class Animal
{
	void eat()
	{
		
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("Cat");
	}
}
public class Sample {
	
	void disp(List<? extends Animal>arr){
		
		for(Animal l:arr)
		{
			l.eat();
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample t=new Sample();
		Dog d[]={new Dog(),new Dog()};
		List<Dog>l=new ArrayList<Dog>();
		l.add(d[0]);
		l.add(d[1]);
		t.disp(l);
		Cat c[]={new Cat(),new Cat()};
		List<Cat>l1=new ArrayList<Cat>();
		
		l1.add(c[0]);
		l1.add(c[1]);
		t.disp(l1);
		
	}

}
