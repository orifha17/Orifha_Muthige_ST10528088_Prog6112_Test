/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consolesalesapplication;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String consoleType;
        String storeName;
        int totalSales;

        System.out.println("Select the console type:");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = input.nextInt();

        switch (choice) {

            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                consoleType = "";
                break;
        }

        input.nextLine();

        System.out.print("Enter the store: ");
        storeName = input.nextLine();

        System.out.print("Enter the total sales of "
                + consoleType
                + " consoles for "
                + storeName
                + ": ");

        totalSales = input.nextInt();

        ConsoleSales consoleSales = new ConsoleSales(
                consoleType,
                storeName,
                totalSales
        );

        consoleSales.printReport();

        input.close();
    }
}

