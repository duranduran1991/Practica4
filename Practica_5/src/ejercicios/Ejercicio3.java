package ejercicios;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.*/
		int num = 0;
		int cont=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = sc.nextInt();
		while (num != 0) {
			
			if (num%2==0){
				System.out.println("El numero introducido es par");
			} else {
				System.out.println("El numero introducido es impar");
			}
			System.out.println("Introduce otro numero");
			num = sc.nextInt();
			cont++;
		}
		System.out.println(" El programa ha terminado y se han introducido " + cont + " numeros ");
	}
}
		

