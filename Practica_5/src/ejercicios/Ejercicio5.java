package ejercicios;
import java.util.*;

public class Ejercicio5 {
	/*
	 * Realizar un juego para adivinar un número. Para ello pedir un número N, y
	 * luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor
	 * con respecto a N. El proceso termina cuando el usuario acierta.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num = Math.floor(Math.random()*50+1);
		double num1 = 0;
		int cont = 0;
		System.out.println("Introduce un numero");
		num1 = sc.nextInt();
		while (num != num1) {
			if (num > num1) {
				System.out.println("El numero que tienes que adivinar es mayor");
			}else {
				System.out.println("El numero que tienes que adivinar es menor");
			}
			System.out.println("Introduce otro numero");
			num1 = sc.nextInt();
			
		}
			System.out.println("Has acertado");
	}
}
