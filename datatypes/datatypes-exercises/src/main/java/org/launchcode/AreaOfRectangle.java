package org.launchcode;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of side one?: ");
        int sideOne = input.nextInt();
        System.out.println("What is the length of side two?: ");
        int sideTwo = input.nextInt();
        int area = sideOne * sideTwo;
        System.out.println("The area of the rectangle is: "+area);

    }
}
