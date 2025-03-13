
public class stackExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 stack st=new stack(5);
	        try
	        {
	        st.push(10);
	        st.push(15);
	        st.push(10);
	        st.push(15);
	        st.push(10);
	        st.push(15);
	        
	        }
	        catch(stackOverFlowException s)
	        {
	            System.out.println(s);
	        }
	        

	}

}

class stack
{
	int top = -1;
	int s[];
	int size;
	
	public stack(int sz)
    {
        size=sz;
        s=new int[sz];
    }
	
	public void push(int x) throws stackOverFlowException
	{
		if (top == size-1)
		{
		 throw new stackOverFlowException();
		}
		else
		{
			top++;
	        s[top]=x;
		}
	}
	public int pop() throws stackUnderFlowException
	{
		int x=-1;
		
		if(top == x)
		{
		throw new stackUnderFlowException();
		}
		else 
		{
			x=s[top];
	        top--;
	        return x;   
		}
	}
}

class stackOverFlowException extends Exception
{
	public String toString()
	{
	return "Stack is OverFlow";
	}
}

class stackUnderFlowException extends Exception
{
	public String toString()
	{
	return "Stack is UnderFlow";
	}
}
