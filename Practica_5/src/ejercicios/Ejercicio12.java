package ejercicios;
import java.util.*;
public class Ejercicio12 {
	/*Programa que lee las notas en programación de esta clase y cuenta el no de
	aprobados*/
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int notas,i,j=1;
		int aprobados=0;
		int num=0;
		
		System.out.println(" Introduce el numero de alumnos:");
		num=sc.nextInt();
		
		for (i=0;i<num;i++) {
			System.out.println("Introduce la nota de programacion del alumno numero " + j + ":");
			notas=sc.nextInt();
			j++;
			if (notas>=5) {
				aprobados++;
			}
			
			
	}
		System.out.println(" El numero de aprobados en programacion es: " + aprobados);
}

}
