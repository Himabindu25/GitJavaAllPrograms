

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] a= {{1,2,3},{2,3,4},{4,5,6}};
		int [][] b= {{1,0,0},{0,1,0},{0,0,1}};
		
		//Addition of two arrays
		int c[][] = new int[a.length][a[0].length];
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
			    c[i][j] = a[i][j]+b[i][j];
			}
			
		}
		
		for(int x[]:c)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		//Multiplication of two arrays
		int d[][] = new int[a.length][a[0].length];
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++)
			{
				c[i][j]=0;
			    for(int k=0;k<a[i].length;k++)
			    {
			    	c[i][j] = c[i][j]+a[i][k]*b[k][j];
			    }
			}
			
		}
		
		for(int x[]:c)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		//Sorting string array
		String [] e = {"array","java","python","bindu","akshay","sravya","prashanth"};
		
		java.util.Arrays.sort(e);
		
		for(String x:e)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		
		

	}

}
