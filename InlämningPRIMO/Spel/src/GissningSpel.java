import java.util.Random;
import java.util.Scanner;

public class GissningSpel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        do {
            int secretNumber = random.nextInt(10) + 1;
            int guess=0; // Fick problem här för att variablen guess inte har tilldelats något värde. 
            int attempts = 0;

            System.out.println("Gissa ett tal mellan 1 och 10.");

            do {
                System.out.print("Gissning " + (attempts + 1) + ": ");
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    attempts++;

                    if (guess < secretNumber) {
                        System.out.println("Talet är större.");
                    } else if (guess > secretNumber) {
                        System.out.println("Talet är mindre.");
                    } else {
                        System.out.println("Rätt! Du gissade rätt på " + attempts + " försök.");
                    }
                } else {
                    String input = scanner.next();
                    System.out.println("Du kan bara skriva ett tal med siffror. Försök igen!");
                }

            } while (guess != secretNumber);

            System.out.print("Vill du spela igen (Ja/Nej)? ");
            playAgain = scanner.next();

            System.out.println();

        } while (playAgain.equalsIgnoreCase("ja"));

        scanner.close();
        System.out.println("Tack för den här gången!");
    }
}
