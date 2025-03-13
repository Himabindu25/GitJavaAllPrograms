import java.util.*;

public class BitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A and B values less than 15 : ");
		
		byte a = sc.nextByte();
		byte b = sc.nextByte();
		
	    b = (byte) (b<<4);
		
		byte c = (byte) (a|b);
		
		System.out.println("A and b values after merging " + c );

	}

}
