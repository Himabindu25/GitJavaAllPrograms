import java.util.*;

public class interProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData d = new MyData();
		producer p = new producer(d);
		consumer c = new consumer(d);
		
		p.start();
		c.start();
	}

}
class MyData
{
	int value = 0;
	boolean flag = true;
	
	synchronized public void setData(int value)
	{
		while(flag!=true)
			try {wait();}catch(Exception e) {}
		this.value = value;
		flag = false;
		notify();
		
	}
	
	synchronized public int getData()
	{
		int x = 0;
		while(flag!=false)
			try {wait();}catch(Exception e) {}
		x = value;
		flag = true;
		notify();
		
		return x;
	}

}

class producer extends Thread
{
	MyData data;
	
	public producer(MyData d)
	{
		this.data = d;
	}
	
	public void run() {
		 int count=1;
	        while(true)
	        {
	            data.setData(count);
	            System.out.println("Producer "+count);
	            count++;
	        }
		
	}
}

class consumer extends Thread
{
MyData d;
	
	public consumer(MyData d)
	{
		this.d = d;
	}

	public void run() {
		 int value;
	        while(true)
	        {
	            value=d.getData();
	            System.out.println("Consumer "+value);
	        }
		
	}
	
}
