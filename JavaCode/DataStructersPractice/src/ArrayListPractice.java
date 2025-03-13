import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.offerLast(10);
		ad.offerLast(20);
		
		ad.forEach((x)-> System.out.print(x));
		
		System.out.println(ad.peekFirst());
		
		ArrayList<Integer> al = new ArrayList<>();
		
		ArrayList<Integer> al1 = new ArrayList<>(List.of(50,60,70,20,30));
		
		al.add(10);
		al.add(0, 20);
		al.addAll(al1);
		al.addAll(4, al1);
		
		System.out.println(al);
		
		System.out.println(al.contains(15));
		System.out.println(al.equals(al1));
		System.out.println(al.indexOf(30));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf(20));
		System.out.println(al.size());
		System.out.println(al.get(6));
		
		Object[] a = al.toArray();
		
		for(Object x:a)
		    System.out.print(x);
		
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+ " ");
		}
		
		for(Iterator<Integer> it1= al.iterator();it1.hasNext();)
		{
			System.out.print(it1.next()+ " ");
		}
		
		al.forEach(n -> System.out.print(n+ " "));
		
		al.forEach(System.out::print);
		
		
		

	}

}
