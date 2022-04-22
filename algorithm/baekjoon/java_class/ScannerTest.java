package baekjoon;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner yourName = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = yourName.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        Scanner myInfo = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myInfo.nextLine();

        // Numerical input
        int age = myInfo.nextInt();
        double salary = myInfo.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}