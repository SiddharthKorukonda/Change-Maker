package Labs.Lab1;
import java.util.Scanner;

public class ChangeMaker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double change;
        int quarters, dimes, nickels, pennies;

        System.out.print("Enter the amount of money here: $");
        change = s.nextDouble();

        if (change < 0) {
            System.out.println("Invalid amount entered. Please enter a non-negative number.");
            return;
        }

        int changePennies = (int) Math.round(change * 100);

        quarters = changePennies / 25;
        int remainingChange = changePennies % 25;
        dimes = remainingChange / 10;
        remainingChange %= 10;
        nickels = remainingChange / 5;
        pennies = remainingChange % 5;

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
