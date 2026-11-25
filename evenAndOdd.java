public class evenAndOdd {
    void main(String[] args) {
        int[][] a = {
                {5, 10, 15},
                {20, 25, 30},
                {2, 6, 0}
        };
        int even = 0;
        int odd = 0;
        for (int[] row : a) {
            for (int value : row) {
                if (value % 2 ==0) {
                    even++;
                } else {
                    odd++;
                }
                }
            }
        System.out.println("Even values: " + even);
        System.out.println("Odd values: " + odd);

    }
}