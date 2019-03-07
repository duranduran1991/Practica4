package ejercicios;
import java.util.*;

public class Ejercicio11 {
	/*
	 * Programa que lee 100 números y cuenta cuantos han sido pares, cuantos impares
	 * y cuantos nulos
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0, i;
		int pares = 0, impares = 0;

		for (i = 0; i < 10; i++) {
			System.out.println(" Introduce un numero ");
			numero=sc.nextInt();
			if (numero % 2 == 0) {
			pares++;
			} else {
			impares++;
			}

		}
		System.out.println(" La cantidad de numeros pares es: " + pares);
		System.out.println(" La cantidad de numeros impares introducidos es:" + impares);
	}

}
