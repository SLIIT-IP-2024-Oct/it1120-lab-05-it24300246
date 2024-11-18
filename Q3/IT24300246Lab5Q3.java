import java.util.Scanner;

public class IT24300246Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_3_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start date (day):");
        int startDate = scanner.nextInt();
        System.out.println("Enter the end date (day):");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int daysReserved = endDate - startDate;
        int totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        int discount = 0;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discount = DISCOUNT_3_4_DAYS;
        } else if (daysReserved >= 5) {
            discount = DISCOUNT_5_OR_MORE_DAYS;
        }

        totalAmount -= totalAmount * discount / 100;

        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs " + totalAmount);
    }
}