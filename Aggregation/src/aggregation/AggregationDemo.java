package aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department fd=new Department("Marathi");
		Department sd=new Department("English");
		System.out.println(fd.getDname());
		System.out.println(sd.getDname());
		Teacher t1 = new Teacher("XYZ",25);
		System.out.println(t1.getName() + " "+ t1.getAge());
		sd.addTeacher(t1);
		sd.perform();
		System.out.println("Lets close dept");
		sd=null;
		System.out.println(t1.getName() +"Still Exist assign to other dept");
		fd.addTeacher(t1);
		fd.perform();
		System.out.println("This also get closed");
		fd=null;
		System.out.println(t1.getName() + "So teacher isn there but no more depts ");
		
	}

}
