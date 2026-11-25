public class MainDiagonalSum {
    void main(String[] args) {
        int[][] a = {
                {5, 10, 15},
                {20, 25, 30},
                {2, 6, 0}
        };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
        }
            System.out.println("Main diagonal sum = " + sum);
        }
    }

