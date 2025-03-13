import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callfibonacci(0,1);
	}
	
	static void callfibonacci(int x, int y) {
		System.out.print(x+" , ");
		
		if (y < 50 ) {
		callfibonacci(y,x+y);
	}
	}	

}
