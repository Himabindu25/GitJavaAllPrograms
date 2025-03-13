
public class InterfacesPractice {

	public static void main(String[] args) {
	   
		customer c = new customer("Bindu");
		customer c1 = new customer("Akshay");
		customer c2 = new customer("Prashanth");
		customer c3 = new customer("Sravya");
		
		store s = new store();
		s.register(c);
		s.register(c1);
		s.register(c2);
		s.register(c3);
		s.invitesale();
	}

}

class store{
	 member mem[] = new member[10];
	 int count = 0;
	 
	 void register(member m)
	 {
		 mem[count++] = m;
	 }
	 void invitesale()
	 {
	 for(int i=0;i<count;i++)
	 {
		 mem[i].callback();
	 }
	 }
}

class customer implements member {
	
	String name;
	
	public customer(String n)
	{
		name = n;
	}
	public void callback()
	{
		System.out.println(name + " will attend ");
	}
}

interface member{
	void callback();
}