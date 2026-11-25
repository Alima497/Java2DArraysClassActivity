import java.util.Scanner;
public class CountValues {
    void main(String[] args) {
        int[][] a = {
                {5, 10, 15},
                {20, 25, 30},
                {2, 6, 0}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int count = 0;


        for (int j = 0; j<a.length; j++) {
            for (int i = 0; i < a[j].length; i++) {
if (a[i][j]> number) {
    count++;

}
            }
        }
        System.out.println("Numbers greater than " + number + " - " + count );
        scanner.close();
            }



    }


