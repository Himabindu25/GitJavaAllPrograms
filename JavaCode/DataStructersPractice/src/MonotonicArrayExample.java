
public class MonotonicArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SolutionM sm = new SolutionM();
		int [] a= {1,2,2,3};
		/*System.out.println(sm.isMonotonic(a));*/
		
		SolutionSh sh = new SolutionSh();
		int [] b= {2,5,1,3,4,7};
		int n=3;
		
		int[] c = sh.shuffle(b,n);
		for(int x:c)
		  System.out.print(x);

	}
}
class SolutionSh {
    public int[] shuffle(int[] nums, int n) {
        int counta = 0,countb=0;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] result = new int[nums.length];

        for(int i=0;i<n;i++)
        {    
        	    a[i] = nums[i];
                b[i] = nums[i+n];
        }
        for(int j=0;j<nums.length;j++)
        {
        	if(j%2==0)
              {result[j]=a[counta]; counta++;}
        	   
        	else
              {result[j]=b[countb]; countb++;}
        }
        return result;
    }
}

class SolutionM {
    public boolean isMonotonic(int[] nums) {
        int[] b = nums;
        int dec = 0, inc = 0, same =0;
        if(b.length==1) return true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(b[i] > b[i+1])
            {
                dec++;
            }
            else if(b[i] < b[i+1])
            {
                inc++;
            }
            else if(b[i]==b[i+1])
            {
                if(dec==0 && inc ==0)
                   same++;
                if(inc > 0 || b[i+1]>b[i])
                   inc++;
                if(dec > 0 || b[i+1]<b[i])
                   dec++;
            }
            System.out.println(i+"dec: "+dec+"inc: "+inc);
        }
        if(dec > 0 && inc == 0)
           return true;
        else if(inc > 0 && dec == 0)
           return true;
        else if(dec==0 && inc ==0)
        {
            if(same > 0)
               return true;
            else 
               return false;
        }
       return false;
    }
}