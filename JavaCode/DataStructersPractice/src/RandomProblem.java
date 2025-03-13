import java.util.*;

public class RandomProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the String: ");
		
		String s = sc.nextLine();
		/*3[a]2[bc]*/
		
		for(int i=0;i<s.length();i++)
		{
			if (s.contains('['))
			{
				
			}
		}
	}
}

		
	/*
		int count = 1;
		char al = 'A', ch;
		
		int n = sc.nextInt();
		
		for(int i = 0; i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(count%2==0)
				  ch =Character.toLowerCase(al);
				else 
				  ch = Character.toUpperCase(al);
				System.out.print(ch);
				
				al= (char) (al+1);
				count++;
			}
			System.out.println();
		}
		
		/*int count = 4;
		 * for(int i=1;i<=n;i++) {
			count = i+count;
			int temp = count;
			int x = 5;
			for (int j=1;j<i;j++)
			{
				System.out.print(temp);
				temp = temp-x;
				x--;	
			}
		System.out.println(i);
	}
	}
}


		
	
		/*String[] key = {"A","B","C","B","C","A"};
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0; i<key.length;i++)
		{
			Character s = key[i].charAt(0);
			/*System.out.print(hm.get(s));*/
			/*if(hm.get(s)==null)
			{
				hm.put(s,1);
			}
			else 
			{
				hm.put(s,hm.get(s)+1);
			}
			System.out.print(hm.get(s));
				
		}
	   
		hm.forEach((x,y)-> System.out.println(x+"-"+y));*/
		
