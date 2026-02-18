import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] words = {"Java", "is", "cool", "Generics"};
        System.out.println("Original Array: " + Arrays.toString(words));

        GenericUtils.reverse(words);
        System.out.println("Reversed Array: " + Arrays.toString(words));

        System.out.println("---");

        Integer[] intArray = {10, 20, 30, 40};
        double intSum = GenericUtils.sum(intArray);
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Sum of Integers: " + intSum);

        Double[] doubleArray = {1.5, 2.5, 3.0};
        double doubleSum = GenericUtils.sum(doubleArray);
        System.out.println("Double Array: " + Arrays.toString(doubleArray));
        System.out.println("Sum of Doubles: " + doubleSum);
    }
}