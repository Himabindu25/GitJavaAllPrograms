
public class Method2 {
	
	public static void main(String arg[])
	{
		
		//Overload methods for area
		double l = 4, b=5;
		
		double rarea = area(l,b);
		
		System.out.println("Area of the rectangle is : "+ rarea);
		
		double r = 6.5;
		
		double carea = area(r);
		
		System.out.println("Area of the circle is : "+ carea);
		
		//overload methods for reversing
		int a = 345;
		int a1[] = {1,2,3,4};
		
		reverse(a);
		reverse(a1);
		
		//overload methods for validating
		
		String name = "Himabindu Manikarao";
		int age = 27;
		
		boolean value = validate(name);
		System.out.println((value)?"Valid":"Invalid");
		boolean value1 = validate(age);
		System.out.println((value1)?"Valid":"Invalid");
		
	}
	
	static boolean validate(String name)
	{
		if(name.matches("[a-zA-Z\\s]+"))
			return true;
		else
			return false;
	}
	
	static boolean validate(int age)
	{
		if (age>0 && age<100)
		    return true;
		else
		    return false;
		
	}
	
	static void reverse(int a)
	{
		int rev = 0;
		while(a!=0)
		{
			rev = (rev*10)+(a%10);
			a = a/10;
		}
		System.out.println("Reverse is " + rev);
	}
	
	static void reverse(int a[]) 
	{
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[(a.length-1)-i];
		}
		
		for (int x: b)
		{
			System.out.print(x+" ");
		}
	}
	
	static double area (double a, double b)
	{
		return a*b;
	}
	
	static double area (double a)
	{
		return Math.PI*a*a;
	}

}

