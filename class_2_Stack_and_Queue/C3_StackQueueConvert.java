//2018.5.29��3�ε�3��
//��ν��ö��нṹʵ��ջ�ṹ����ν���ջ�ṹʵ�ֶ��нṹ��
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
	//ʵ�ֶ��е��������ܣ���ӣ����ӣ��鿴��ͷԪ��
	public void add(int num)
	{
		//���գ���1�ӣ�1��2���գ���1�ӣ�������1����2�գ��ɼӲ���
		//��ΪֻҪ2���˾Ͱ�1���⣬2������Ϊ��Ҳ��������
		stack1.push(num);
	}
	public int poll()
	{
		//2���գ����û����أ�2�գ���1����2��1����ʾnull
		if(stack2.empty()) { //���2�մ�1��
			//��������׳��쳣�����߲�д��ֱ���������return�׳��쳣
			while(!stack1.empty()) { //һֱ��1����
				stack2.push(stack1.pop()); 
			}
		}
		return stack2.pop();
	}
/*	public int peek()
	{
		Ӧ�ø�����һģһ��
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
		if(queue1.isEmpty()&&queue2.isEmpty()) //��Ϊ���׳��쳣
		{
			throw new RuntimeException("Stack is empty!");
		}
		if(!queue1.isEmpty()) {//���1���� 
			while(queue1.size()-1 > 0)
			{
				queue2.add(queue1.poll()); //1��2
			}
			value = queue1.poll(); //��ʣ��1��ķ����û�

		}else if(!queue2.isEmpty()){ //���1��2����
			while(queue2.size()-1 > 0)
			{
				queue1.add(queue2.poll());//2��1
			}
			value = queue2.poll();//��ʣ��2��ķ����û�
			//1��2���ص���Ҳ������һ�����а�1��2���ڴ潻����ʼ����1��2
		}
		return value;
	}
/*   public int peek()
	{
		return
	}
*/
}