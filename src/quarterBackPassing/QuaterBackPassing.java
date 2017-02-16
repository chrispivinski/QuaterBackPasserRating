package quarterBackPassing;
///Chris Pivinski
import java.util.Scanner;

public class QuaterBackPassing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the nuber of passing attempts");
		double passingAttempts = input.nextDouble();
		System.out.println("Enter number of completions");
		double completions = input.nextDouble();
		System.out.println("Enter amount of passing yards");
		double passingYards = input.nextDouble();
		System.out.println("Enter number of touchdowns");
		double touchDowns = input.nextDouble();
		System.out.println("Enter number of interceptions");
		double interceptions = input.nextDouble();

		// doubles a,b,c,d all to needed to simplify the calculation of the
		// passer rating later
		double a = (5 * ((completions / passingAttempts) - .3));
		// System.out.println(a);

		double b = (.25 * ((passingYards / passingAttempts) - 3));

		double c = (20 * (touchDowns / passingAttempts));

		double d = (2.375 - (25 * (interceptions / passingAttempts)));

		// Calculates the passer rating and displays it to an accuracy of one
		// digit
		// beyond the decimal
		double passerRating = (100 * ((a + b + c + d) / 6));
	
					
		
		if (passerRating < 158.3) { 
			System.out.printf("%4.1f", passerRating); 
		}
		else  {
			System.out.println("158.3"); 
		}

	}

}
