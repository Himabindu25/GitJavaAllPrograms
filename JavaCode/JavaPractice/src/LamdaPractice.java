
import java.util.*;
@FunctionalInterface
interface Lamdafun{
	public int display(String s1, String s2);
}

public class LamdaPractice {
	
	public static void reverse(String s){
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

	public static void main(String[] args) {
		Lamdafun lf = String::compareTo;
		
		System.out.println(lf.display("Hello","hello"));
		
		reverse("Hello");
		

	}

}
