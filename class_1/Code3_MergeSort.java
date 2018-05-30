//2018.5.17�鲢����
//�õݹ�ķ�����һ������ֳ������֣�ʹ���������������������ŵķ�ʽʹ���������½�һ���������ٿ�����ԭ���飩
//���Ӷȣ�
package class_1;

public class Code3_MergeSort {
	
	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		process(arr, 0, arr.length - 1);
	}

	public static void process(int[] arr, int l, int r) {
		if (l == r) {
			return;
		}
		//int mid = l + ((r - l) >> 1);
		int mid = (l+r)/2;
		process(arr, l, mid); //�ݹ��������ȱ��������Ϊ������ִ�����
		process(arr, mid + 1, r);//�������鶼�ֱ�������
		merge(arr, l, mid, r);  //���ŵķ�ʽʹ��������  ��ʵ����һ���ݹ�����
	}

	public static void merge(int[] arr, int l, int m, int r) {
		int[] help = new int[r - l + 1];
		int i = 0;
		int p1 = l;
		int p2 = m + 1;
		while (p1 <= m && p2 <= r) {
			help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
		}
		while (p1 <= m) {
			help[i++] = arr[p1++];
		}
		while (p2 <= r) {
			help[i++] = arr[p2++];
		}
		for (i = 0; i < help.length; i++) {
			arr[l + i] = help[i];
		}
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
		int[] arr = {2,5,1,18,-1,6,4,9,0,8,3,3,2,4};
		mergeSort(arr);
		printArray(arr);

	}
}
