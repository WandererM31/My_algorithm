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
		//�������ұ߽磬��ͣ�����+1��ʼ����-1
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
		
		//�����С�ڵ����ң���һֱ�ң�ֱ��
		while(right<=a.length-1 && a[left]<a[right])
		{
			left++;
			right++;
			if(right==a.length){
				System.out.println("���鵥�������޷�ʢˮ");
				return sum=0;
			}
		}
		
		while(right<=a.length-1 && a[left]>a[right])
		{
			left++;
			right++;
			if(right==a.length){
				System.out.println("���鵥���ݼ��޷�ʢˮ");
				return sum=0;
			}
		}
		
	    //���������
		left = 0;
		right = 1;
		while(right <= a.length-1 && left <= a.length-1) {
			while(right <= a.length-1 && left <= a.length-1 &&a[left]>a[right]) {
				right++; //�ҵ���һ������ߴ��ֵ
			}	
			
			if(right == a.length) { //����һֱ������������ֵ
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
