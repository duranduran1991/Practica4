package ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
	/*Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se
	han introducido.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int cont=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		while (num > 0) {
			System.out.println("Introduce otro numero");
			num = sc.nextInt();
			cont++;
		}
		System.out.println(" El programa ha terminado y se han introducido " + cont + " numeros ");
	}
}
		