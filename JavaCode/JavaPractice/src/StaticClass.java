import java.util.*;
public class StaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.println(s1.getRollno());
		System.out.println(s2.getRollno());
		System.out.println(s3.getRollno());

	}

}

class Student
{
	private String rollno;
	private static int count=1;
	
	private String generaterollno()
	{	
		String rlno = "Univ-"+2025+'-'+count;
		count++;
		
		return rlno;
	}
	
	public Student()
	{
		rollno = generaterollno();
	}
	
	public String getRollno()
	{
		return rollno;
	}
}