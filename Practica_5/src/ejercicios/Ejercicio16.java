package ejercicios;
import java.util.*;

public class Ejercicio16 {
	/*
	 * 16. Una empresa que se dedica a la venta de desinfectantes necesita un
	 * programa para gestionar las facturas. En cada factura figura: el código del
	 * artículo, la cantidad vendida en litros y el precio por litro. El programa
	 * pedirá los datos de 5 facturas introducidas y calculará y mostrará:
	 * Facturación total cantidad en litros vendidos del artículo 1 número de
	 * facturas que se emitieron de más de 600 €.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  litros,li=0;
		double precio_litro,factura=0,i;
		int codigo;
		double total_factura=0;
		int cont_fact=0;
		for (i = factura; i < 5; i++) {
			System.out.println("Introduce el codigo del articulo:");
			codigo = sc.nextInt();
			System.out.println("Numero de litros vendidos:");
			litros = sc.nextInt();
			System.out.println("Introduce el precio del litro:");
			precio_litro = sc.nextInt();
			factura=litros*precio_litro;
			total_factura=factura+total_factura;
			if (i==0) {
			li=litros;
			}
			if (factura>600) {
				cont_fact++;
			}
		}
		System.out.println("La facturacion total es:" + total_factura);
		System.out.println("El numero de litros del articulo numero 1 es:" + li);
		System.out.println("El numero de facturas de mas de 600 es:" + cont_fact);
	}

}
