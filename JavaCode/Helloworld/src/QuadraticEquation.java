import java.util.*;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter values of a,b and c");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double r1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        double r2 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        
        System.out.println("Square rootss of the qudartic equation ax2+bx+c=0 are " + r1 + " and " + r2);
        
	}

}
