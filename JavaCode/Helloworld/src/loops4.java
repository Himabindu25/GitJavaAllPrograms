import java.util.*;
public class loops4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Arithmetic Progression
		System.out.println("Enter the a,d and n value : ");
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0;i<n;i++)
		{
			System.out.print(a + ", ");
			a = a+d;
		}
		
		//Geometric Progression
		System.out.println();
		
		System.out.println("Enter the b, r and m values : ");
		int b = sc.nextInt();
		int r = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		for(int j = 0;j<m;j++)
		{
			System.out.print(b + ", ");
			b = b*r;
		}
		
		// fibonacci series
		System.out.println(); 
		
		System.out.println("Enter the iterations of a fibonacci series ");
		int f = sc.nextInt();
		sc.nextLine();
		int fib1 = 0;
		int fib2 = 1;
	    int temp = 0;
	    for(int k=0;k<f;k++)
	    {
	    	System.out.print(fib1+",");
	    	temp = fib1+fib2;
	    	fib1 = fib2;
	    	fib2 = temp;
	    	
	    }

	}

}
