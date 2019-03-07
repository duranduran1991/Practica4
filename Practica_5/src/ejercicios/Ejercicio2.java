package ejercicios;

import java.util.*;

public class Ejercicio2 {
	/*
	 * Leer un número e indicar si es positivo o negativo. El proceso se repetirá
	 * hasta que se introduzca un 0.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		while (num != 0) {
			
			if (num > 0){
				System.out.println("El numero introducido es positivo");
			} else {
				System.out.println("El numero introducido es negativo");
			}
			System.out.println("Introduce otro numero");
			num = sc.nextInt();
		}
		System.out.println("El programa ha terminado");
	}
}
