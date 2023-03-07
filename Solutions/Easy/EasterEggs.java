package Solutions.Easy;

import java.util.Scanner;
public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell us, how many eggs are hidden?");
        int eggsHidden = scanner.nextInt();
        System.out.println("How many eggs did you find?");
        int yourEggs = scanner.nextInt();
        System.out.println("How many your friend has found?");
        int friendsEggs = scanner.nextInt();

        if (eggsHidden == yourEggs) {
            System.out.println("Candy Time");
        } else {
            System.out.println("Keep Hunting");
        }
    }
}
/*
You go hunting for Easter eggs with a friend. You think that you have found all of the eggs, but you want to make sure
that you don't leave any behind! Compare Easter baskets with your friend to decide if you should keep hunting.

Task:
If you know the total number of eggs that were hidden and the amount in both of your baskets. Evaluate whether it is
time to eat candy or keep hunting for more eggs.

Input Format:
Three integer values. The first represents the total number of eggs, the second, the amount in your basket, and lastly
the amount that your friend has found.

Output Format:
A string that says 'Keep Hunting' if there are still eggs out there or 'Candy Time' if you found all the eggs.

Sample Input:
100
40
60

Sample Output:
Candy Time
*/