package Solutions.Easy;

import java.util.Scanner;
public class ExtraTerrestrials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me a word you want to translate to the aliens:");
        String word = scanner.next();
        String drow = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            drow += word.charAt(i);
        }

        System.out.println(drow);
    }
}
/*
You meet a group of aliens, and their language is just like English except that they say every word backwards.
How will you learn to communicate with them?

Task:
Take a word in English that you would like to say, and turn it into language that these aliens will understand.

Input Format:
A string of a word in English.

Output Format:
A string of the reversed word that represents the original word translated into alien language.

Sample Input:
howdy

Sample Output:
ydwoh
*/