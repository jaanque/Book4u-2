package com.supabase.login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter email: ");
                    String regEmail = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String regPassword = scanner.nextLine();
                    if (Auth.register(regEmail, regPassword)) {
                        System.out.println("Registration successful!");
                    }
                    break;
                case 2:
                    System.out.print("Enter email: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();
                    if (Auth.login(loginEmail, loginPassword)) {
                        System.out.println("Login successful!");
                        UserData.displayUserData();
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
