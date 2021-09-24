import java.util.Scanner;

public class Comision{

	public static void main(String args[]){
	
		int n=0, precio=0, i=0;
		double comision=0.0, ganancia=200.0, comTotal=0.0;
		
		System.out.format("Ingrese por favor la cantidad de artículos que vendió el vendedor esta semana \n");
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		
		while(i<n){
		
			System.out.format("Ingrese por favor el valor del artículo \n");
			Scanner valor =  new Scanner(System.in);
			precio = valor.nextInt();
			comision = 0.09*precio;
			comTotal = comTotal + comision;
			i = i + 1;
			
		}
	
		ganancia = ganancia + comTotal;
		
		System.out.format("El empleado ha ganado en total "+ganancia+"\n");
	}

}
