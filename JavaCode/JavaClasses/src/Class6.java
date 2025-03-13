
public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College [] s = new College[3];
		s[0] = new College("A123","Bindu","ECE",new String[] {"OS","ALGO","CS","DS"});
		s[1] = new College("B123","Hima","CSE",new String[] {"Java","Algorithms","Python","C++"});
		s[2] = new College("C123","Manikarao","IT",new String[] {"Java","Python","Data structors","C"});
		
		System.out.println(s[0].Details());
		System.out.println(s[1].Details());
		System.out.println(s[2].Details());
	}

}

class College
{
	private String rollNo;
	private String name;
	private String dept;
	private String[] sub;
	
	public College(String rollNo, String name, String dept, String[] sub)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
		this.sub = sub;
	}
	
	public String getRollNo() {return rollNo;}
	public String getName() {return name;}
	public String getDept() {return dept;}
	public String[] getsub() {return sub;}
	
	public void setDept(String d) { dept = d;}
	
	public void setSub(String ...sub)
	{
		for(int i=0;i<sub.length;i++)
		{
			this.sub[i] = sub[i]; 
		}
	}
	
	public String Details()
	{
		String Allsubs= " ";
		for (String x:sub)
		{
			Allsubs = Allsubs + x + ", ";
		}
		return("Details of the Student : RollNo - "+ rollNo + ", Name - "+ name +", Dept - "+ dept + "List of Subjects - " + Allsubs);
	}
}