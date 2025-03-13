import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int n = sc.nextInt();
		sc.nextLine();
		
		checkPrime(n);
		
        System.out.println("Enter the 2 number : ");
		
		int m = sc.nextInt();
		int p = sc.nextInt();
		sc.nextLine();
		
		int Gcd = checkGcd(m,p);
		
		System.out.println("GCD of the 2 number : " + Gcd);
		
		int A[] = {1,23,45,3,6,54,7};
		
		int max = MaxValue(A);
		
		System.out.println("Max value of the Array is : " + max);
		
		
        sc.close();
	}
	
	 //Max value using method
     static int MaxValue(int[] a) {
		// TODO Auto-generated method stub
    	int max = 0;
    	for (int i =0;i<a.length;i++)
    	{
    		if (a[i]>max)
    		{
    			max = a[i];
    		}
    		
    	}
		return max;
	}

    //GCD using method
	static int checkGcd(int n,int m) {
		// TODO Auto-generated method stub
    	 int tempn = 0;
    	 int tempm = 0;
    	 while (n!=0 && m!=0)
    	 {
    		 if (n>m)
    		 {
    			 n = n-m;
    		 }
    		 else 
    		 {
    			 m = m-n;
    		 }
    	 }
    	 int Gcd = (n == 0)?m:n;
    	 return Gcd;
	}
	
	//Prime using method
	static void checkPrime(int x)
	{
		if (x<=1)
		{
			System.out.println("Number should be greater than 1");
			return;
		}
		for (int i=2;i<=Math.sqrt(x);i++)
		{
			if (x%i == 0)
			{
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("Its a prime number");
	}
}
