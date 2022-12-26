package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluguel;

public class Program_Quarto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Aluguel[] vect = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		for(int i=1 ; i<=n;i++) {
			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Aluguel(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados: ");
		for(int i=0;i<10;i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
		
	}
}
