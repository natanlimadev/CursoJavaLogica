import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		// mudar o public class para Main
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, Media, MediaFinal;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		
		Media = (A * 3.5) + (B * 7.5);
		MediaFinal = Media / 11;
		
		System.out.printf("MEDIA = %.5f%n", MediaFinal);
		
			
		sc.close();
	}

}
