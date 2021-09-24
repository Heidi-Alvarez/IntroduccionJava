import java.math.BigDecimal;
import java.math.RoundingMode;


public class Pi{

	public static void main(String args[]){
	
		double pi1=3.14, pi2=3.141, pi3=3.1415, pi4=3.14159;
		double suma=5.0;
		int i=0, x=0;
		
		BigDecimal BPi1 = new BigDecimal(3.14);
		BigDecimal BPi2 = new BigDecimal(3.141);
		BigDecimal BPi3 = new BigDecimal(3.1415);
		BigDecimal BPi4 = new BigDecimal(3.14159);
		BigDecimal Pi1 = BPi1.setScale(2,RoundingMode.FLOOR);
		BigDecimal Pi2 = BPi2.setScale(3,RoundingMode.FLOOR);
		BigDecimal Pi3 = BPi3.setScale(4,RoundingMode.FLOOR);
		BigDecimal Pi4 = BPi4.setScale(5,RoundingMode.FLOOR);
		
		while( x!=1 ){
			if(i==0){
				suma = 0.0;
			}
			i+=1;
			if( (i%2)!=0){
				suma = suma + 4.0/(2.0*i-1.0);
			}
			else{
				suma = suma - 4.0/(2.0*i-1.0);	
			}
//			System.out.format(" "+i+" \t "+suma+"\n");
			BigDecimal comsuma = new BigDecimal(suma);		//Crea un objeto BigDecimal
			BigDecimal aproxpi = comsuma.setScale(2,RoundingMode.FLOOR);  //Redondea el objeto BigDecimal a la 2 cifra
			int comparacion = aproxpi.compareTo(Pi1);     //Compara entre objetos BigDecimal
			if( comparacion == 0){
				x = 1;
			}

		}
		System.out.format(" "+i+" \t "+suma+"\n");
		x=0;
		i=0;
		while( x!=1 ){
			if(i==0){
				suma = 0.0;
			}
			i+=1;
			if( (i%2)!=0){
				suma = suma + 4.0/(2.0*i-1.0);
			}
			else{
				suma = suma - 4.0/(2.0*i-1.0);	
			}
//			System.out.format(" "+i+" \t "+suma+"\n");
			BigDecimal comsuma = new BigDecimal(suma);		//Crea un objeto BigDecimal
			BigDecimal aproxpi = comsuma.setScale(3,RoundingMode.FLOOR);  //Redondea el objeto BigDecimal a la 2 cifra
			int comparacion = aproxpi.compareTo(Pi2);     //Compara entre objetos BigDecimal
			if( comparacion == 0){
				x = 1;
			}

		}
		System.out.format(" "+i+" \t "+suma+"\n");
		x=0;
		i=0;
		while( x!=1 ){
			if(i==0){
				suma = 0.0;
			}
			i+=1;
			if( (i%2)!=0){
				suma = suma + 4.0/(2.0*i-1.0);
			}
			else{
				suma = suma - 4.0/(2.0*i-1.0);	
			}
//			System.out.format(" "+i+" \t "+suma+"\n");
			BigDecimal comsuma = new BigDecimal(suma);		//Crea un objeto BigDecimal
			BigDecimal aproxpi = comsuma.setScale(4,RoundingMode.FLOOR);  //Redondea el objeto BigDecimal a la 2 cifra
			int comparacion = aproxpi.compareTo(Pi3);     //Compara entre objetos BigDecimal
			if( comparacion == 0){
				x = 1;
			}

		}
		System.out.format(" "+i+" \t "+suma+"\n");
		x=0;
		i=0;		
		while( x!=1 ){
			if(i==0){
				suma = 0.0;
			}
			i+=1;
			if( (i%2)!=0){
				suma = suma + 4.0/(2.0*i-1.0);
			}
			else{
				suma = suma - 4.0/(2.0*i-1.0);	
			}
//			System.out.format(" "+i+" \t "+suma+"\n");
			BigDecimal comsuma = new BigDecimal(suma);		//Crea un objeto BigDecimal
			BigDecimal aproxpi = comsuma.setScale(5,RoundingMode.FLOOR);  //Redondea el objeto BigDecimal a la 2 cifra
			int comparacion = aproxpi.compareTo(Pi4);     //Compara entre objetos BigDecimal
			if( comparacion == 0){
				x = 1;
			}

		}
		System.out.format(" "+i+" \t "+suma+"\n");
	
	}

}
