package Excersises.Medium;

public class CreditCardValidator {
    //Your code goes here
}
/*
You need to verify if the given credit card number is valid. For that you need to use the Luhn test.

Here is the Luhn formula:
1. Reverse the number.
2. Multiple every second digit by 2.
3. Subtract 9 from all numbers higher than 9.
4. Add all the digits together.
5. Modulo 10 of that sum should be equal to 0.

Task:
Given a credit card number, validate that it is valid using the Luhn test. Also, all valid cards must have exactly 16
digits.

Input Format:
A string containing the credit card number you need to verify.

Output Format:
A string: 'valid' in case the input is a valid credit card number (passes the Luhn test and is 16 digits long), or 'not
valid', if it's not.

Sample Input:
4091131560563988

Sample Output:
valid
*/