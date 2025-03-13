import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,9,7,8,12,6,15,5,4,10};
		
		//Sum of all elements
		int sum = 0;
		for (int x:a)
		{
			sum = sum+x;
		}
		System.out.println("Sum of the elements in the array : " + sum);
		
		//searching an element
		
		System.out.println("Enter the element to find in the array : ");
	
		Scanner sc = new Scanner(System.in);
		
		int find = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i]==find)
			{
				System.out.println("Element found in " + i + " Position"); 
			}
		}
		
		//Finding Maximum element
		int temp = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>temp)
			{
				temp = a[i];
			}
		}
		System.out.println("Maximum number is : "+temp);
		
		//Finding Second largest element
		int first = 0;
		int second = 0;
		for(int i=0;i<a.length;i++)
		{
			if (a[i] > first)
			{
				second = first;
				first = a[i];
			}
			else if(a[i]>second)
			{
				second = a[i];
			}
		}
		System.out.println("Second Maximum number is : "+second);
	}
}
