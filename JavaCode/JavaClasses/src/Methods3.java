
public class Methods3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vararg for max value
		
		int a[] = {91,232,43,74,45,63,45,23,67,45,89,34};
		
		System.out.println(max(10));
		System.out.println(max(10,234,254,342,999));
		System.out.println(max(new int[] {1,2,3,4,5,6,7,8,9,0}));
		System.out.println(max(a));
		
		//Vararg for sum of elements
        double ba[] = {91,232,43,74,45,63,45,23,67,45,89,34};
		
		System.out.println(sum(10));
		System.out.println(sum(10,234,254,342,999));
		System.out.println(sum(new double[] {1,2,3,4,5,6,7,8,9,0}));
		System.out.println(sum(ba));
		
		//Vararg for discount
        double ba1[] = {91,232,43,74,45,63,45,23,67,45,89,34};
		
		System.out.println(discount(10));
		System.out.println(discount(10,234,254,342,999));
		System.out.println(discount(new double[] {1,2,3,4,5,6,7,8,9,0}));
		System.out.println(discount(ba1));
		

	}
	
	
	static double discount(double ...a)
	{
		if(a.length == 0) 
			return Integer.MIN_VALUE;
		
		double sum = 0;
		double discount = 0.0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		
		if (sum>500)
			discount = (sum*(50.0/100));
		else if(sum>300 && sum<500)
			discount = (sum*(25.0/100));
		else if(sum>100 && sum<300)
			discount = (sum*(10.0/100));
		else 
			discount = sum*(1.0/100);
		
		return discount;
	}
	
	
	
	static double sum(double ...a)
	{
		if(a.length == 0) 
			return Integer.MIN_VALUE;
		
		double sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		return sum;
	}
	
	static int max(int ...a) 
	{
		if(a.length == 0) 
			return Integer.MIN_VALUE;
		
		int temp = 0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]>temp)
			{
				temp=a[i];
			}
		}
		return temp;
	}
	     
	

}
