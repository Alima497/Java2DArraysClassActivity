import java.util.Arrays;
public class searchForAnElement {
    void main(String [] args) {
        String[] numbers = {"20","30","10","5","9","11"};
        String target = "9";
        int index = Arrays.asList(numbers).indexOf(target);
            System.out.println(target + " found at index: " + index);

        }
    }



