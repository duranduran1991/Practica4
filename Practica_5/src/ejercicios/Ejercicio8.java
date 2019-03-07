package ejercicios;

//programa que muestra el nombre y el sueldo del empleado que más gana
import java.util.*;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creamos los arrays
		String[] empleados = new String[10];
		double[] sueldos = new double[10];

		// variables donde guardar el nombre y sueldo del empleado que más gana
		String MayorSueldo = null;
		double Sueldos=0;

		int i = 0;

		// se lee el primer empleado
		System.out.println("Lectura de nombres y sueldos de empleados: ");
		System.out.print("Empleado " + (i + 1) + ": ");
		empleados[i] = sc.nextLine();
		System.out.print("Sueldo: ");
		sueldos[i] = sc.nextDouble();

		// se leen el resto de empleados
		for (i = 1; i < empleados.length; i++) {
			sc.nextLine(); // limpiar el buffer
			System.out.print("Empleado " + (i + 1) + ": ");
			empleados[i] = sc.nextLine();
			System.out.print("Sueldo: ");
			sueldos[i] = sc.nextDouble();
			// se compara el sueldo leído con el mayor
			if (sueldos[i] > 1000) {
				Sueldos = sueldos[i];
				MayorSueldo = empleados[i];
			}
		}

		// mostrar resultados
		System.out.println("Empleado que gana mas" + MayorSueldo);
		System.out.println("Sueldo: " + Sueldos);

     	}

}
