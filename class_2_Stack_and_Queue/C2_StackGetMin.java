//2018.5.28
//设计一个栈可以随时返回所有元素中的最小值，可用系统栈，要求getmin时间复杂度O(1)
package class_2_Stack_and_Queue;
import java.util.Stack;

public class C2_StackGetMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//这个过程不能随时存取，要打包成类的形式，用函数当成接口存取，黑盒
/*		Stack<Integer> stackdata = new Stack<Integer>();
		Stack<Integer> stackmin = new Stack<Integer>();
		int[] a= {3,4,5,4,6,1};
		
		//压入：
		for(int i=0;i<a.length;i++)
		{
			if(stackmin.empty()||a[i]<=stackmin.peek()) {
				stackdata.push(a[i]);
				stackmin.push(a[i]);
			}else if(a[i]>stackmin.peek())
			{
				stackdata.push(a[i]);
				stackmin.push(stackmin.peek());
			}
			System.out.println(stackmin.peek());//随时返回最小栈栈顶的值
		}
		
		//验证压入过程正确：
		System.out.println("数据栈"); 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(stackdata.pop()+" ");
		}
		System.out.println("\n"+"最小栈");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(stackmin.pop()+" ");
		}
		

	}
	*/
		Stack_getmin stack1 = new Stack_getmin();
		stack1.push(4);
		System.out.println(stack1.getMin());
		stack1.push(3);
		System.out.println(stack1.getMin());
		stack1.push(5);
		stack1.push(1);
		System.out.println(stack1.getMin());
		System.out.println(stack1.pop());
		System.out.println(stack1.getMin());
		

 }
}
class Stack_getmin{
	private Stack<Integer> stackdata = new Stack<Integer>();
	private Stack<Integer> stackmin = new Stack<Integer>();
	public void push(int num)
	{
		if(stackmin.empty()|| num<=stackmin.peek()) {
			stackdata.push( num);
			stackmin.push( num);
		}else if(num>stackmin.peek())
		{
			stackdata.push(num);
			stackmin.push(stackmin.peek());
		}
	}
	public int pop()
	{   
		if (stackdata.isEmpty()) {
			throw new RuntimeException("Your stack is empty.");
		}
		int value = stackdata.pop(); //弹出数据栈就行了，辅助的最小栈应该不用返回弹出
		stackmin.pop();  //随着数据栈弹出即可
		return value;
	}
	
	public int getMin()
	{
		int min = stackmin.peek();//随时返回栈顶
		return min;
	}
}
