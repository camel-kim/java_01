package day08;

public class Ex01_arr {
	public static void main(String[] args) {
		//2차원 배열
		int arr[][] = new int[][] { { 1, 2 }, { 10, 20 } };
		int i = 0;
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		for(i = 0; i < arr.length ; i++ );{
			for(int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j] + ",");
			}
		}
		for(int[] a : arr) {
		      for(int k : a) {
		         System.out.print(k+", ");
		      }
		      System.out.println();
		   }
	}
}
