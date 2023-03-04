package Solutions.Easy;

import java.util.Scanner;
public class BallparkOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you order:");
        String order = scanner.nextLine();
        String[] orderSplit = order.toLowerCase().split(" ");
        double total = 0.0;

        for (String s : orderSplit) {
            switch (s) {
                case "nachos":
                case "pizza":
                    total += 6.00;
                    break;
                case "cheeseburger":
                    total += 10.00;
                    break;
                case "water":
                    total += 4.00;
                    break;
                default:
                    total += 5.00;
            }
        }
        System.out.println(total + ((total / 100) * 7));
    }
}
/*
You and three friends go to a baseball game and you offer to go to the concession stand for everyone. They each order
one thing, and you do as well. Nachos and Pizza both cost $6.00. A Cheeseburger meal costs $10. Water is $4.00 and Coke
is $5.00. Tax is 7%.

Task
Determine the total cost of ordering four items from the concession stand. If one of your friend’s orders something that
isn't on the menu, you will order a Coke for them instead.

Input Format
You are given a string of the four items that you've been asked to order that are separated by spaces.

Output Format
You will output a number of the total cost of the food and drinks.

Sample Input
'Pizza Cheeseburger Water Popcorn'

Sample Output
26.75
*/