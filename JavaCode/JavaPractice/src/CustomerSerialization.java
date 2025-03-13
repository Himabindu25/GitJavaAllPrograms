import java.io.*;

public class CustomerSerialization {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Customer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		CustomerE [] c = {new CustomerE("Himabindu","8167665323"),new CustomerE("Akshay","8167665323"),new CustomerE("Sravya","8167665323"),new CustomerE("Prashanth","8167665323")};
		
		oos.writeInt(c.length);
		
		for(CustomerE x : c)
			oos.writeObject(x);
		
		oos.close();
		fos.close();
		
		
		FileInputStream fis = new FileInputStream("/Users/himabindu/desktop/JavaCode/JavaPractice/Customer.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		int a = ois.readInt();
		String x;
		
		
		for(int i=0;i<a;i++)
		{
			CustomerE c1 = (CustomerE) ois.readObject();
			System.out.println(c1);
		}
		
	}
}

class CustomerE implements Serializable
{
	String CustID;
	String name;
	String phnno;
	
	static int count = 0;
	
	CustomerE(){}
	CustomerE(String n, String pn)
	{
		CustID = "C"+count;
		count++;
		name = n;
		phnno = pn;
	}
	
	public String toString()
	{
		return "\n Customer Id "+ CustID + " Name " + name + " Phone number " + phnno;
	}
	
}
