//2018.5.28
//���һ��ջ������ʱ��������Ԫ���е���Сֵ������ϵͳջ��Ҫ��getminʱ�临�Ӷ�O(1)
package class_2_Stack_and_Queue;
import java.util.Stack;

public class C2_StackGetMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������̲�����ʱ��ȡ��Ҫ����������ʽ���ú������ɽӿڴ�ȡ���ں�
/*		Stack<Integer> stackdata = new Stack<Integer>();
		Stack<Integer> stackmin = new Stack<Integer>();
		int[] a= {3,4,5,4,6,1};
		
		//ѹ�룺
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
			System.out.println(stackmin.peek());//��ʱ������Сջջ����ֵ
		}
		
		//��֤ѹ�������ȷ��
		System.out.println("����ջ"); 
		for(int i=0;i<a.length;i++)
		{
			System.out.print(stackdata.pop()+" ");
		}
		System.out.println("\n"+"��Сջ");
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
		int value = stackdata.pop(); //��������ջ�����ˣ���������СջӦ�ò��÷��ص���
		stackmin.pop();  //��������ջ��������
		return value;
	}
	
	public int getMin()
	{
		int min = stackmin.peek();//��ʱ����ջ��
		return min;
	}
}
