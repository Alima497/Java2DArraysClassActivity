public class StudentGrades {
    void main (String[] args) {
        int[][] a= {
                {100, 90, 60, 85},
                {60, 72, 99, 91},
                {89, 100, 87, 80}
        };

        int totalCount = 0;
        int classMax = a[0][0];
        double totalAvg=0;
        double avg=0;
        for (int i=0; i<a.length ; i++){
            avg=0;


            for(int j=0; j<a[i].length; j ++){
                avg+=a[i][j];
                totalAvg+=a[i][j];
            }
            System.out.println("Students's GPA " + avg/4);

        }
        System.out.println("Total average = " + totalAvg/12);
        int max = a[0][0];
        for ( int i = 0; i< a.length; i++) {
            for ( int j = 0; j<a[i].length ; j++) {
                if (a[i][j]>max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Class maximum - "+ max);

    }
}
