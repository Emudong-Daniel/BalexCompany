package liam.company.balexcompany;

public class BalexCompany {

    public static void main(String[] args) {
        // Call the calculatePay method for each employee with their name
        calculatePay("Employee 1", 7.50, 35); // Employee 1
        calculatePay("Employee 2", 8.20, 47); // Employee 2
        calculatePay("Employee 3", 10.00, 73); // Employee 3
    }

    public static void calculatePay(String employeeName, double basePay, double hoursWorked) {
        double minimumWage = 8.00;
        double maxHours = 60;

        // Rule 3: Base pay must not be less than minimum wage
        if (basePay < minimumWage) {
            System.out.printf("%s: Error: Base pay must be at least $%.2f per hour.%n", employeeName, minimumWage);
            return;
        }

        // Rule 4: Number of hours worked must not be more than 60
        if (hoursWorked > maxHours) {
            System.out.printf("%s: Error: Number of hours worked must not exceed %.0f hours per week.%n", employeeName, maxHours);
            return;
        }

        double regularPay = 0;
        double overtimePay = 0;

        // Rule 1 and 2: Calculate regular and overtime pay
        if (hoursWorked <= 40) {
            regularPay = hoursWorked * basePay;
        } else {
            regularPay = 40 * basePay;
            overtimePay = (hoursWorked - 40) * (basePay * 1.5);
        }

        double totalPay = regularPay + overtimePay;
        System.out.printf("%s: Total pay for %.2f hours at a base pay of $%.2f per hour is $%.2f%n", employeeName, hoursWorked, basePay, totalPay);
    }
}



