Project 1 – The Outsourcers

![5 Common Methods Hackers Use to Break Into Your Bank Account](Aspose.Words.68c1366a-6f11-43a0-bd53-7cc367bd77fa.001.jpeg)

Project 1 – The Outsourcers

MAKING A CREDIT CARD CHECKING PROGRAM

Ahmed Abubakar, Sabih Ul Huda, Hassan and Sami Sheikh | CSIT111

14 June 2022
# Analysis
The problem in this project was to code a program with multiple methods that would accept 2 parameters (Total number of credit cards AND credit card numbers as long integers in new lines) where we had to then establish outputs in three key fields:

- To display the belonging of the cards and to which companies they belonged (Visa, MasterCard, American Express or Discover Card)
- To display whether the inputted credit card number was valid or invalid based on the provided Luhn Check criteria provided beforehand.
- To suggest fixes to invalid credit card numbers through modification of the final digit ONLY.
# Design
The emphasis of the program was concentrated on developing methods from top-to-bottom. The first step was to allocate each member of our team their tasks along with scopes:

- Mohammad Sabih Ul Huda was responsible for developing the method: “Luhn\_Check\_Test.java” where his output was critical for the implementation of suggested fixes to the credit card number.
- Ahmad Abubakar was in charge of developing the method: “Suggested\_Fix.java” that was responsible for providing and implementing suggestions for invalid numbers to pass the Luhn check.
- Hassan Jasim was responsible for developing the method: “card.java” where he created a conditional statement necessary to ensure that the card entry satisfied the minimum and maximum requirements (from 13 to 16 digit characters)

- Sami Sheikh was responsible for the development of the method: “credit\_card\_validation\_starting\_digits.java” which was essential to establish the categorisation of the cards based on their first two digits.

![Diagram

Description automatically generated](Aspose.Words.68c1366a-6f11-43a0-bd53-7cc367bd77fa.002.jpeg)After the development of the methods was completed, all methods were called exhaustively in “main\_executable.java” where everyones’ contributions were executed with success. The project was named: Project1\_The\_Outsourcers.



# Testing Snapshots
![Text

Description automatically generated](Aspose.Words.68c1366a-6f11-43a0-bd53-7cc367bd77fa.003.png)IDE that was used was IntelliJ version 2022.1, in this text, two cards would be evaluated, the first card being of type VISA and invalid.






![Text

Description automatically generated](Aspose.Words.68c1366a-6f11-43a0-bd53-7cc367bd77fa.004.png)

Upon data entry, the execution of the code had correctly displayed the expected result and had also suggested a fix based on the last digit.

In our second test, we had decided to use a different number, in this instance, the expected output was a card of the type “MasterCard” and be invalid.

![Text

Description automatically generated](Aspose.Words.68c1366a-6f11-43a0-bd53-7cc367bd77fa.005.png)

As expected, the result had met our expectations and had correctly established the category and its invalidity along with the fix.
# Addendum
During the interview, we identified an issue in the original code where we hard-coded the length of the code, and hence it wouldn’t work well with odd length inputs (13-digits, 15-digits).

As such, we have made an addition of a conditional statement that analyses the length of the credit card number such that if the length is odd or even in length, the appropriate string bounds will be used to account for the difference. The code below is the code **Post-Interview** that resolves the identified problem.

// This file contains the fix to the problem regarding 13-digit input.
// The fix involved the use of a conditional statement that checked whether the length of the string was odd or even, thereby alleviating the input error.

// THIS WAS DONE POST INTERVIEW
