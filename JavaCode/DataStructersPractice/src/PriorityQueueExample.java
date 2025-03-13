import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.addAll(Arrays.asList(3,16,27,13,43,55,8,10,69));
		
		pq.forEach(x -> System.out.print(x+" "));
		
		pq.poll();
		
		pq.forEach(x -> System.out.print(x+" "));
		
		
		
		

	}

}
