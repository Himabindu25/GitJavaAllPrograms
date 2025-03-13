
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child x = new child();
		child b = new child(1);

	}

}

class parent
{
	private int x;
	public parent()
	{
		System.out.println("Non paramertised constructor");
	}
	public parent(int x)
	{
		System.out.println("Paramertised constructor");
	}
}

class child extends parent
{
	public child()
	{
		System.out.println("Non paramertised constructor");
	}
	public child(int x)
	{
		System.out.println("Paramertised constructor");
	}
}
