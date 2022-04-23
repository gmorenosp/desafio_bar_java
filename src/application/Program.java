package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		Bill.gender = sc.next().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		Bill.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		Bill.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		Bill.barbecue = sc.nextInt();
		
		Bill bill = new Bill();
	    System.out.println(bill);
		sc.close();
	}
}




























//System.out.println();
//System.out.println("RELATÓRIO:");
//double consumo = Bill.feeding();
//System.out.printf("Consumo = R$ %.2f\n", consumo);
//
//double couvert = Bill.cover();
//if (couvert != 0) {
//	System.out.printf("Couvert = R$ %.2f\n", couvert);
//}
//else {
//	System.out.println("Isento de Couvert");
//}
//
//double ingresso = Bill.ticket();
//System.out.printf("Ingresso = R$ %.2f\n", ingresso);
//System.out.println();
//
//double total = Bill.total();
//System.out.printf("Valor a pagar = R$ %.2f\n", total);

