//2018.5.28���ϵͳջ��ʹ���﷨
//push,popʱ�临�Ӷȱ�������O(1)
/*
 * Stack�� 
 * ջ��Ͱ�ͻ������������ͣ�����ȳ�����Զ�HeapΪ���������ͣ����Կ��ٶ�λ������ 
 * Stack<E>��֧�ַ��� 
 * public class Stack<E> extends Vector<E> 
 * Stack�ķ������õ�Vector�ķ�������synchronized���Σ�Ϊ�̰߳�ȫ(VectorҲ��) 
 * Stack methods�� 
 * push : ����ѹ���ջ���� ������Ϊ�˺�����ֵ���ظö��� 
 * pop : �Ƴ���ջ�����Ķ��󣬲���Ϊ�˺�����ֵ���ظö���  
 * peek : �鿴��ջ�����Ķ��󣬣�����Ϊ�˺�����ֵ���ظö��󣬵����Ӷ�ջ���Ƴ��� 
 * empty : ���Զ�ջ�Ƿ�Ϊ��  
 * search : ���ض����ڶ�ջ�е�λ�ã��� 1 Ϊ����  
 */  
package class_2_Stack_and_Queue;

import java.util.Stack;

public class C1_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack stackData= new Stack(); //��������һ��ջ�ṹ���������Ƶ�
		Stack<Integer> stackData = new Stack<Integer>();
//Integer����ɶ��˼���ǲ���  ������ָ��ջԪ�����ͣ���ָ��������rawtypeɶ��˼
//Double
		stackData.push(5); //ѹջ
		stackData.push(6);
		System.out.println(stackData.push(8)); //ѹջҲ���Է���ֵ��
		System.out.println(stackData.peek()); //�鿴ջ����ûԪ���쳣
		System.out.println(stackData.pop());  //����,ûԪ���׳��쳣
		stackData.pop(); //û��ӡ��Ҳִ�е���������
		System.out.println(stackData.peek()); 
		System.out.println(stackData.empty());//ջΪ�շ���true,��Ϊ�շ���false
		System.out.println(stackData.size()); //����ʸ����С
		stackData.pop();
		System.out.println(stackData.isEmpty());//ʸ��Ϊ�շ���true���򷵻�false
		System.out.println(stackData.empty());

		
	}

}
