import java.util.Scanner ;

public class MidtermExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your number: ");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            System.out.println("Multiplication table for " + number + " up to 10");
            for (int i = 1; i <= 10; i++) {
                System.out.println("Result: "+ number + " * " + i + " = " + (number * i));
            }
        } while (true) ;
        scanner.close();
    }
}