
public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(3,4);
		
		System.out.println("Lidarea is "+ c1.lidarea());
		System.out.println("Total surface area  is "+ c1.totalSurfaceArea());
		System.out.println("Circumference is "+ c1.circumference());
		System.out.println("Volume is "+ c1.volume());
		
		System.out.println("Lidarea is "+ c2.lidarea());
		System.out.println("Total surface area  is "+ c2.totalSurfaceArea());
		System.out.println("Circumference is "+ c2.circumference());
		System.out.println("Volume is "+ c2.volume());

	}

}

class Circle{
	
	private int radius;
	private int height;
	
	public Circle()
	{
		this.radius = 1;
		this.height = 1;
	}
	
	public Circle(int r, int h)
	{
		radius = setRadius(r);
		height = setHeight(h);
	}
	
	public int getRadius()
	{
		return radius;
	}
	public int setRadius(int r)
	{
		if (r<0)
			radius = 0;
		else
			radius = r;
		return radius;
	}
	public int getHeight()
	{
		return radius;
	}
	public int setHeight(int h)
	{
		if (h<0)
			height = 0;
		else
			height = h;
		return h;
	}
	
	public double lidarea()
	{
		return Math.PI*radius*radius;
	}
	
	public double totalSurfaceArea() 
	{
		return 2*lidarea()+circumference()*height;
	}
	public double circumference() 
	{
		return 2*Math.PI*radius;
	}
	public double volume()
	{
		return lidarea()*height;
	}
}
