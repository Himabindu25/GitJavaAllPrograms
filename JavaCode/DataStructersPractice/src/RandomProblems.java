import java.util.*;

public class RandomProblems {

	public static void main(String[] args) {
		
		int[] a = {-4,-1,0,3,10};
		
		Solutionso s = new Solutionso();
		
		System.out.println(s.sortedSquares(a));	

        int[] z1 = {1,0,2,3,0,4,5,0};
		
		Solutionz z = new Solutionz();
		z.duplicateZeros(z1);
		
	}

}
class Solutionz {
    public void duplicateZeros(int[] arr) {
    	
        int b[] = new int[arr.length];
        
        b = arr;
        
        for(int i=0;i<arr.length;i++)
        {
        	/*System.out.println(b[i]);*/
            if(arr[i]==0)
            {
                for(int j=arr.length-1;j>i;j--)
                {
                    b[j] = b[j-1];
                }
                i++;
            }
        }
        
    }
}
class Solutionso {
    public int[] sortedSquares(int[] nums) {
    	int[] b = new int[nums.length];
    	int temp = 0;
    	
    	for(int i=0;i<nums.length;i++)
    	{
    		b[i] =  (nums[i]*nums[i]);
    	}
    	/*for (int j=0;j<b.length-1;j++)
    	{
    		if(b[j] > b[j+1])
    		{
    			temp = b[j];
    		    b[j] = b[j+1];
    		    b[j+1] = temp;
    		}
    		
    	}*/
		java.util.Arrays.sort(b);
        return b;
    }
}

class Solutions {
    public int findNumbers(int[] nums) {
        int count =0, temp=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 9)
            {
                while(nums[i]>0)
                {
                  temp++;
                  nums[i] = nums[i]/10;
                }
                if(temp!=0 && temp%2==0){
                    count++;
                    temp = 0;}
                else 
                	temp = 0;
            }
        }
        return count;  
    }
}

class Solution1 {
    public boolean isIsomorphic(String s, String t) {

        Map<Character,Character> hs = new HashMap<>();
        Map<Character,Character> ht = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
        	char s1 = s.charAt(i);
        	char t1 = t.charAt(i);
        	if(hs.containsKey(s1)){
            if(hs.get(s1)!=t1)
            {
               return false;
            }
            else 
            {
            	hs.put(s1, t1);
            }}
            
        	if(hs.containsKey(t1)) {
            if(ht.get(t1)!=s1)
            {
               return false;
            }
            else 
            {
            	ht.put(t1, s1);
            }}
        }
        return true;
    }
}

class Solution3 {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
             return false;

Map<Character,Character> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.get(s.charAt(i))==null)
            {
               hm.put(s.charAt(i),t.charAt(i));
            }
            else 
            {
                if(t.charAt(i)==hm.get(s.charAt(i)))
                   return true;
                else
                   return false;
            }
        }
        return true; 
    }
}

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        char a;
        Map<Character, Integer> hm = new HashMap<>();

        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        for(int i=0;i<s.length()-1;i++)
        {
            if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1)))
               total = total-hm.get(s.charAt(i));
            else 
                total = total+hm.get(s.charAt(i)); 
        }
        return total+hm.get(s.charAt(s.length()-1));
    }
}

