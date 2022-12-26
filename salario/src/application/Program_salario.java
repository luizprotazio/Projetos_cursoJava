package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.ContratoHora;
import Entidades.Departamento;
import Entidades.Trabalhador;
import Entidades.enums.NivelTrabalho;

public class Program_salario {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Informe a data de trabalho: ");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Level: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salario Base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalho.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos para este trabalhador? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Informe o contrato #" + i);
			System.out.print("Data (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração (Horas): ");
			int horas = sc.nextInt();
			ContratoHora contrato = new ContratoHora(dataContrato, valorPorHora, horas);
			trabalhador.addContratos(contrato);
		}
		
		System.out.println();
		System.out.print("Informe mes e ano para calcular pagamento(MM/YYYY): ");
		String mesEAno = sc.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + trabalhador.getName());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getName());
		System.out.println("Pagamentos referentes a " + mesEAno + ": " + String.format("%.2f", trabalhador.income(ano, mes)));
		
		sc.close();
	}

}
