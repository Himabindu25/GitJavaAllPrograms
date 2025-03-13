import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double num = scan.nextDouble();
		
		if (num%2 == 0) {
			System.out.println("Hurray " + num + " Its an even number!");
		} else
		{
			System.out.println("Hurray " + num + " Its an odd number!");
		}
		
		scan.close();

	}

}
