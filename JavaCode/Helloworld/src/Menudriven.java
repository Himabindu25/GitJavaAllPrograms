import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
        System.out.println(" Menu of Operations ");
        System.out.println(" ------------------ ");
		System.out.println(" ADD ");
		System.out.println(" SUB ");
		System.out.println(" MUL ");
		System.out.println(" DIV ");
		
        System.out.println("Enter the two numbers : ");
		
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		sc.nextLine();
		
		System.out.println("Enter the option from below : ");

		String option = sc.nextLine();
		
		option = option.toUpperCase();
		
		switch (option)
		{
		case "ADD" : System.out.println("Addition of two number = " + (num1+num2));
		             break;
		case "SUB" : System.out.println("Subtraction of two number = " + (num1-num2));
                     break;
		case "MUL" : System.out.println("Multiplication of two number = " + (num1*num2));
        			 break;
		case "DIV" : System.out.println("Division of two number = " + (num1/num2));
        			 break;
        default : System.out.println("Entered wrong options");
		}
	}

}
