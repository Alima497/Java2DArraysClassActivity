public class СolumnSums {
    void main(String[] args) {
        int[][] a = {
                {5, 10, 15},
                {20, 25, 30},
                {2, 6, 0}
        };
                for (int j = 0; j<a.length; j++) {
                    int columnSum = 0;
                    for (int i = 0; i < a[j].length; i++) {
                        System.out.println("i=" + i + " " + "j=" + j + "current element:" + a[i][j]);
                        columnSum += a[i][j];
                    }
                    System.out.println("Column " + j + ":" + columnSum);
                }

    }
}
