package ejercicios;
import java.util.*;

public class Ejercicio13 {
	/* 13. Programa que lee un número y escribe todos los anteriores a él */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i;

		System.out.println("Escribe el numero");
		num = sc.nextInt();
		if (num > 0) {
			for (i = num; i != 0; i--) {
				System.out.println(num);
				num--;
			}
		}
		if (num < 0) {
			for (i = num; i != 0; i++) {
				
				System.out.println(num);
				num++;
			}
		}

	}
}
