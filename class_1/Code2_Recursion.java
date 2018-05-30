//2018.5.15递归方法,求最大值
//递归概念过程：
//递归实现：系统堆栈实现
//master公式用法总结：

package class_1;

public class Code2_Recursion {
	
	//没定义新的类，这是属于class Code2_Recursion的静态方法
	//数据结构主要都在一个类下调用方法，面向过程
	public static int getMax(int[] arr, int left, int right) 
	{
		if(left==right) {
			return arr[left];
		}
		int mid = (left+right)/2;//问题分为两个部分，b=2
		int leftMax = getMax(arr,left,mid);//子过程执行了两次,a=2
		int rightMax = getMax(arr,mid+1, right);
		return Math.max(leftMax, rightMax);//返回最大值
		//master公式，额外时间复杂度为O(1),T(N)=2*T(N/2)+O(1)
	}

	
	public static void main(String[] args) {   //主调静态方法
		int[] arr = {3,5,2,6,9,15,1,4,7};
		int a=getMax(arr,0,arr.length-1);
		System.out.println(a); //不可以直接输出getMax
		// TODO Auto-generated method stub

	}

}
