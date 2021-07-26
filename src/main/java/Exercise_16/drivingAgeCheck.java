/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_16;

import java.util.Scanner;

public class drivingAgeCheck {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("What is your age? ");
        int personsAge = Input.nextInt();

        while (personsAge <= 0) {
            System.out.print("Invalid age entered, please try again: ");
            personsAge = Input.nextInt();
        }

        int legalAge = 16;

        String check = (personsAge >= legalAge) ? "" : "not ";
        System.out.println("You are " + check + "old enough to legally drive");
    }
}