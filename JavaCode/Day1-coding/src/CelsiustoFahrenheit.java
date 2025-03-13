import java.util.Scanner;

public class CelsiustoFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Celsius and Fahrenheit Variable 
		double Celsius = scan.nextDouble();
		double Fahrenheit = (Celsius*9/5)+32;
		
		System.out.println(Celsius + "c is like " + Fahrenheit +"F");
		

	}

}