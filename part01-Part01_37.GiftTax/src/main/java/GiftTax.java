
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        
        double tax = calculateTax(giftValue);
        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }

    }

    public static double calculateTax(int giftValue) {
        int minValue = 0;
        int taxLimit = 0;
        double taxRate = 0;
        
        if (giftValue < 5000) {
            return 0;
        }

        if (giftValue <= 25000) {
            minValue = 5000;
            taxLimit = 100;
            taxRate = 0.08;
        } else if (giftValue <= 55000) {
            minValue = 25000;
            taxLimit = 1700;
            taxRate = 0.1;
        } else if (giftValue <= 200000) {
            minValue = 55000;
            taxLimit = 4700;
            taxRate = 0.12;
        } else if (giftValue <= 1000000) {
            minValue = 200000;
            taxLimit = 22100;
            taxRate = 0.15;
        } else {
            minValue = 1000000;
            taxLimit = 142100;
            taxRate = 0.17;
        }

        return taxLimit + (giftValue - minValue) * taxRate;
    }
}
