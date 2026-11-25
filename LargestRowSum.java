public class LargestRowSum {
    void main(String[] args) {
        int[][] a = {
                {20, 6, 19, 40},
                {10, 25, 40, 2},
                {2, 6, 0, 50}
        };
        int maxSum=0;
        int maxSumRow =0;

        for (int i = 0; i<a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }
            if (rowSum>maxSum) {
                maxSum = rowSum;
                maxSumRow = i;
            }
        }
        System.out.println("Row index with the largest sum - " + (maxSumRow + 1));
        System.out.println("Largest sum - " + maxSum);

    }
}



