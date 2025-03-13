
public class Doubtclarification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Checking if the same data is same and only one pool space is created what if the data is modified 
		for(String x:args)
		{
			System.out.println(x);
		}
	
		String a = "java"; 

		String b = a;
		
		if (a==b)
			System.out.println("Same" + a + b);
		else 
			System.out.println("Different" + a + b);
	    
		a = "Java";
		
		if (a==b)
			System.out.println("Same" + a + b);
		else 
			System.out.println("Different"+ a + b);
		
	}

}
