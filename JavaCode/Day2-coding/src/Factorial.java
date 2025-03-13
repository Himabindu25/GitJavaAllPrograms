import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int f = scan.nextInt();
		
		int ans = callfactorial(f);
		
		System.out.print(ans);

	}
	
	static int callfactorial(int fact) {
		
		if (fact==0) {
			return 1;
		}
		return fact*callfactorial(fact-1);
	}
	

}
