package ejercicios;
import java.util.Scanner;

public class Ejercicio20 {
	/*
	 * 20. Programa que muestra por pantalla los números del 1 al 100 sin
	 * mostrar aquellos números que sean múltiplos de 5.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		for (i = 0; i < 100; i++) {
			if (i % 5 != 0) {
				System.out.println(" El numero a mostrar es el: " +i);
			}
		}
		System.out.println("Fin del programa");
	}

}
