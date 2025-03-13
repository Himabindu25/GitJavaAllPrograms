
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {8,6,10,9,2,15,7,13,14,11};
		
		//Copying an array
		
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		
		for(int x:a)
		{
			System.out.print(x+",");
		}
		
		System.out.println();

		for(int x:b)
		{
			System.out.print(x+",");
		}
		System.out.println();
		
		
		// reverse of an array
		int k = a.length;
		
		int[] c = new int[k];
		
		for(int i=0;i<k;i++)
		{
			c[(k-1)-i] = a[i]; 
		}
		
		for(int x:a)
		{
			System.out.print(x+",");
		}
		
		System.out.println();

		for(int x:c)
		{
			System.out.print(x+",");
		}
		System.out.println();
		//Increase the size of an array
		int [] d = {1,2,3,4,5};
		
		int[] e = new int[2*d.length];
		
		for (int i=0;i<d.length;i++)
		{
			e[i] = d[i];
		}
		d = e;
		e = null;
		
		System.out.println("Length of the array d : "+ d.length);
	
		for(int x:d)
		{
			System.out.print(x+",");
		}
				
	}

}
