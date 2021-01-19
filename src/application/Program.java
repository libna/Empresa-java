package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employe;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employees");
		int numerOfEmployees = sc.nextInt();
		List<Employe> listOfEmploye = new ArrayList<>();
		
		
		for (int i = 1; i <= numerOfEmployees; i++) {
			sc.nextLine();
			System.out.println("funcionario de fora?(y/n) ");
			String tipoDeFunc = sc.nextLine();
			if(tipoDeFunc.equals("y")) {
				System.out.println("Name: ");
				String name = sc.nextLine();
				
				System.out.println("Hours: ");
				int hours = sc.nextInt();

				System.out.println("Value per Hour: ");
				Double valuePerHour = sc.nextDouble();
				
				System.out.println("Value per Hour: ");
				Double additionalCharge = sc.nextDouble();
				
				OutsourcedEmployee oe = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				
				listOfEmploye.add(oe);
			}else {
				System.out.println("Name: ");
				String name = sc.nextLine();
				
				System.out.println("Hours: ");
				int hours = sc.nextInt();

				System.out.println("Value per Hour: ");
				Double valuePerHour = sc.nextDouble();
				
				Employe emp = new Employe(name, hours, valuePerHour);
				
				listOfEmploye.add(emp);
			}
			
		}
		
		sc.close();
		
		System.out.println("Payment");
		for (Employe employe : listOfEmploye) {
			System.out.println(employe.getName());
			System.out.println(employe.payment());
		}
		
	}
}
