package Banking;

import java.util.Scanner;


public class BankingApp {
    static double balance = 0;
    static Scanner scanner = new Scanner(System.in);

   static void main() {
        int command = 0;
        boolean state = true;

        while (state) {
            System.out.println("""
                    *********************
                       Banking Program
                    *********************
                    1. Show Balance
                    2. Deposit
                    3. Withdraw
                    4. Exit
                    *********************
                    Enter your choice (1-4):""");
            command = scanner.nextInt();

            switch (command) {
                case 1 -> System.out.printf("$%.2f\n", balance());
                case 2 -> System.out.printf("$%.2f\n", deposit());
                case 3 -> System.out.printf("$%.2f\n", withdraw());
                case 4 -> {
                    System.out.println("We are waiting for your next visit! See you");
                    state = false;
                }
                default -> System.out.println("Invalid operation");
            }
        }

        scanner.close();
    }

    static double balance() {
        return balance;
    }

    static double deposit() {
        System.out.println("How much?");
        balance += scanner.nextDouble();
        return balance();
    }

    static double withdraw() {
        double userWithDraw = 0;
        System.out.println("How much would you like to get?");
        userWithDraw = scanner.nextDouble();
        if (userWithDraw <= balance) {
            balance -= userWithDraw;
        } else {
            System.out.println("You dont have money enough");
        }

        return balance;
    }

}
