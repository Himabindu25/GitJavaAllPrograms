import java.util.*;

class Point implements Comparable<Object>
{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString()
	{
		return ("x = "+ x + " , y = "+y);
	}
	
	public int compareTo(Object o) {
		Point p = (Point)o;
		
		if(this.x < p.x)
			return -1;
		else if(this.x > p.x)
			return 1;
		else
		{
			if (this.y<p.y)
				return -1;
			else if (this.y>p.y)
				return 1;
			else 
				return 0;
		}
		
	}
	
	
}
public class CompareToPointExample {

	public static void main(String[] args) {
		TreeSet<Point> t = new TreeSet<>();
		
		t.add(new Point(1,1));
		t.add(new Point(5,3));
		t.add(new Point(3,4));
		
		System.out.print(t);
		
		

	}

}
