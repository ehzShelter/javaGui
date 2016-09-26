import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamOperations
{
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // display original values
        System.out.print("Original values: ");

        // STREAM
        IntStream.of(values)
                 .forEach(value -> System.out.printf("%d ", value));


        System.out.println();

        // sum of the squared values using reduce method
        System.out.printf("Sum of the values via reduce method: %d%n",
                IntStream.of(values)
                         .reduce(0, (x, y) -> x + y * y));
                         // addtion
                         // .reduce(0, (x, y) -> x + y));
                         // .reduce(1, (x, y) -> x * y));
    }
}
