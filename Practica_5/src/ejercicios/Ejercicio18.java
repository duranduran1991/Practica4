package ejercicios;
import java.util.*;
public class Ejercicio18 {
	/*18. Programa que lee una secuencia 5 números y escribe cual ha sido el mayor.*/
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int numeros=0,i,j=1;
		int n=0;
		for(i=numeros;i<5;i++){
			System.out.println(" Escribe el numero " + j +" : ");
			numeros=sc.nextInt();
			j++;
			if (numeros>n) {
			n=numeros;	
			System.out.println(n);
			}
			
			
		}
		System.out.println(" El numero con mayor valor es: " + n);

	}

}
