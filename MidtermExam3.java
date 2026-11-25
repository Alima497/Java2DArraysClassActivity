import java.util.Scanner;
public class MidtermExam3 {
    public static double calculateTotal(double price, int quantity) {
        return price * quantity;
    }
    public static double applyDiscount(double total) {
        if (total >= 100) {
            return total*0.9;
        }
        return total;
    }
    public static void Receipt(double total, double finalTotal) {
        System.out.println("Total: $" + total) ;
        System.out.println("To pay: $" + finalTotal) ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your price:");
            double price = scanner.nextDouble();
            System.out.println("Enter your quantity:");
            int quantity = scanner.nextInt();
            double total= calculateTotal(price,quantity);
            double finalTotal = applyDiscount(total);
            Receipt(total,finalTotal);
            System.out.println("Another order? 1-Yes, 2-No");
            choice = scanner.nextInt();
            System.out.println();
        } while (choice == 1);
            scanner.close();

    }
}
