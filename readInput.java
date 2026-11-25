import java.util.Scanner;

public class readInput {
    void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 2;
        int columns = 3;
        int[][] a = new int[rows][columns];
        System.out.println("Enter your integers: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your 2*3 matrix");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}