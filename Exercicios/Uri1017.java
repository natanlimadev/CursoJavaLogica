import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		// mudar o public class para main
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo, velocidade;
		double distancia, consumo;
		
		tempo = sc.nextInt();
		velocidade = sc.nextInt();
		
		distancia = tempo * velocidade;
		
		consumo = distancia / 12;
		
		System.out.printf("%.3f%n", consumo);
		
		
		sc.close();	
	}

}
