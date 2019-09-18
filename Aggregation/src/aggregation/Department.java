package aggregation;

public class Department {
	
		private Teacher teacher;
		private String Dname;
		
		public Department(String Dname)
		{
			teacher=null;
			this.Dname=Dname;
			
			
		}

		
		public String getDname() {
			return Dname;
		}

		
		public void setDname(String dname) {
			Dname = dname;
		}
		public void addTeacher(Teacher teacher)
		{
			this.teacher=teacher;
		}
		public void perform()
		{
			System.out.println(Dname+ "\t");
			teacher.work();
		}
		

}
