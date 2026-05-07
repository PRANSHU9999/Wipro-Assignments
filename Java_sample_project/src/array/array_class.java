package array;

public class array_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {98,78,99,66,76}; //dynamic array
		int [] arr1=new int[5]; //static array
		arr1[3]=10;
		System.out.println(arr[4]);
		System.out.println(arr1[4]);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		//2d array
		int[][] a= {{20,40},
					{50,60,70},
					{90,80,70,60}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");;
			}
			System.out.println();
		}
	}

}
