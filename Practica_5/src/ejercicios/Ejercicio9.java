package ejercicios;
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		/*9. Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la
		cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más
		de 1.75.*/
		Scanner sc= new Scanner (System.in);
		int edad,altura,empleados,j=1;
		double mediaEdad,mediaAlt,sumaAlt=0,sumaAlum=0;
		int cont_edad=0,cont_alt=0;
		
		for(empleados=0;empleados<5;empleados++) {
			System.out.println(" Anota la edad del alumno numero " + j);
			edad=sc.nextInt();
			System.out.println(" Anota la altura del alumno numero " + j);
			altura=sc.nextInt();
			j++;
			sumaAlum=sumaAlum+edad;
			sumaAlt=sumaAlt+altura;
			if (edad>18) {
				cont_edad++;
			}
			if (altura>175) {
				cont_alt++;
			}
		}
		mediaAlt=sumaAlt/empleados;
		mediaEdad=sumaAlum/empleados;
		System.out.println(" La edad de los alumnos es " + mediaEdad);
		System.out.println(" La estatuta media de los alumnos " + mediaAlt);
		System.out.println(" Los alumnos que son mayores de 18 años son " + cont_edad);
		System.out.println(" Los alumnos que miden mas de 1,75 cm son " + cont_alt);
		
	}

}
