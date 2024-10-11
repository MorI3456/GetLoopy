import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean keepRolling = true;
        int rollCount = 0;

        while (keepRolling) {
            System.out.printf("%-5s %-5s %-5s %-5s %-5s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------");
            int die1, die2, die3, sum;
            boolean allDiceMatch = false;

            while (!allDiceMatch) {
                die1 = rand.nextInt(6) + 1; // 1-6
                die2 = rand.nextInt(6) + 1; // 1-6
                die3 = rand.nextInt(6) + 1; // 1-6
                sum = die1 + die2 + die3;
                rollCount++;
                System.out.printf("%-5d %-5d %-5d %-5d %-5d\n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    allDiceMatch = true;
                }
            }

            System.out.println("\nYou rolled a triple! Would you like to roll again? (yes/no)");
            String response = scanner.nextLine().toLowerCase();
            if (!response.equals("yes")) {
                keepRolling = false;
            }
        }

        scanner.close();
    }
}
