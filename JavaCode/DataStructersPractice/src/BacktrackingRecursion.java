
public class BacktrackingRecursion {
	
	public static void BackTracking(String str, String Ans, int index)
	{
		if(str.length()==0)
		{
			System.out.println(Ans);
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char currChar = str.charAt(i);
			String currString = str.substring(0,i)+str.substring(i+1);
			BackTracking(currString, Ans+currChar,i+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ABC";
		BackTracking(str,"",0);

	}

}
