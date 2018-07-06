//2018.5.11ц╟ещеепР
package class_1_Sort;
//import java.util.Arrays;
public class Code1_BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,7,8,4,34,23,-1,9,6};
		
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
			for(int j=0;j<arr.length;j++)
			{
				for (int i=0;i<arr.length-j-1;i++)
				{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				}
			} 
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}

