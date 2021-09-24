import java.util.Scanner;

public class Productos{

	public static void main(String args[]){

		int n, cantidad, art=0;
		double val1=2.98, val2=4.50, val3=9.98, val4=4.49, val5=6.87;
		double total=0.0, Final=0.0;
			
		System.out.format("Ingrese la cantidad total de artículos que llevará \n");
		Scanner ntotal = new Scanner(System.in);
		art = ntotal.nextInt();
		
		while(art>0){
		
			System.out.format("Ingrese el número del producto \n");
			Scanner nproducto = new Scanner(System.in);		
			n = nproducto.nextInt();
			System.out.format("Ingrese la cantidad total de artículos que llevó de ese producto \n");
			Scanner canprod = new Scanner(System.in);
			cantidad = canprod.nextInt();
			art = art - cantidad;
			 switch(n){
		 
			 	case 1:
			 		total = val1*cantidad;
			 		break;
			 	case 2:
			 		total = val2*cantidad;
			 		break;
			 	case 3:
			 		total = val3*cantidad;
			 		break;
			 	case 4:
			 		total = val4*cantidad;
			 		break;
			 	case 5:
			 		total = val5*cantidad;
			 		break;
			 }
			 Final = Final + total;
		}
		
		System.out.format("El total a pagar es $ "+Final+"\n");
	}

}
