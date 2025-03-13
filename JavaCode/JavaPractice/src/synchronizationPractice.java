
public class synchronizationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM at = new ATM();
		customers c = new customers("Hima",200,at);
		customers c1 = new customers("Bindu",200,at);
		c.start();	
		c1.start();
	}
}

class customers extends Thread
{
	ATM at;
	String name;
	int amount;
	
	customers(String name, int amount, ATM at)
	{
		this.name = name;
		this.amount = amount;
		this.at = at;
	}
	
	public void UseATM()
	{
		at.checkBalance(name);
		at.Withdraw(name, amount);
	
	}
	public void run()
	{
		UseATM();
	}
}
class ATM
{
	synchronized public void checkBalance(String Name)
	{
		System.out.println(Name +" is checking is account balance.");
	}
	synchronized public void Withdraw(String Name, int amount)
	{
		System.out.println(Name +" is withdrawing his account balance of "+amount);
	}
}
