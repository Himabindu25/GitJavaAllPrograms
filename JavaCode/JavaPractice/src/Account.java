import java.util.*;
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		savingsAccount sa = new savingsAccount("A123","BINDU",12345.99,"cherla",12.3,300.00);
		
		System.out.println(sa.deposite(5439.87));
		System.out.println(sa.withdraw(500.00));
		System.out.println(sa.Details());
		System.out.println(sa.calInt(50000));
		System.out.println(sa.aplypenlty(sa.getBalance()));
		
		loanAccount la = new loanAccount("A1233","Hima",549345.99,"cherla",59789.78,12.3,300.00);
		
		System.out.println(la.deposite(5439.87));
		System.out.println(la.withdraw(500.00));
		System.out.println(la.Details());
		System.out.println(la.caluclateemi(3));
		System.out.println(la.payEMI(500.00));
		System.out.println(la.loanDetails());

	}

}

class mainAccount
{
	private String accountno;
	private String acchldname;
	private double balance;
	private String branch;
	
	public mainAccount(String accno, String accname, double bal, String brch)
	{
		accountno = accno;
		acchldname = accname;
		balance = bal;
		branch = brch;
	}
	
	public String getAccountno() { return accountno;}
	public String getAccountHolderName() { return acchldname;}
	public double getBalance() { return balance;}
	public String getBranch() { return branch;}
	
	public void setBalance(double amt)
	{
		if(amt>0)
		   balance = amt;
		
	}
	
	public double deposite(double amount)
	{
		if(amount>0)
			balance = balance+amount;
		
		return balance;
		
	}
	
	public double withdraw(double amount)
	{
		if(balance > amount)
			balance = balance - amount;
		else if (amount < 0)
			System.out.println("Enter amount more than 0");
		else
			System.out.println("Amount is more than your balance");
		
		return balance;
			
	}
	
	public String Details()
	{
		return "Details of the account : Account No : " + accountno + ", Acountholder name : " + acchldname + ", Balance : " + balance + ", Branch : "+ branch;
	}
}


class savingsAccount extends mainAccount
{
	public double interestRate;
	public double minimumBalance;
	
	
	public savingsAccount(String accno, String accname, double bal, String brch,double intrate, double minbal) {
		super(accno, accname, bal, brch);
		interestRate = intrate;
		minimumBalance = minbal;
		// TODO Auto-generated constructor stub
	}

	
	public double calInt(double amount)
	{
		return (amount*5*1)/100;
	}
	
	public double aplypenlty(double balance)
	{
		if (balance < 5000)
			return 50.0;
		else 
			return 0.0;
	}
	
}

 class loanAccount extends mainAccount
{

		public double loanAmount;
		public double intrate;
		public double remainingemis;
		
	public loanAccount(String accno, String accname, double bal, String brch,double loanamt, double intrate, double rememis) {
		super(accno, accname, bal, brch);
		loanAmount = loanamt;
		this.intrate = intrate;
		remainingemis = rememis;
	}

	
	public double caluclateemi(int amount)
	{
		return 100+(amount*5*1)/100;
	}
	
	public double payEMI(double emi)
	{
		if (emi>0)
			loanAmount = loanAmount - emi;
		
		return loanAmount;
	}
	
	public String loanDetails()
	{
		return "Loan details - Loan Amount : "+loanAmount+", Interest Rate : "+intrate+", Remaining Emis : "+ remainingemis;
	}
}
