public class ReplaceNegatives {
    void main(String[] args) {
        int[][] a = {
                {-5, 10, 15},
                {20, -25, 30},
                {-2, -6, 0}
        };
        System.out.println("Before: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("After: ");
        for ( int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            if ( a[i][j] < 0) {
                a[i][j]=0;
            }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}