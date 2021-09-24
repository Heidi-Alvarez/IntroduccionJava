import java.math.BigDecimal;
import java.math.RoundingMode;

public class Aproximar{

	public static void main(String args[]){
	
		double i=3.45394;
		
		BigDecimal numero = new BigDecimal(i);
		BigDecimal num = numero.setScale(3,RoundingMode.FLOOR);
		System.out.format(" "+num+"\n");
	
	}

}
