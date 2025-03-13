import java.io.*;

public class ObjectStudentChallenge {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Float.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		int a = (int)dis.readFloat();
		float b;
		while(a>0)
		{
			b = dis.readFloat();
			System.out.println(b);
			a--;
		}
}

}
