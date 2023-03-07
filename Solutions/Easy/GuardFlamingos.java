package Solutions.Easy;

import java.util.Scanner;
public class GuardFlamingos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length and width of your front yard:");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int lengthFlamingos = length / 2;
        int widthFlamingos = width / 2;
        int flamingosTotal = lengthFlamingos + widthFlamingos;

        System.out.println(flamingosTotal * 2);
    }
}
/*
You decide to add a pink flamingo lawn ornament every 2 feet around the perimeter of your yard. How many flamingos do
you need to purchase?

Task:
Given the length and width of your rectangular yard, determine how many flamingos your should buy to put one every 2
feet along the edges of your yard.

Input Format:
Two integer values that represent the length and width of your front yard.

Output Format:
An integer that represents the total number of flamingos that you should purchase.

Sample Input:
10
10

Sample Output:
20
*/