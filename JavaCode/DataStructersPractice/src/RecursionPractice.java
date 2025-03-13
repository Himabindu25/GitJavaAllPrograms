
public class RecursionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		functionR(1,4);
	}
	
	public static void functionR(int i, int n)
	{
		if(i == n)
			return;
		
		functionR(i+1,n);
		System.out.println(i);
	}

}

