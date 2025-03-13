import java.util.*;
import java.io.*;

public class StudentPractice {

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		AccountS acc=null;
        HashMap<String,AccountS> hm=new HashMap<>();
        
        try
        {
        FileInputStream fis=new FileInputStream("/Users/himabindu/desktop/JavaCode/DataStructuresPractice/Accounts.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        
        int count=ois.readInt();
        for(int i=0;i<count;i++)
        {
            acc=(AccountS)ois.readObject();
            System.out.println(acc);
            hm.put(acc.Accno,acc);
        }
        fis.close();
        ois.close();
        
        }
        catch(Exception e)
        {
            
        }
        
        FileOutputStream fos=new FileOutputStream("Accounts.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        String accno,name;
        float balance;
        int choice;
        
		do
		{
			System.out.println("            Welcome to the Portal            ");
			System.out.println("1. Create an Account");
			System.out.println("2. Delete an Account");
			System.out.println("3. View an Account");
			System.out.println("4. View all Accounts");
			System.out.println("5. Save Accounts");
			System.out.println("6. Exit");
			
			System.out.println("Enter your choice : ");
			
			choice = sc.nextInt();
			
			sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			 
	        
			switch (choice) 
			{
			case 1: System.out.println("Enter Details Accno, Name ,balance ");
            accno=sc.nextLine();
            name=sc.nextLine();
            balance=sc.nextFloat();
            
            acc=new AccountS(accno,name,balance);
            hm.put(accno, acc);
            System.out.println("Account Created for "+name);

            break;
    case 2: System.out.println("Enter Accno");
           
            accno=sc.nextLine();
            hm.remove(accno);
            break;
    case 3: System.out.println("Enter Accno");
            accno=sc.nextLine();
            acc=hm.get(accno);
            System.out.println(acc);
            break;
    case 4:
            for(AccountS a:hm.values())
                System.out.println(a);
            break;
            
    case 5:
    case 6: oos.writeInt(hm.size());
    
            for(AccountS a:hm.values()) 
                oos.writeObject(a);
            
			}
			
		}while(choice!=0);
	}

}

@SuppressWarnings("serial")
class AccountS implements Serializable
{
	String Accno;
	String Name;
	float Balance;
	
	public AccountS() {}
	public AccountS(String a,String n,float b)
    {
        this.Accno=a;
        this.Name=n;
        this.Balance=b;
    }
    
    public String toString()
    {
        return "Account No:"+Accno+"\nName :"+Name+"\nBalance :"+Balance+"\n";
    }
}
