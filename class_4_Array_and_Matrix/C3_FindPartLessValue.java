//���ֲ���
//һ��������������������������ȣ�Ѱ��һ���ֲ���Сֵ���ɣ�һ�����У���������λ��
//���0<1��0λ��Ϊ��Сֵ��N-2>N-1��N-1Ϊ��Сֵ���м���������߶�С��Ϊ��Сֵ
//���0��N-1�����Ǽ�С����Сһ�����м�ĳλ�ã��н��������ֵ��Сֵ����
//Ҫ��ʱ�临�Ӷ�O(logN)��Ҫ��������(˳�����O(N))
package class_4_Array_and_Matrix;

public class C3_FindPartLessValue {
	
	public static int find(int[] arr)
	{
		if(arr.length==0||arr==null) {
			return -1; //returnд�������ж�������Եģ����Ƿ�Ҫд�������
		}
		if(arr[0]<arr[1]||arr.length==1){ //���ж��Ƿ�������
			return 0;
		}
		if(arr[arr.length-2]>arr[arr.length-1]){
			return arr.length -1;
		}                          //���඼û�У���ʼ����
		int mid = 0; //Ӧ����ô��Ų������Сֵ��������һ�û�����Сֵ���㣬����ô֪�����ҵ��˻���û�ҵ�
		int left = 1;
		int right = arr.length-2;
		while (left<right)
		{
			mid = (left+right)/2;
			if (arr[mid] > arr[mid - 1]) {
				right = mid - 1;
			} else if (arr[mid] > arr[mid + 1]) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		
		return left; //ʼ�շ�����Сֵ
	}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {5,4,6,7,3,8,9,0,3,7,2,1,5,6};
        int b=find(arr);
        System.out.println(b);
        
	}

}
