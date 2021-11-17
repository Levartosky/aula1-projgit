package application;

import java.util.Scanner;

public class matrizExer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int[][] mtz = new int[n][n];

		for (int i = 0; i < mtz.length; i++) {
			for (int j = 0; j < mtz[i].length; j++) {

				mtz[i][j] = sc.nextInt();

			}			

		}
		System.out.println ("Diagonal numbers: ");
		for (int i=0;i<mtz.length;i++) {
			
			System.out.print(mtz[i][i] + " ");
			
		}
		
		int cont = 0;
		for (int i = 0; i < mtz.length; i++) {
			for (int j = 0; j < mtz[i].length; j++) {

				if (mtz[i][j] < 0) {

					cont++;
				}

			}
				
		}
		System.out.println();
		
		System.out.print("Negative numbers: " + cont);
		
		sc.close();
	}

}
