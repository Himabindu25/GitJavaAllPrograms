
public class GenericExample {
	
	static <T> void print(MyArray<? super b> obj)
	{
		obj.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyArray<b> m = new MyArray<>();
		
		print(m);
	
	}

}
class a{}
class b extends a{}
class c extends b{}

class MyArray<T extends a>
{
	@SuppressWarnings("unchecked")
	T[] ma = (T[]) new Object[10];
	int length = 0;
	
	public void append(T v)
	{
	  ma[length++] = v;
	}
	public void display()
	{
		for(int i=0;i<length;i++)
		{
			System.out.println(ma[i]);
		}
	}	
}

