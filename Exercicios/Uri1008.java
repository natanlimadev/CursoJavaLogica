import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		// Trocar a public class por Main
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int number, workHours;
		double payInHour, salary;
		
		number = sc.nextInt();
		workHours = sc.nextInt();
		
		payInHour = sc.nextDouble();
		
		salary = workHours * payInHour;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		
		
		sc.close();
	}

}
