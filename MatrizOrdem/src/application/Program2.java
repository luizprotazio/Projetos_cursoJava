package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] exemat = new int[n][m];
		
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				exemat[i][j] = sc.nextInt();
			}
		}
		
		int numb = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if (exemat[i][j] == numb) {
					System.out.println("Position " + i + "," + j);
					if(j > 0) {
						System.out.println("Left: " +exemat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + exemat[i-1][j]);
					}
					if(j < exemat[i].length-1) {
						System.out.println("Right: " + exemat[i][j+1]);
					}
					if(i < exemat.length-1) {
						System.out.println("Down: " + exemat[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
}
