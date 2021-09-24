import java.util.Scanner;
import java.lang.Math;

public class AreaCirculo{

	public static void main(String args[]){
	
		int r, D;
		double A;
		
		System.out.format("Por favor introduzca un valor para el radio \n");
		
		Scanner radio = new Scanner(System.in);
		
		r = radio.nextInt();
		
		D = 2*r;
		
		A= r*r*Math.PI;
		
		System.out.format("Radio="+r+"\n");
		System.out.format("Diámetro="+D+"\n");
		System.out.format("Área="+A+"\n");
	
	}

}
