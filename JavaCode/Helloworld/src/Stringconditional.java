import java.util.*;

public class Stringconditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		String str = sc.nextLine();
		
		if (str.matches("[01]+"))
		{
			System.out.println("Entered number is Binary number [Radix 2]");
		}
		else if (str.matches("[0-7]+"))
		{
			System.out.println("Entered number is octal number [Radix 8]");
		}
		else if (str.matches("[0-9]+"))
		{
			System.out.println("Entered number is Decimal number [Radix 10]");
		}
		else if (str.matches("[0-9A-F]+"))
		{
			System.out.println("Entered number is Hexadecimal number [Radix 16]");
		}
		else
		{
			System.out.println("Entered number is not a Radix number");
		}

        System.out.println("Enter a number : ");
		
		int year = sc.nextInt();
		
		if (year%4 == 0)
		{
			if (year%100 == 0)
			{
				if(year%400 == 0 )
				{
					System.out.println("Entered year is a leap year");
				}
				else 
				{
					System.out.println("Entered year is not a leap year");
				}
			}
			else 
			{
				System.out.println("Entered year is a leap year");
			}
				
		}else
		  System.out.println("Entered year is not a leap year");
		}

	}


