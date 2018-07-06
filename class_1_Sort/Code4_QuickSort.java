//2018.5.18
/*
 * 经典快排：默认以最后一个数为划分值，递归荷兰国旗
 * 复杂度：取决于P值的选取。划分区域不对等最坏情况O(N^2),P值在中间的时候划分对等情况最好，O(N*logN)
 * 改进：常用随机快排，随机选一个数作为划分值
 * 把选出来的数和最后一个数交换，继续用经典快排方法写程序
 * 划分值选得好坏变为概率问题，时间复杂度是一个等概率问题
 * 因此随机快排没有最坏情况，时间复杂度期望值O(N*logN)
 * 空间复杂度：
 *      经典：最好O(logN)保存每次分割的边界点，最坏O(N)
 *      随机：概率问题O(logN)
 * 
 */

package class_1_Sort;

public class Code4_QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
