import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Even or Odd number
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("Entered number is even;");
		}
		else
		{
			System.out.println("Entered number is odd;");
		}
        
		// age - young or not
		System.out.println("Enter a your age : ");
		
		int num1= sc.nextInt();
		
		if(num1 >= 14 && num1 <= 55)
		{
			System.out.println("The person is younger");
		}
		else if (num1<14 || num1 > 55)
		{
			System.out.println("The person is not younger;");
		}
		else 
		{
			System.out.println("Entered age is wrong");
		}
		
		
		//Grade allocation based on marks
		
        System.out.println("Enter a your 5 subject marks : ");
		
        float s1 = sc.nextFloat();
        float s2 = sc.nextFloat();
        float s3 = sc.nextFloat();
        float s4 = sc.nextFloat();
        float s5 = sc.nextFloat();
        
        
		float marks= (s1+s2+s3+s4+s5)/5;
		
		if(marks >= 70)
		{
			System.out.println("Your grade is : A ");
		}
		else if (marks>=60 && marks < 70)
		{
			System.out.println("Your grade is : B ");
		}
		else if(marks>=50 && marks < 60)		
		{
			System.out.println("Your grade is : C ");
		}
		else if(marks>=40 && marks < 50)		
		{
			System.out.println("Your grade is : D ");
		}
		else if(marks<40)		
		{
			System.out.println("Your grade is : F ");
		}
		else 
		{
			System.out.println("Entered marks are wrong");
		}
	}

}
