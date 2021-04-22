import java.util.Stack;

class MyQueue
{
	private Stack<Integer> inStack;
	private Stack<Integer> outStack;

	/** Initialize your data structure here. */
	public MyQueue()
	{
		inStack = new Stack<Integer>();
		outStack = new Stack<Integer>();

	}

	/** Push element x to the back of queue. */
	public void push(int x)
	{
		inStack.push(x);

	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop()
	{
		if (outStack.isEmpty())
		{
			while (!inStack.isEmpty())
			{
				outStack.push(inStack.pop());
			}
		}
		return outStack.pop();
	}

	/** Get the front element. */
	public int peek()
	{
		if (outStack.isEmpty())
		{
			while (!inStack.isEmpty())
			{
				outStack.push(inStack.pop());
			}
		}
		return outStack.peek();

	}

	/** Returns whether the queue is empty. */
	public boolean empty()
	{
		return inStack.isEmpty() && outStack.isEmpty();

	}

	public static void main(String args[])
	{
		// Your MyQueue object will be instantiated and called as such:
		MyQueue obj = new MyQueue();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		int param_2 = obj.pop();
		System.out.println(param_2);
		int param_3 = obj.peek();
		System.out.println(param_3);
		int param_4 = obj.pop();
		int param_5 = obj.pop();
		boolean param_6 = obj.empty();
		System.out.println(param_6);

	}

}
