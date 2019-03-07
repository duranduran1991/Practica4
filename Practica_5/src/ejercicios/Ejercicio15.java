package ejercicios;
import java.util.*;

public class Ejercicio15 {
	/*
	 * 15. Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de
	 * multiplicar de dicho número.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, i, j;
		
		do {
			System.out.print("indica la tabla de multiplicar: ");
			num = sc.nextInt();
			for (i = num; i <= num; i++) {
				for (j = 1; j <= 10; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
				}
				System.out.println();
			}
			
		} while (num > 0);

	}
}
