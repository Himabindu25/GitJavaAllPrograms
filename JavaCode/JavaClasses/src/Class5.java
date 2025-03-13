
public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product p = new Product("ATE-123");
        Product p1 = new Product("ATE-123","Hair Brush",3.5,5);
        
        System.out.println(p.Details());
        System.out.println(p1.Details());
	}

}

class Product
{
	private String itemNo;
	private String name;
	private double price;
	private int qty;
	
	
	public Product(String i)
	{
		this.itemNo = i;
		this.name = " Unknown";
		this.price = 0.0;
		this.qty = 0;
	}
	public Product(String i,String n)
	{
		this.itemNo = i;
		this.name = n;
		this.price = 0.0;
		this.qty = 0;
	}
	
	public Product(double p)
	{
		this.itemNo = "unknow";
		this.name = " Unknown";
		this.price = p;
		this.qty = 0;
	}
	
	public Product(int q)
	{
		this.itemNo = "unknow";
		this.name = " Unknown";
		this.price = 0.0;
		this.qty = q;
	}
	
	public Product(String i,String n,double p, int q)
	{
		this.itemNo = i;
		this.name = n;
		this.price = p;
		this.qty = q;
	}
	
	public String getItemNo()
	{
		return itemNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double p)
	{
		if(p < 0)
			price = 0.0;
		else
			price = p;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty(int q)
	{
		if(q < 0)
			qty = 0;
		else
			qty = q;
	}
	
	public String Details()
	{
		return ("Details of the iteam - Iteam number - " + itemNo +", Product number - " + name + ", Price - " + price + ", quantity - " + qty);
	}
	
}