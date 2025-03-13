import java.util.Scanner;

public class Protocol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day : ");
		
		int day = sc.nextInt();
		sc.nextLine();
		
		switch(day)
		{
		case 1: System.out.println("Monday");
		        break;
		case 2: System.out.println("Tuesday");
                break;
		case 3: System.out.println("Wednesday");
        		break;
		case 4: System.out.println("Thursday");
        		break;
		case 5: System.out.println("Friday");
        		break;
		case 6: System.out.println("Saturday");
        		break;
		case 7: System.out.println("Sunday");
        		break;
        default:System.out.println("Invalid");        
		}
		
        System.out.println("Enter the month : ");
		
		int month = sc.nextInt();
		sc.nextLine();
		
		switch(month)
		{
		case 1: System.out.println("January");
		        break;
		case 2: System.out.println("February");
                break;
		case 3: System.out.println("March");
        		break;
		case 4: System.out.println("April");
        		break;
		case 5: System.out.println("May");
        		break;
		case 6: System.out.println("June");
        		break;
		case 7: System.out.println("July");
        		break;
        case 8: System.out.println("August");
		        break;
		case 9: System.out.println("September");
                break;
		case 10: System.out.println("October");
        		break;
		case 11: System.out.println("November");
        		break;
		case 12: System.out.println("December");
        		break;
        default:System.out.println("Invalid");        
		}
		
		
        System.out.println("Enter the URL : ");
		
		String URL = sc.nextLine();
		
		String str = URL.substring(0, URL.indexOf(":"));
		
		switch(str)
		{
		case "http" : System.out.println("Hyper Text Transfer Protocol");
		              break;
		case "https" : System.out.println("Hyper Text Transfer Protocol Secure");
		               break;
		case "ftp" : System.out.println("File Transfer Protocol");
		             break;
		case "smtp" : System.out.println("Single Mail Transfer Protocol");
		              break;
		default : System.out.println("Unrecognised Protocol");
		}
		
		String str1 = URL.substring(URL.lastIndexOf("."));
		
		switch(str1)
		{
		case ".com" : System.out.println("commercial entity");
		              break;
		case ".org" : System.out.println("Organization entity");
		              break;
		 default : System.out.println("Commercial entity of a particular country");
		}
		
	}

}
