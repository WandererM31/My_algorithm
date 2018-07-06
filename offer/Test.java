package offer;

public class Test {
	
	public static int findMax(int[] arr,int left,int right) {
		if(left==right) return left;
		int max=left;
		for(int i=left;i<=right;i++)
		{
			if(i+1<=right&&arr[i+1]>=arr[max])
			{
				max=i+1;
			}
		}
		System.out.println("max="+max);
		return max;
	}
	
	public static int count(int[] arr,int left ,int right)
	{
		//给定左右边界，求和，从左+1开始到右-1
		int sum=0;
		int aa = Math.min(arr[left], arr[right]);
		for(int i = left+1;i<right;i++)
		{
			sum+=aa-arr[i];
		}

		//int[] b={left,right,sum};
		return sum;
	}
	
	public static int trap(int[] a)
	{
		int left = 0;
		int right = 1;
		int sum=0;
		
		//如果左小于等于右，则一直找，直到
		while(right<=a.length-1 && a[left]<a[right])
		{
			left++;
			right++;
			if(right==a.length){
				System.out.println("数组单调递增无法盛水");
				return sum=0;
			}
		}
		
		while(right<=a.length-1 && a[left]>a[right])
		{
			left++;
			right++;
			if(right==a.length){
				System.out.println("数组单调递减无法盛水");
				return sum=0;
			}
		}
		
	    //其他情况：
		left = 0;
		right = 1;
		while(right <= a.length-1 && left <= a.length-1) {
			while(right <= a.length-1 && left <= a.length-1 &&a[left]>a[right]) {
				right++; //找到第一个比左边大的值
			}	
			
			if(right == a.length) { //最左一直大于所有最右值
				//right-max,suan
				right=findMax(a,left+1,a.length-1);
			    //count
				int b=count(a,left,right);
				left=right;
				right++;
				System.out.println("left="+left+" right="+right+" sum="+sum);
		        sum+=b;	
			}else {
				//right<a.length
				sum+=count(a,left,right);
				left=right;
				right++;
			}
		}		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,3,0,2,0,1};
		int sum=trap(a);
		System.out.println("sum="+sum);

	}

}
