import java.util.Scanner;

public class Ejercicio19 {
	/*
	 * 19. Programa que lea dos n�meros enteros y muestre por pantalla todos los
	 * n�meros comprendidos entre esos dos, ambos incluidos. El programa no debe
	 * suponer que el primero ser� menor que el segundo ni viceversa, pero s�
	 * deber� tenerlo en cuenta para mostrar los n�meros en orden creciente o
	 * decreciente seg�n corresponda.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mayor, menor;
		int Ini = 0, Fin = 0;
		System.out.println("Introduce el primer numero");
		mayor = sc.nextInt();
		System.out.println("Introduce el segundo numero");
		menor = sc.nextInt();
		if (mayor > menor) {
			Ini = mayor;
			Fin = menor;
		} else {
			if (menor > mayor) {
				Ini = menor;
				Fin = mayor;
			} else {
				System.out.println("Los dos numeros son iguales");
			}
		}
		while (Fin < Ini) {
			System.out.println(Fin);
			Fin++;
		}

	}

}
