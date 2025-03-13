import java.io.*;
public class PrintStreamExample {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Student2.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		StudentExample s;
		
		s = (StudentExample) ois.readObject();
		
		System.out.println("Name "+ s.name + "Dept " + s.dept + "Roll no " +s.rollno);
	    
	}

}

class StudentExample implements Serializable
{
	int rollno;
	String name;
	String dept;
	StudentExample(){}
}
