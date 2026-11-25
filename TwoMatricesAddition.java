public class TwoMatricesAddition {
    void main(String[] args) {
        int[][] a = {
                {10, 4, 12},
                {30, 10, 9}
        };
        int[][] b = {
                {20, 90, 100},
                {50, 20, 5}
        };
        int[][] result = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Two matrices addition: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}