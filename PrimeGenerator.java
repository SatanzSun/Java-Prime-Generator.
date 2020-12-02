import java.util.Scanner;

public class PrimeGenerator {

	public static void main(String args[]) {
		int n = 0, check = 1, num = 3;

		Scanner scanner = new Scanner(System.in);
		while (n < 1 || n > 100) { // parbauda vie ievadi ir parametru robežās.
			System.out.print("Cik secīgus pirmskaitļus radīt? (1 - 100): ");
			n = scanner.nextInt();
		}
		scanner.close();
		if (n >= 1) { // izvada pirmo pirmskaitli
			System.out.print(2);
		}

		for (int i = 2; i <= n;) { // nosaka cik reizes jaizvada pirmskaitļis
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) { // parbauda vai skaitlis ir pirmskaitlis.
					check = 0;
					break;
				}
			}
			if (check != 0) { // ja skaitlis ir pirmskaitlis, izvada
				System.out.print(num + " ");
				i++;
			}
			check = 1; // ja nav pirmskaitlis pieliek 1 un parbauda velreiz.
			num++;
		}
	}
}