package startstudy;

import java.util.Scanner;

public class start1979 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int i = 1; i < tc+1; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[m];
			
			for (int j = 0; j < arr1.length; j++) {
				arr1[j] = sc.nextInt();
			}
			for (int j = 0; j < arr2.length; j++) {
				arr2[j] = sc.nextInt();
			}
			
			int result = 0;
			if (arr1.length > arr2.length) {
				for (int j = 0; j < arr1.length - arr2.length + 1; j++) {
					int max = 0;
					for (int k = 0; k < arr2.length; k++) {
						max += arr1[k+j] * arr2[k];
					}
					result = Math.max(max, result);
				}
			}else {
				for (int j = 0; j < arr2.length - arr1.length + 1; j++) {
					int max = 0;
					for (int k = 0; k < arr1.length; k++) {
						max += arr2[k+j] * arr1[k];
					}
					result = Math.max(max, result);
				}
			}
			
			System.out.printf("#%d %d\n" ,i, result);
		}
	}

}
