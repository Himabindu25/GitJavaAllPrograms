import java.util.*;

public class Pattren1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of lines you want in the pyramid : ");
		
		int n = sc.nextInt();
		sc.nextLine();
		char c = '*';
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<n)
				System.out.print(' ');
				else
				System.out.print('*');
			}
			for(int j=n+1;j<=2*n;j++)
			{
				if(j-i>=n)
				System.out.print(' ');
				else
				System.out.print('*');
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j>i)
				System.out.print('*');
				else
				System.out.print(' ');
			}
			for(int j=n+1;j<=2*n;j++)
			{
				if(j+i<2*n)
				System.out.print('*');
				else
				System.out.print(' ');
			}
			System.out.println();
		}
		

	}

}
