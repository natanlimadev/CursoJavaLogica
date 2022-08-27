import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
		// Mudar o public Class para Main
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, Media, MediaFinal;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		Media = (A * 2) + (B * 3) + (C * 5);
		MediaFinal = Media / 10;
		
		System.out.printf("MEDIA = %.1f%n", MediaFinal);
		
		
		sc.close();
	}

}
