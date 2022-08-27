import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		// mudar o public class por Main
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int horas = N / 3600;
		int resto = N % 3600; // o operador % --> e mod ele calcula o resto nao confudir com porcentagem
		
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
	
		sc.close();
	}

}
