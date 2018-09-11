import com.nk.stack.core.SimpleStack;

public class SimpleStackMain
{
	public static void main(String args[])
	{
		SimpleStack stack = new SimpleStack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.printAll();
		
		System.out.println(stack.length());
		
		stack.push(60);
		stack.push(70);
		
		stack.printAll();
		
		System.out.println(stack.length());
		
		stack.printAll();
	}
}
