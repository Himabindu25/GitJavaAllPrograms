
public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder c1 = new Cylinder();
		
		c1.radius = 7;
		c1.height = 10;
		
		System.out.println("Lidarea is "+ c1.lidarea());
		System.out.println("Total surface area  is "+ c1.totalSurfaceArea());
		System.out.println("Circumference is "+ c1.circumference());
		System.out.println("Volume is "+ c1.volume());
	}

}


class Cylinder
{
	double radius;
	double height;
	
	double lidarea()
	{
		return Math.PI*radius*radius;
	}
	
	double totalSurfaceArea() 
	{
		return 2*lidarea()+circumference()*height;
	}
	double circumference() 
	{
		return 2*Math.PI*radius;
	}
	double volume()
	{
		return lidarea()*height;
	}
}
