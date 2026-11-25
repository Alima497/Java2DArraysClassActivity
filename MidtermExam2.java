import java.util.Scanner;
public class MidtermExam2 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner ( System.in) ;
        do {
            System.out.println( " Enter your number: ");
            int number = scanner.nextInt();
            if (number>0) {
                System.out.println("Your number is positive");
            } else if (number <0) {
                System.out.println("Your number is negative");
            } else {
                System.out.println("Your number is zero");
break;
            }
        } while (true);

        scanner.close();
    }
}
