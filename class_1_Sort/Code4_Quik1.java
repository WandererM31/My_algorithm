//2018.5.17����
/*
1.����һ������arr�� ��һ����num�� ���С�ڵ���num���������������ߣ� ����num��������������ұߡ�
Ҫ�����ռ临�Ӷ�O(1)�� ʱ�临�Ӷ�O(N)
С�ڵ������������������ɡ���ǰ��<=P��ǰ����С������һ����������С��������һλ��
��ǰ��>P������������һ��

 */

package class_1_Sort;

public class Code4_Quik1 {
	
    public static void quick(int[] arr, int P){
    	int less=-1;//С����������λ��
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]<=P) { //�����ǰ��С��P��
    			less++;   //������������һλ
    			/*int temp;
    	    	temp = arr[i];
    	    	arr[i] = arr[less];
    	    	arr[less] = temp;
    	    	*/
    			swap(arr,i,less);	//��ǰ���������������λ�õ�������
    		}   					
    	}
    }
    public static void swap(int[] arr, int i, int j)
    {
    	int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
    }
    public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {3,2,7,6,5,4,0};
        int P = 4;
		quick(arr,P);
		printArray(arr);
	}

}
