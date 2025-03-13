import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Base of the traingle");
		
		float b = sc.nextFloat();
		
		System.out.println("Enter Height of the triangle");
		
		float h = sc.nextFloat();
		
		float area = (b*h)/2;
		
		System.out.println("Area of the Traingle 1 is " + area);
		
		
        System.out.println("Enter side 1 of the traingle");
		
		float s1 = sc.nextFloat();
		
		System.out.println("Enter side 2 of the triangle");
		
		float s2 = sc.nextFloat();
        
		System.out.println("Enter side 2 of the triangle");
		
		float s3 = sc.nextFloat();
		
		float s = (s1+s2+s3)/2;
		double area2 = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)); 
		
		System.out.println("Area of the Traingle 2 is " + area2);

	}

}
