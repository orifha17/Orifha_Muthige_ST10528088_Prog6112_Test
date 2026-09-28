/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consolesalesapplication;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class ConsoleSalesApplication {

   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Single-dimensional array for the cities
        String[] cities = {
            "Cape Town",
            "Port Elizabeth",
            "Pretoria"
        };

        // Single-dimensional array for the gaming consoles
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        // Two-dimensional array containing the sales
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("======================");

        // Display the headings
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "CITY", consoles[0], consoles[1], consoles[2]);

        // Display the sales using rows and columns
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2]);
        }

        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("===================================");

        // Calculate the total sales for each city
        int[] cityTotals = new int[cities.length];

        for (int i = 0; i < sales.length; i++) {

            cityTotals[i] = sales[i][0]
                    + sales[i][1]
                    + sales[i][2];

            System.out.println(
                    cities[i] + ": " + cityTotals[i]
            );
        }

        // Determine the city with the most sales
        int highestSales = cityTotals[0];
        String cityWithMostSales = cities[0];

        for (int i = 1; i < cityTotals.length; i++) {

            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                cityWithMostSales = cities[i];
            }
        }

        System.out.println();
        System.out.println(
                "CITY WITH THE MOST SALES: "
                + cityWithMostSales
        );

        input.close();
    }
}

