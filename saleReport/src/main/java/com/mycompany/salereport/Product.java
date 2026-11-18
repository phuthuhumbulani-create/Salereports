/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salereport;

/**
 *
 * @author user
 */

class Product implements SaleReport.IProduct {

    String[] products = {
        "Cozy Nights Monarch mattress",
        "Restonic Barbados mattress",
        "Sealy Phuket mattress"
    };

    int[][] sales = new int[3][3];

    // Constructor
    Product(int[][] sales) {
        this.sales = sales;
    }


    // Calculate total sales
    public int getTotalSales() {
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    // Calculate average sales
    public double getAverageSales() {
        return (double) getTotalSales() / 9;
    }

    // Find the most popular product
    public String getMostPopularProduct() {

        int highestSales = 0;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularIndex = i;
            }
        }

        return products[popularIndex] + " (" + highestSales + ")";
    }
}