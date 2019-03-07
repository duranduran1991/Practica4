package ejercicios;
import java.util.*;

public class Ejercicio1 {
	/*
	 * Leer un número y mostrar su cuadrado, repetir el proceso hasta que se
	 * introduzca un número negativo
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		double Pot;
		
		while (num >= 0) {
			System.out.println("¿Que numero quieres introducir?");
			num = sc.nextInt();
			Pot = Math.pow(num, 2);
			if (num >= 1) {
				System.out.println("El numero introducido es " + num + " y su cuadrado es " + Pot);
			} else {
				System.out.println("El programa ha terminado");
			}
		}

	}
}
