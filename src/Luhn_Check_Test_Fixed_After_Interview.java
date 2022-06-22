// This file contains the fix to the problem regarding 13 digit input.
// The fix involved the use of a conditional statement that checked whether the length of the string was odd or even, thereby alleviating the input error.

// THIS WAS DONE POST INTERVIEW



package src;

public class Luhn_Check_Test_Fixed_After_Interview {
    public static void main(String[] args) {
        correctCredit(4388576018402626L);
    }

    // Function to conduct Luhn check
    public static int correctCredit(long credit) {

        // Initialized variables
        int totalEven = 0;
        int total;
        int odd_Iteration = 0;
        int even_Iteration = 0;
        int total_Odd = 0;

        // String called to convert number to string
        String num_To_String = credit + "";

        if (num_To_String.length() % 2 == 0) {


            // Iteration Variables
            int halved_Even = num_To_String.length();
            int even_Positions = num_To_String.length();


            // Iteration to traverse even positions by halving by 2
            while (even_Iteration < (halved_Even / 2)) {

                // Value of even positions are returned and multiplied by 2
                int value_Of_Even_Position = Integer.parseInt(String.valueOf(num_To_String.charAt(even_Positions - 2)));
                int even = 2 * value_Of_Even_Position;

                String evenum_To_String = even + "";

                // Conditional statements to split double digits to single digits for even numbers
                if (evenum_To_String.length() > 1) {
                    char firstValue = evenum_To_String.charAt(0);
                    char secondValue = evenum_To_String.charAt(1);
                    int first_Digit = Integer.parseInt(String.valueOf(firstValue));
                    int second_Digit = Integer.parseInt(String.valueOf(secondValue));
                    int DoubleEvenTotal = first_Digit + second_Digit;
                    totalEven += DoubleEvenTotal;

                } else {
                    totalEven += even;
                }
                even_Positions -= 2;
                even_Iteration++;
            }

            // Iteration to get the sum of odd position values
            int odd_Positions = num_To_String.length();
            while (num_To_String.length() > odd_Iteration) {
                if (odd_Positions % 2 != 0) {
                    int Odd = Integer.parseInt(String.valueOf(num_To_String.charAt(odd_Positions)));
                    total_Odd += Odd;

                }

                odd_Positions -= 1;
                odd_Iteration++;
            }
            // Sum of both odd and even computed and returned
        } else if (num_To_String.length() % 2 != 0) {


            // Iteration Variables
            int halved_Even = num_To_String.length();
            int even_Positions = num_To_String.length();


            // Iteration to traverse even positions by halving by 2
            while (even_Iteration < halved_Even) {

                if (even_Positions % 2 != 0) {

                    // Value of even positions are returned and multiplied by 2
                    int value_Of_Even_Position = Integer.parseInt(String.valueOf(num_To_String.charAt(even_Positions - 1)));
                    int even = 2 * value_Of_Even_Position;

                    String evenum_To_String = even + "";

                    // Conditional statements to split double digits to single digits for even numbers
                    if (evenum_To_String.length() > 1) {
                        char firstValue = evenum_To_String.charAt(0);
                        char secondValue = evenum_To_String.charAt(1);
                        int first_Digit = Integer.parseInt(String.valueOf(firstValue));
                        int second_Digit = Integer.parseInt(String.valueOf(secondValue));
                        int DoubleEvenTotal = first_Digit + second_Digit;
                        totalEven += DoubleEvenTotal;

                    } else {
                        totalEven += even;
                    }
                    even_Positions -= 1;
                    even_Iteration++;
                }

                // Iteration to get the sum of odd position values
                int odd_Positions = num_To_String.length();
                while (num_To_String.length() > odd_Iteration) {
                    if (odd_Positions % 2 != 0) {
                        int Odd = Integer.parseInt(String.valueOf(num_To_String.charAt(odd_Positions - 1)));
                        total_Odd += Odd;

                    }

                    odd_Positions -= 1;
                    odd_Iteration++;
                }
                // Sum of both odd and even computed and returned

                break;
            }
        }
        total = totalEven + total_Odd;
        return total;
    }
}
