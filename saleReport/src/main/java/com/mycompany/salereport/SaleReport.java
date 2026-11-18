/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salereport;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SaleReport {

   interface IProduct {
    int getTotalSales();
    double getAverageSales();
    String getMostPopularProduct();
}


// Interface


// Main class


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch mattress",
            "Restonic Barbados mattress",
            "Sealy Phuket mattress"
        };

        int[][] sales = new int[3][3];

        // Collect sales information
        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                    + (j + 1) + " for " + products[i] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(sales);

        // Display sales report
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("************************************");

        System.out.println("TOTAL PRODUCT SALES: "
            + product.getTotalSales());

        System.out.println("AVERAGE PRODUCT SALES: "
            + product.getAverageSales());

        System.out.println("MOST POPULAR PRODUCT: "
            + product.getMostPopularProduct());

        input.close();
    }
}
