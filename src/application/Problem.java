package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PersonLegal;
import entities.PhysicalPerson;
import entities.TaxPayer;

public class Problem {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1 ;  i <= n ; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome =sc.nextDouble();
			
			if (resp == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpeding = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healthSpeding));
			}
			else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new PersonLegal(name, annualIncome, numberEmployees));
			}			
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double totalTax = 0.0;
		
		for(TaxPayer taxPayers : list) {
			System.out.println(taxPayers);
			totalTax += taxPayers.TaxesPay();
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + totalTax);
		sc.close();
	}

}
