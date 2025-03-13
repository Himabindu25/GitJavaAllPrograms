import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day in number 1-7 : ");
		
		int day = sc.nextInt();
		sc.nextLine();
		
		if (day == 1)
		{
			System.out.println("It's Monday");
		}
		else if(day == 2)
		{
			System.out.println("It's Tuesday");
		}
		else if (day == 3)
		{
			System.out.println("It's Wednesday");
		}
		else if (day == 4)
		{
			System.out.println("It's Thursday");
		}
		else if (day == 5)
		{
			System.out.println("It's Friday");
		}
		else if (day == 6)
		{
			System.out.println("It's Saturday");
		}
		else if (day == 7)
		{
			System.out.println("It's Sunday");
		}
		else
		{
			System.out.println("Enter day is wrong");
		}
		
		System.out.println("Enter the URL : ");
		
		String URL = sc.nextLine();
		
String str = URL.substring(0, URL.indexOf(":"));
		
		if (str.equals("http"))
		{
			System.out.println("Hyper Text Transfer Protocol");
		}
		else if(str.equals("https"))
		{
			System.out.println("Hyper Text Transfer Protocol Secure");	
		}
		else if(str.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}
		else if(str.equals("stmp"))
		{
			System.out.println("Single Mail Transfer Protocol");
		}
		else 
		{
			System.out.println("Unrecognised Protocol");
		}
		
		String str1 = URL.substring(URL.lastIndexOf("."));
		
		if (str1.equals(".com"))
		{
			System.out.println("commercial entity");
		}
		else if(str1.equals(".org"))
		{
			System.out.println("Organization entity");
		}
		else
		{
			System.out.println("Commercial entity of a particular country");
		}

	}

}
