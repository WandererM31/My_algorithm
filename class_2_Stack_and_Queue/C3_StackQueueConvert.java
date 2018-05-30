//2018.5.29第3课第3题
//如何仅用队列结构实现栈结构？如何仅用栈结构实现队列结构？
package class_2_Stack_and_Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class C3_StackQueueConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_to_Queue queue = new Stack_to_Queue();
		queue.add(4);
		queue.add(5);
		queue.add(6);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
        queue.add(7);
        queue.add(8);
        System.out.println(queue.poll());
        System.out.println("=================");
        
        Queue_to_Stack stack = new Queue_to_Stack();
        //stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
        
        
    
	}

}

class Stack_to_Queue
{
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	public Stack_to_Queue(){
		this.stack1 = new Stack<Integer>();
		this.stack2 = new Stack<Integer>();
	}
	//实现队列的三个功能，入队，出队，查看队头元素
	public void add(int num)
	{
		//都空，给1加；1空2不空，给1加，不倒；1不空2空，可加不倒
		//因为只要2空了就把1倒光，2个都不为空也可以随便加
		stack1.push(num);
	}
	public int poll()
	{
		//2不空，给用户返回；2空，从1倒；2空1空提示null
		if(stack2.empty()) { //如果2空从1倒
			//如果都空抛出异常，或者不写，直接让下面的return抛出异常
			while(!stack1.empty()) { //一直把1倒光
				stack2.push(stack1.pop()); 
			}
		}
		return stack2.pop();
	}
/*	public int peek()
	{
		应该跟出队一模一样
	}*/
}

class Queue_to_Stack
{
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;
	public Queue_to_Stack()
	{
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}
	public void push(int num) {
		queue1.add(num);		
	}
	public int pop()
	{
		int value=0;
		if(queue1.isEmpty()&&queue2.isEmpty()) //都为空抛出异常
		{
			throw new RuntimeException("Stack is empty!");
		}
		if(!queue1.isEmpty()) {//如果1不空 
			while(queue1.size()-1 > 0)
			{
				queue2.add(queue1.poll()); //1倒2
			}
			value = queue1.poll(); //把剩在1里的返回用户

		}else if(!queue2.isEmpty()){ //如果1空2不空
			while(queue2.size()-1 > 0)
			{
				queue1.add(queue2.poll());//2倒1
			}
			value = queue2.poll();//把剩在2里的返回用户
			//1和2来回倒，也可以另开一个队列把1倒2后，内存交换，始终让1倒2
		}
		return value;
	}
/*   public int peek()
	{
		return
	}
*/
}