
import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		// nao esquecer de mudar o nome da public class para Main
		//Sempre usar o Locale antes do Scanner senão quebra o programa
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		double n, r, area;
		
				
		r = sc.nextDouble();
		n = 3.14159;
		
		
		area = n * Math.pow(r, 2);
		
		System.out.printf("A=%.4f%n", area);
		
		
		
		sc.close();

	}

}
