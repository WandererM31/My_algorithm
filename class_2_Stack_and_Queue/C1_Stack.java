//2018.5.28理解系统栈的使用语法
//push,pop时间复杂度本来都是O(1)
/*
 * Stack类 
 * 栈：桶型或箱型数据类型，后进先出，相对堆Heap为二叉树类型，可以快速定位并操作 
 * Stack<E>，支持泛型 
 * public class Stack<E> extends Vector<E> 
 * Stack的方法调用的Vector的方法，被synchronized修饰，为线程安全(Vector也是) 
 * Stack methods： 
 * push : 把项压入堆栈顶部 ，并作为此函数的值返回该对象 
 * pop : 移除堆栈顶部的对象，并作为此函数的值返回该对象  
 * peek : 查看堆栈顶部的对象，，并作为此函数的值返回该对象，但不从堆栈中移除它 
 * empty : 测试堆栈是否为空  
 * search : 返回对象在堆栈中的位置，以 1 为基数  
 */  
package class_2_Stack_and_Queue;

import java.util.Stack;

public class C1_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack stackData= new Stack(); //声明定义一个栈结构，跟数组似的
		Stack<Integer> stackData = new Stack<Integer>();
//Integer到底啥意思还是不懂  在这是指定栈元素类型，不指定不行吗？rawtype啥意思
//Double
		stackData.push(5); //压栈
		stackData.push(6);
		System.out.println(stackData.push(8)); //压栈也可以返回值的
		System.out.println(stackData.peek()); //查看栈顶，没元素异常
		System.out.println(stackData.pop());  //弹出,没元素抛出异常
		stackData.pop(); //没打印，也执行弹出操作了
		System.out.println(stackData.peek()); 
		System.out.println(stackData.empty());//栈为空返回true,不为空返回false
		System.out.println(stackData.size()); //返回矢量大小
		stackData.pop();
		System.out.println(stackData.isEmpty());//矢量为空返回true否则返回false
		System.out.println(stackData.empty());

		
	}

}
