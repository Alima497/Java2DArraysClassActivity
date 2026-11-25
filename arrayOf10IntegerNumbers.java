public class arrayOf10IntegerNumbers {
    void main(String[] args) {
        int[] theVals = {3,7,9,1,2,4,5,11,15,20};

        int sum = 0;
        System.out.println("Array elements: ");

        for (int i = 0; i < theVals.length; i++) {
            System.out.println(theVals[i] + " ");
            if (theVals[i] % 2 != 0) {
                sum += theVals[i];

            }
        }
        System.out.println(sum);

    }
}