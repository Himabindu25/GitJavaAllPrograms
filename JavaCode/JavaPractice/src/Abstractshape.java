
public class Abstractshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r = new rectangle();
		
		shape s = r;
		System.out.println(r.perimeter());
		System.out.println(r.area());
		r.display();
		
		circle c = new circle();
		
		shape s1 = r;
		System.out.println(s1.perimeter());
		System.out.println(s1.area());
		
	}

}


abstract class shape
{
	abstract public double perimeter();
	abstract public double area();	
}

class rectangle extends shape
{
	double l=9;
	double b=9;
	public double perimeter()
	{
		return l*b;
	}
	
	public double area()
	{
		return l+b;
	}
	
	public void display()
	{
		System.out.println("Display");
	}
}

class circle extends shape
{
	int r=9;
	
	public double perimeter()
	{
		return Math.PI*r*r;
	}
	
	public double area()
	{
		return r*r;
	}
}