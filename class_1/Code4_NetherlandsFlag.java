//2018.5.17快排
/*
 * 2.荷兰国旗问题
给定一个数组arr， 和一个数num， 请把小于num的数放在数组的左边， 等于num的数放在数组的中间， 大于num的数放在数组的
右边。
要求额外空间复杂度O(1)， 时间复杂度O(N)
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
    	return new int[]{less+1, more-1};	//这句为啥这样定义记住
   	
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
		printArray(Equal);//返回等于区的左右边界
	}
}
