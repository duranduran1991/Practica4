package ejercicios;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Pedir números hasta que se introduzca uno negativo, y calcular la media*/
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int total = 0;
		int cont = 0;
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		
		while (num > 0) {
			total = num + total;
			System.out.println("Introduce otro numero");
			num = sc.nextInt();
			

		}
		cont++;
		System.out.println(" La media de todos los numeros introducidos es " + (total/cont));
	}
}
	