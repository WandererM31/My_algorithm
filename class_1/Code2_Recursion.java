//2018.5.15�ݹ鷽��,�����ֵ
//�ݹ������̣�
//�ݹ�ʵ�֣�ϵͳ��ջʵ��
//master��ʽ�÷��ܽ᣺

package class_1;

public class Code2_Recursion {
	
	//û�����µ��࣬��������class Code2_Recursion�ľ�̬����
	//���ݽṹ��Ҫ����һ�����µ��÷������������
	public static int getMax(int[] arr, int left, int right) 
	{
		if(left==right) {
			return arr[left];
		}
		int mid = (left+right)/2;//�����Ϊ�������֣�b=2
		int leftMax = getMax(arr,left,mid);//�ӹ���ִ��������,a=2
		int rightMax = getMax(arr,mid+1, right);
		return Math.max(leftMax, rightMax);//�������ֵ
		//master��ʽ������ʱ�临�Ӷ�ΪO(1),T(N)=2*T(N/2)+O(1)
	}

	
	public static void main(String[] args) {   //������̬����
		int[] arr = {3,5,2,6,9,15,1,4,7};
		int a=getMax(arr,0,arr.length-1);
		System.out.println(a); //������ֱ�����getMax
		// TODO Auto-generated method stub

	}

}
