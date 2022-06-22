package src;
import java.util.*;

public class credit_card_validation_starting_digits {

    // Method to categorise credit card type
    public static String credit_Card_Category(long credit_Card_Number) {

        // Two variables initialised to get the first and first-two digits
        long credit_card_first_digit = credit_Card_Number;
        long credit_card_first_two_digits = credit_Card_Number;

        // Iteration with division to get the first digit
        while (credit_card_first_digit >= 9) {
            credit_card_first_digit /= 10;
        }

        // Iteration with division to get the first-two digits
        while (credit_card_first_two_digits >= 99) {
            credit_card_first_two_digits /= 10;
        }

        // Conditional statements with return type String
        if (credit_card_first_digit == 4)
            return "Visa";
        else if (credit_card_first_digit == 5)
            return "MasterCard";
        else if (credit_card_first_digit == 6)
            return "Discover Card";
        else if (credit_card_first_two_digits == 37)
            return "American Express";
        else
            return "Invalid Card";

    }
}