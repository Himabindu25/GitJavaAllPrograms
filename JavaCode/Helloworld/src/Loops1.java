import java.util.*;

public class Loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Table of a number
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number for its table : ");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + "*" + i + "=" + (n*i));

		}
		
		// Addition for m times
		
        System.out.println("Enter a number for number of iterations : ");
		
		int m = sc.nextInt();
		sc.nextLine();
		
		int i=1; 
		int	sum = 0;
		
		while(i<=m)
		{
			sum = sum+i;
			i++;
			System.out.println(sum);	
		}
		
		// factorial
		
        System.out.println("Enter a number for factorial : ");
		
		int f = sc.nextInt();
		sc.nextLine();
		
		int j=1; 
		int	fact = 1;
		
		while(j<=f)
		{
			fact = fact*j;
			j++;	
		}
		System.out.println("Factorial of number "+ f + " = " + fact);

	}

}
