package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int salesAmount(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = (int) (amount + sales[(int) i]);
        }
        return amount;
    }

    public int averageSumInMonth(int[] sales) {
        int amount = 0;
        int iteration = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
            iteration++;
        }
        int averageSum = amount / iteration;
        return averageSum;
    }

    public int salesBelowAverage(int[] sales) {
        int averageSum = averageSumInMonth(sales);
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum){
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int salesAboveAverage(int[] sales) {
        int averageSum = averageSumInMonth(sales);
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum){
                belowAverage++;
            }
        }
        return belowAverage;
    }
}
