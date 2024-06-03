package Sistemas_reservas;

import java.util.Scanner;

public class Sistema_reserva {

	public static void main(String[] args) {
		char asientos[][] = new char[10][10];
		for (int f = 0; f < asientos.length; f++) {
			for (int c = 0; c < asientos.length; c++) {
				asientos[f][c] = 'L';
			}
		}
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		int fila, columna;
		String palabra = " ";
		String mostrar = " ";

		System.out.println("-----BIENVENIDO AL SISTEMA DE RESERVA-----");

		while (!palabra.equalsIgnoreCase("fin")) {
			System.out.println("¿Desea mostrar todos los asientos disponibles? (escriba -si- para mostrará cualquier tecla para terminar ");
			mostrar = teclado2.next();
			if (mostrar.equalsIgnoreCase("si")) {
				for (int f = 0; f < 10; f++) {
					System.out.print(f + " ");
					for (int c = 0; c < 10; c++) {
						System.out.print("[" + asientos[f][c] + "]");
					}
					System.out.println("\n");
				}
			}
			System.out.println("Escoge la fila: ");
			fila = teclado.nextInt();
			System.out.println("Escoge la columna: ");
			columna = teclado.nextInt();

			if (fila >= 0 && fila <= 9) {
				if (columna >= 0 && columna <= 9) {
					if (asientos[fila][columna] == 'L') {
						System.out.println("Su reserva se ha hecho con éxito.");
						asientos[fila][columna] = 'X';
					} else {
						System.out.println("El asiento ya esta reservado, escoja otro lugar.");
					}
				} else {
					System.out.println("La columna esta fuera del limite, escoja entre 0 y 9");
				}
			} else {
				System.out.println("La fila esta fuera del limite, escoja entre 0 y 9");
			}

			System.out.println("¿Desea continuar reservando?. Ingrese fin para terminar o cualquier valor para seguir");
			palabra = teclado2.next();
		}
		System.out.println("Gracias por reservar con nosotros.");
	}
}
