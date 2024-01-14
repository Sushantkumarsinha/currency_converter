package CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount you want to convert: ");
        double amount = scanner.nextDouble();

        System.out.println("Enter the currency code of the amount (for example, USD for US Dollar): ");
        String fromCurrency = scanner.next();

        System.out.println("Enter the currency code to which you want to convert the amount (for example, INR for Indian Rupee): ");
        String toCurrency = scanner.next();

        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

        if (convertedAmount == -1) {
            System.out.println("Unable to convert the given currency.");
        } else {
            System.out.println("Converted amount: " + convertedAmount + " " + toCurrency);
        }

        scanner.close();
    }

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double convertedAmount = -1;

        double usdToInr = 83.5;
        double inrToUsd = 1 / usdToInr;
        
        if (fromCurrency.equalsIgnoreCase("USD") && toCurrency.equalsIgnoreCase("INR")) {
            convertedAmount = amount * usdToInr;
        } else if (fromCurrency.equalsIgnoreCase("INR") && toCurrency.equalsIgnoreCase("USD")) {
            convertedAmount = amount * inrToUsd;
        }

        return convertedAmount;
    }
}