import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		// mudar o public class para Main
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salario = sc.nextDouble();
		double comissao = sc.nextDouble();
		double percentual = comissao * 15 / 100;
		
		double total = salario + percentual;
		
		System.out.printf("TOTAL DO %s = R$ %.2f%n", nome, total);
	
		sc.close();
	}

}
