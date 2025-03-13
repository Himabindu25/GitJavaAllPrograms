import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5,9,6,10,12,7,3,5,4,2};
		
		//Left rotation
		
		int temp = a[0];
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i] = a[i+1];
		}
		a[a.length - 1] = temp;
		
		for(int x:a)
		{
		   System.out.print(x+",");
		}
		System.out.println();
		
		int[] b = {5,9,6,10,12,7,3,5,4,2};
		
		//right rotation
		
		int temp1 = b[b.length-1];
		
		for(int i= b.length-1;i>0;i--)
		{
			b[i] = b[i-1];
		}
		b[0] = temp1;
		
		for(int x:b)
		{
		   System.out.print(x+",");
		}
		System.out.println();
		
		//insertion of an element
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want insert and index : ");
		
		int[] c = {5,9,6,10,12,70,0,0,0,0,0};
		
		int num = sc.nextInt();
		int index = sc.nextInt();
		
		for (int i = c.length-1;i>index;i--)
		{
			c[i] = c[i-1];
		}
		
		c[index] = num;
		for(int x:c)
		{
		   System.out.print(x+",");
		}
		
		System.out.println();
		
		//Deletion of an element
		
		System.out.println("Enter the index you want to Delet : ");
		
		int[] d = {5,9,6,10,12,70,2,3,4,5,6,7};
		
		int idx = sc.nextInt();
		
		for (int i = idx;i<d.length-1;i++)
		{
			d[i] = d[i+1];
		}
		d[d.length-1] = 0;
		for(int x:d)
		{
		   System.out.print(x+",");
		}
		
	}
}
