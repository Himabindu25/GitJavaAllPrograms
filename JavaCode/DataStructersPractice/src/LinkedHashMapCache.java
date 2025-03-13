import java.util.*;

public class LinkedHashMapCache {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5){
			protected boolean removeEldestEntry(Map.Entry e)
			{
				return size()>5;
			}
		};
		
		lhm.put(1,"Bindu");
		lhm.put(3,"Himi");
		lhm.put(2,"Akshay");
		lhm.put(5,"Bunny");
		lhm.put(4,"Sunny");
		
		lhm.get(2);
		lhm.get(3);
		lhm.get(4);
		lhm.get(5);
		
		System.out.println(lhm);	
		
		lhm.put(6,"Himabindu");
		
		lhm.forEach((k,v)->System.out.println(k+" "+v));
		

	}

}
