public class minAndMax {
    void main(String[] args) {
        int[][] a = {
                {5, 10, 15, 8},
                {20, 25, 30, 5},
                {2, 6, 0, 10}
        };
        int max = a[0][0];
        int min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                } else if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}