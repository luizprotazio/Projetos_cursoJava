package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ExercVect1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores = ");
		for(int i=0; i<n; i++) {
			System.out.print(vect[i]);
			System.out.printf("   ");
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		System.out.println();
				System.out.printf("SOMA = %.2f%n", sum);
				System.out.printf("MEDIA = %.2f%n", avg);
		
		sc.close();
		}
	}
