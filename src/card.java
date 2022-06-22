package src;

import java.util.Scanner;

public class card {

    // Main exists to test code
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        long cardNumber = scan.nextLong();

    }
    // Function to analyse the length of the card number with a boolean return type
    public static boolean authentication(long card_number_long) {

        // conversion of card_number_long to string
        String card_number_string = String.valueOf(card_number_long);

        // Conditional statement to analyse if the length of the string is between 13 AND 16
        if (card_number_string.length()>= 13 && card_number_string.length()<=16) {
            return true;

        }
        else return false;

    }

}
