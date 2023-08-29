import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price,priceWithTax;
        System.out.print("Enter the price of product: ");
        price = input.nextDouble();

        if (price < 500){
            System.out.println("Tax amount is 18%.");
            priceWithTax = price * 1.18;
            System.out.println("Price of product with taxes is " + priceWithTax);
        }
        else {
            System.out.println("Tax amount is 8%.");
            priceWithTax = price * 1.08;
            System.out.println("Price of product with taxes is " + priceWithTax);
        }
    }
}