//2018.5.17归并排序
//用递归的方法把一个数组分成两部分，使其左有序右有序，再用外排的方式使整体有序（新建一数组有序再拷贝回原数组）
//复杂度：
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
		process(arr, l, mid); //递归具体过程先别深究，就认为这两行执行完后
		process(arr, mid + 1, r);//左右数组都分别有序了
		merge(arr, l, mid, r);  //外排的方式使整体有序  其实就是一个递归外排
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
