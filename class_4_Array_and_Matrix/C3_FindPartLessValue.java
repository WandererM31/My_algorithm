//二分查找
//一个数组无序，任意相邻两数不相等，寻找一个局部极小值即可，一个就行，返回索引位置
//如果0<1则0位置为极小值，N-2>N-1则N-1为极小值，中间的数比两边都小则为极小值
//如果0，N-1都不是极小，极小一定在中间某位置，有界性与最大值最小值定理
//要求时间复杂度O(logN)不要遍历数组(顺序查找O(N))
package class_4_Array_and_Matrix;

public class C3_FindPartLessValue {
	
	public static int find(int[] arr)
	{
		if(arr.length==0||arr==null) {
			return -1; //return写在条件判断里面可以的，不是非要写在最后面
		}
		if(arr[0]<arr[1]||arr.length==1){ //先判断是否在两侧
			return 0;
		}
		if(arr[arr.length-2]>arr[arr.length-1]){
			return arr.length -1;
		}                          //两侧都没有，开始二分
		int mid = 0; //应该怎么设才不会和最小值混淆？万一用户的最小值是零，我怎么知道是找到了还是没找到
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
		
		return left; //始终返回最小值
	}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {5,4,6,7,3,8,9,0,3,7,2,1,5,6};
        int b=find(arr);
        System.out.println(b);
        
	}

}
