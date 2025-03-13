public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "programmer@gmail.com";
		
		String Username = str1.substring(0, str1.indexOf('@'));
		String Domain = str1.substring((str1.indexOf('@')+1),str1.length());
		
		System.out.println("Username : " + Username);
		System.out.println("Domain : " + Domain);
		
		System.out.println(Domain.contains("gmail"));
		
		int b = 1000111;
		
		String str = String.valueOf(b);
		
		System.out.println(str.matches("[01]+"));
		
		int h = 0X12AF;
		
		String str2 = String.valueOf(h);
		
		System.out.println(str2.matches("[A-Z0-9]+"));
		
		String date = "01/01/2025";
		
		System.out.println(date.matches("[0-9]+/[0-9]+/[0-9]+"));
		
		String s = "a!b@C#1%2^3&u";
		String s1 = s.replaceAll("\\W*", "");
		System.out.println(s1);
		
		String sp = "a b       C%%%%%     1     2     3      u";
		String sp1 = sp.replaceAll("\\s+", " ").trim();
		System.out.println(sp1);
		
		String words[] = sp1.split("\\s");
		
		System.out.println(words.length);
	}
}