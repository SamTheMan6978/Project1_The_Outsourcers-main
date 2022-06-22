package src;
import java.util.*;

// This class acts as the main executable.
public class main_executable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User inputs requested for n-number of iterations along with initialisation of the counter "iteration"
        System.out.println("Please enter your number of cards: ");
        int no_Of_Cards = input.nextInt();
        int iteration = 0;

        // While loop to iterate for each card
            while (iteration < no_Of_Cards) {

                // Request for user input for a credit card number
                System.out.println("\n" + "Please enter your credit card number: ");
                long credit_Card_Number = input.nextLong();

                // Conditional statement to return whether credit card number length is valid or not (Between 13 and 16)
                if (card.authentication(credit_Card_Number)) {
                    System.out.print(credit_Card_Number);
                } else {
                    System.out.print("Your credit card number length is invalid, please try again");
                    break;
                }

                // Conditional test to check if the card type is valid or not based off the first digit.
                if (!credit_card_validation_starting_digits.credit_Card_Category(credit_Card_Number).equals("Invalid Card")) {
                    System.out.print(" is " + credit_card_validation_starting_digits.credit_Card_Category(credit_Card_Number));
                } else {
                    System.out.println("Your credit card type is an invalid card, please try again.");
                    break;
                }

                // Conditional statement to check whether the card number passes the Luhn check or not.
                // if not, the correction is implemented in the latter.
                if (Luhn_Check_Test.correctCredit(credit_Card_Number) % 10 == 0) {
                    System.out.print(" & is valid ");

                } else if (Luhn_Check_Test.correctCredit(credit_Card_Number) % 10 != 0) {
                    System.out.print(" & it is invalid " + "\n" + "\n");
                    Suggested_Fix.correctCredit(credit_Card_Number, Luhn_Check_Test.correctCredit(credit_Card_Number));
                }
                iteration++;
            }
    }
}
