//2018.5.29
//ϵͳ����ʹ�÷���������add,offer,peek,poll
package class_2_Stack_and_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class C3_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Queue<Integer> queue = new LinkedList<Integer>();
        System.out.println(queue.offer(3)); //����,�ɼӷ���true��
        System.out.println(queue.add(4)); //�������ɼӷ���true�������׳��쳣
        System.out.println(queue.size());
        System.out.println(queue.peek()); //���ض���ͷ�������ӣ���Ԫ�ط���null
        System.out.println(queue.poll()); //���ض���ͷ�����ӣ���Ԫ�ط���null
        System.out.println(queue.peek());

        System.out.println(queue.remove());//���ӣ���Ԫ���׳��쳣
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        //System.out.println(queue.element());//���ض���ͷ�������ӣ���Ԫ���׳��쳣
        System.out.println(queue.size());
	}

}
