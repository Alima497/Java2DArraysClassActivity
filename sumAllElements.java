public class sumAllElements {
    void main(String[] args) {
        int[][] a = {
                {5, 10, 15},
                {20, 25, 30},
                {2, 6, 0}
        };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);
    }
}