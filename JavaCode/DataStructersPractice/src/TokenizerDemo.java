import java.util.*;

public class TokenizerDemo {

	public static void main(String[] args) {
		String str = new String("Name=Bindu;Age=26;State=Maryland");
		
		StringTokenizer s = new StringTokenizer(str,"=;");
		
		ArrayList<String> al = new ArrayList<>();
		
		while(s.hasMoreTokens())
		{
			String k = s.nextToken();
			al.add(k);
		}
		System.out.print(al);
		
		}
	}
