package ejercicios;
import java.util.*;

public class Ejercicio14 {
	/* 14. Programa que lee un número y escribe todos los pares anteriores a él */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0,i;

		System.out.println("Escribe el numero:");
		num = sc.nextInt();
		for (i = num ; num > 0; num--) {
			if (num % 2 == 0) {
				System.out.println(num);
				
			}
			num--;
		}

	}

}
