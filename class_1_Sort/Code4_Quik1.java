//2018.5.17快排
/*
1.给定一个数组arr， 和一个数num， 请把小于等于num的数放在数组的左边， 大于num的数放在数组的右边。
要求额外空间复杂度O(1)， 时间复杂度O(N)
小于等于区，遍历数组生成。当前数<=P则当前数与小于区下一个数交换，小于区扩充一位；
当前数>P不动，索引下一个

 */

package class_1_Sort;

public class Code4_Quik1 {
	
    public static void quick(int[] arr, int P){
    	int less=-1;//小于区的索引位置
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]<=P) { //如果当前数小于P则
    			less++;   //大于区向右扩一位
    			/*int temp;
    	    	temp = arr[i];
    	    	arr[i] = arr[less];
    	    	arr[less] = temp;
    	    	*/
    			swap(arr,i,less);	//当前数与大于区新扩的位置的数交换
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
