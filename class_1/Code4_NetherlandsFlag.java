//2018.5.17����
/*
 * 2.������������
����һ������arr�� ��һ����num�� ���С��num���������������ߣ� ����num��������������м䣬 ����num�������������
�ұߡ�
Ҫ�����ռ临�Ӷ�O(1)�� ʱ�临�Ӷ�O(N)
 */
package class_1;

public class Code4_NetherlandsFlag {

	public static int[] quick(int[] arr, int L, int R, int P){
    	int less= L - 1;
    	int more= R + 1;
    	while(L < more) {
    		if(arr[L]<P) {
    			swap(arr,L++,++less);		
    		}else if(arr[L]>P) {
    			swap(arr,L,--more);
    		}else {
    			L++;
    		}
    	}
    	return new int[]{less+1, more-1};	//���Ϊɶ���������ס
   	
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
        int[] arr = {3,2,7,6,5,4,0,4,4,4};
        int P = 4;
		int[] Equal = quick(arr,0, arr.length-1, P);
		printArray(arr);
		printArray(Equal);//���ص����������ұ߽�
	}
}
