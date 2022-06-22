package src;

public class Suggested_Fix {

    // Method to correct last digit in case of invalidity
    public static void correctCredit(long credit, long n) {  //n is total of credit card numbers needed to confirm validation

        String credits = credit + "";

        if (n % 10 != 0) {
            int change = (int) (10 - (n % 10)); //difference to make the total to be modded by 10

            String last_Digit_From_String = credits.substring((credits.length() - 1)); //last digit from original card number

            int last_Digit = Integer.parseInt(last_Digit_From_String); // Parsing digit retrieved from lastDigitFromString
            int fix_Last = (((last_Digit) + (change)) % 10); //correct last digit  to make card valid

            //if the last digit of the credit is greater than the number that should replace it

            if (last_Digit > fix_Last || last_Digit == fix_Last) {
                while (last_Digit != fix_Last) {
                    credit -= 1;
                    last_Digit -= 1;
                }
                System.out.println("Suggested fix: " + credit); //output:suggest valid credit card number

                // if the last digit of the credit is less than the number that should replace it or equal to it

            } else if (last_Digit < fix_Last) {
                while (last_Digit != fix_Last) {
                    credit += 1;
                    last_Digit += 1;

                }
                System.out.println("Suggested fix: " + credit);//output:suggest valid credit card number
            }
        }
    }
}