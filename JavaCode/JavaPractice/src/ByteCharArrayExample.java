import java.io.*;

public class ByteCharArrayExample {

	public static void main(String[] args) throws Exception
	{
		
		FileWriter fis = new FileWriter("/Users/himabindu/desktop/JavaCode/JavaPractice/TextW.txt");
		BufferedWriter bis = new BufferedWriter(fis);
		
		 bis.write('A');
		 bis.write('k');
		 bis.write('s');
		 bis.write('h');
		 bis.write('a');
		 bis.write('y');
		 
		 bis.flush();
		 
	}

}
