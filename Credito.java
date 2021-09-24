import java.util.Scanner;

public class Credito{

	public static void main(String args[]){
	
		int cuenta, saldo, articulos, pasivos, credito, n;
	
		System.out.format("Ingrese el número de cuenta por favor, recuerde que debe tener diez dígitos \n");
		Scanner numcuenta = new Scanner(System.in);
		cuenta = numcuenta.nextInt();
		String tam = Integer.toString(cuenta);
		n = tam.length();
		while(n<10){
			System.out.format("El número de dígitos es incorrecto, por favor inténtelo nuevamente \n");
			Scanner numcuenta2 = new Scanner(System.in);
			cuenta = numcuenta.nextInt();
			String tam2 = Integer.toString(cuenta);
			n = tam2.length();
		}
		System.out.format("Ingrese el saldo que tenía al inicio del mes \n");
		Scanner numsaldo = new Scanner(System.in);
		saldo = numsaldo.nextInt();
		System.out.format("Ingrese la cantidad de artículos que adquirió en el mes \n");
		Scanner numarticulos = new Scanner(System.in);
		articulos = numarticulos.nextInt();
		System.out.format("Ingrese el total de los pasivos que adquirió \n");
		Scanner numpasivos = new Scanner(System.in);
		pasivos = numpasivos.nextInt();
		System.out.format("Ingrese por favor el límite de su crédito \n");
		Scanner numcredito = new Scanner(System.in);
		credito = numcredito.nextInt();
				
		saldo = saldo + credito - pasivos;
		
		if(saldo<0){
			System.out.format("El usuario excedió su límite de crédito \n");
		}

	}

}


