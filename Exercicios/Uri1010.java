import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		// trocar a public Class por Main
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		@SuppressWarnings("unused")
		int codPeca1, codPeca2, numPeca1, numPeca2;
		double unitPrice1, unitPrice2, total;
		
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		unitPrice1 = sc.nextDouble();
		
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		unitPrice2 = sc.nextDouble();
		
		total = (numPeca1 * unitPrice1) + (numPeca2 * unitPrice2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	
		
		
		
		sc.close();
	}

}
