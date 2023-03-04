package Solutions.Easy;

import java.util.Scanner;
public class Balconies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length and width of the first balcony:");
        String aBalcony = scanner.nextLine();
        System.out.println("Please enter the length and width of the second balcony:");
        String bBalcony = scanner.nextLine();

        String[] aSplit = aBalcony.split(",");
        String[] bSplit = bBalcony.split(",");

        int aArea = Integer.parseInt(aSplit[0]) * Integer.parseInt(aSplit[1]);
        int bArea = Integer.parseInt(bSplit[0]) * Integer.parseInt(bSplit[1]);

        if (aArea > bArea) {
            System.out.println("Apartment A");
        } else {
            System.out.println("Apartment B");
        }
    }
}
/*
You are trying to determine which of two apartments has a larger balcony. Both balconies are rectangles, and you have
the length and width, but you need the area.

Task
Evaluate the area of two different balconies and determine which one is bigger.

Input Format
Your inputs are two strings where the measurements for length and width are separated by a comma. The first one
represents apartment A, the second represents apartment B.

Output Format:
A string that says whether apartment A or apartment B has a larger balcony.

Sample Input
'5,5'
'2,10'

Sample Output
Apartment A
*/