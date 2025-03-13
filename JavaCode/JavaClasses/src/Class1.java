
 class Rectangel
{
	  int length;
	  int breadth;
	
	 int area()
	{
		int area = length*breadth;
		return area;
	}
	
	 int perimeter()
	{
		int perimeter = 2*(length+breadth);
		return perimeter;
	}
}
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangel r = new Rectangel();
		
		r.length = 14;
		r.breadth = 35;
		
		System.out.println("Area : "+r.area());
		System.out.println("Area : "+r.perimeter());
		
        Rectangel r1 = new Rectangel();
		
		r1.length = 23;
		r1.breadth = 29;
		
		System.out.println("Area : "+r1.area());
		System.out.println("Area : "+r1.perimeter());
		
	}

}


