package ejercicios;
import java.util.*;

public class Ejercicio10 {
	/*
	 * 10. Programa que lee una secuencia de notas (0 – 10) terminada al introducir
	 * –1 y cuenta el no de suspensos, aprobados, notables y sobresalientes. Validar
	 * que las notas introducidas sean correctas.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double notas=0;
	    int cont_sus = 0, cont_apro = 0, cont_not = 0, cont_sobre = 0;

		do {
			System.out.println(" Anota la nota del alumno ");
			notas = sc.nextInt();
			if (notas < 5) {
				cont_sus++;
			}else
			if (notas >= 5 && notas < 7) {
				cont_apro++;
			}else
			if (notas >= 7 && notas < 9) {
				cont_not++;
			}else
			if (notas >= 9) {
				cont_sobre++;
			}

		 }while (notas !=-1);
		System.out.println(" La cantidad de alumnos suspensos es : " + cont_sus);
		System.out.println(" La cantidad de alumnos aprobados es : " + cont_apro);
		System.out.println(" La cantidad de alumnos con notable es : " + cont_not);
		System.out.println(" La cantidad de alumnos con sobresaliente es : " + cont_sobre);
	}

}
