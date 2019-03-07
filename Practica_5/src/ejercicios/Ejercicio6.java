package ejercicios;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Programa que va leyendo números desde teclado y calcula la suma de todos
		 * ellos. El programa finaliza cuando el número leído es 0.
		 */

		Scanner sc = new Scanner(System.in);
		int num = 0;
		int total = 0;
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		while (num != 0) {
			total = num + total;
			System.out.println("Introduce otro numero");
			num = sc.nextInt();

		}
		System.out.println(" La suma de todos los numeros introducidos es " + total);
	}
}
