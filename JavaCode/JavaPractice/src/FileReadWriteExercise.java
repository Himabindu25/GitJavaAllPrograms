import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadWriteExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		/*FileInputStream fis = new FileInputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Source.txt");
		
		byte[] b = new byte[fis.available()];
		
		fis.read(b);
		
		String str = new String(b);
		
		String str1 = str.toLowerCase();
		System.out.println(str1);
		
		FileOutputStream fos = new FileOutputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Source1.txt");
		
		
		byte[] b1 = str1.getBytes();		
		
		fos.write(b1);
		
		fis.close();
		fos.close();*/
		
		FileInputStream fis1 = new FileInputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Source.txt");
		FileInputStream fis2 = new FileInputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Source1.txt");
		
		FileOutputStream fos = new FileOutputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Destination.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
		
		int x;
		
		while((x = sis.read())!= -1)
		{
			fos.write(x);
		}
		
		fis1.close();
		fis2.close();
		fos.close();
		sis.close();
		
		
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
