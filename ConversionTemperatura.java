import java.util.Scanner;

public class ConversionTemperatura{

	public static void main(String args[]){
	
		System.out.format("¿En qué sistema de unidades ingresará la temperatura?\n");
		System.out.format("Ingrese 1 para Fahrenheit y 2 para Centígrados \n");
		Scanner num = new Scanner(System.in);
		int sistema = num.nextInt();
		
		switch(sistema){
		
			case 1:
				System.out.format("Por favor ingrese la temperatura en Fahrenheit \n");
				Scanner gradosf = new Scanner(System.in);
				double fah = gradosf.nextDouble();
				
				Fahrenheit conversionfc = new Fahrenheit();
				double gradosC = conversionfc.fahrenheit(fah);
				
				System.out.format(""+fah+"F="+gradosC+"C \n");
				
				break;
				
			case 2:
			
				System.out.format("Por favor ingrese la temperatura en Centígrados \n");
				Scanner gradosc = new Scanner(System.in);
				double cen = gradosc.nextDouble();
				
				Centigrados conversioncf = new Centigrados();
				double gradosF = conversioncf.centigrados(cen);
				
				System.out.format(""+cen+"C="+gradosF+"F \n");
				
				break;
		}
		 
	
	}

}
