package com.financial.forecasting;

public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialAmount, double annualGrowthRate, int years) {
        if (years <= 0) {
            return initialAmount; // Base case: no more years to forecast
        } else {
            return calculateFutureValue(initialAmount * (1 + annualGrowthRate), annualGrowthRate, years - 1);
        }
    }

    public static void main(String[] args) {
        // Example usage
        double initialAmount = 1000.0; // Initial investment amount
        double annualGrowthRate = 0.05; // 5% annual growth rate
        int years = 10; // Number of years to forecast

        double futureValue = calculateFutureValue(initialAmount, annualGrowthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);
    }
}
