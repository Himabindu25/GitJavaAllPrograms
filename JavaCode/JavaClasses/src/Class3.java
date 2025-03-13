
public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		
		s.m1 = 78.9;
		s.m2 = 65;
		s.m3 = 45.4;
		
		System.out.println("Total marks are "+s.total());
		System.out.println("Average marks are "+s.average());
		System.out.println("Grade is "+s.grade());
	}

}


class Student
{
	String roll;
	String name;
	String course;
	double m1,m2,m3;
	
	double total()
	{
		return m1+m2+m3;
	}
	
	double average()
	{
		return (m1+m2+m3)/3;
	}
	
	String grade()
	{
		double avg = average();
		if (avg > 80)
			return "A grade";
		else if(avg>70 && avg<80)
			return "B grade";
		else if(avg>60 && avg<70)
			return "C grade";
		else if(avg>50 && avg<60)
			return "D grade";
		else if(avg>40 && avg<50)
			return "E grade";
		else
			return "Fail";
	}
}
