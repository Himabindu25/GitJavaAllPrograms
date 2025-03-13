import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		sc.nextLine();

	
		// Print each digit in a number
		int a = num;
		while(a>0)
		{
			int out = a%10;
			a = a/10;
			System.out.print(out + " ");
		}
		System.out.println();
		
		//Counting number of digits
		int n = num;
		int i=0;
		while(n>0)
		{
			n = n/10;
			i++;
		}
		System.out.println("Count of the digits in the given number " + i);
		
		//Armstrong Number
		int c = num;
		int arm = 0;
		int j = 0;
		
		while(c>0)
		{
		  j = c%10;
		  arm = arm+(j*j*j);
		  c = c/10;
		}
		
		if (arm == num)
		{
			System.out.println("Given number is Armstrong number");
		}
		else
		{
			System.out.println("Given number is not an Armstrong number");
		}
		
        //reverse of a number 
		int r = num;
		int rev = 0;
		
		while(r>0)
		{
			rev = (rev*10)+(r%10);
			r = r/10;
		}
		System.out.println("Reverse of the given number is : " + rev);
		
		//palindrome Number
		int m = num;
		int pa = 0;
		
		while(m>0)
		{
		  pa = (pa*10)+(m%10);
		  m = m/10;
		}
		if (pa == num)
		{
			System.out.println("Given number is Palindrome number");
		}
		else
		{
			System.out.println("Given number is not an Palindrome number");
		}

	}

}
