//2018.5.29
//系统队列使用方法：常用add,offer,peek,poll
package class_2_Stack_and_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class C3_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Queue<Integer> queue = new LinkedList<Integer>();
        System.out.println(queue.offer(3)); //加数,可加返回true，
        System.out.println(queue.add(4)); //加数，可加返回true，否则抛出异常
        System.out.println(queue.size());
        System.out.println(queue.peek()); //返回队列头，不出队，空元素返回null
        System.out.println(queue.poll()); //返回队列头，出队，空元素返回null
        System.out.println(queue.peek());

        System.out.println(queue.remove());//出队，空元素抛出异常
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        //System.out.println(queue.element());//返回队列头，不出队，空元素抛出异常
        System.out.println(queue.size());
	}

}
