
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class steamMethods {
    // filter method
    static void filter(String[] array) {
        List<String> filterValues = Arrays.stream(array).filter(val -> val.startsWith("K"))
                .collect(Collectors.toList());
        System.out.println(filterValues);
    };

    // map method
    static void mapMethod(String[] array) {
        List<String> result = Arrays.stream(array)
                .map(val -> val + "  " + "abc")
                .collect(Collectors.toList());
        System.out.println(result);
    };

    // flat map method
    static void flatMap(String[][] array) {
        List<String> combind2DArray = Arrays.stream(array).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(combind2DArray);
    }

    // for Each method
    static void forEachMethod(String[] array) {
        Arrays.stream(array).forEach(val -> System.out.println("this is value  " + val));
    }

    // reduce method
    static void reduceMethod(int[] array) {
        int sumResult = Arrays.stream(array).reduce(0, Integer::sum);
        System.out.println(sumResult);
    }

    public static void main(String[] args) {
        String[] names = { "Karthik", "Kavaya", "Khaleja", "Lavan", "Amar" };
        String[][] values = { { "1", "2", "3" }, { "4", "5", "6" } };
        int[] intValues = { 1, 2, 3, 4, 5, 6 };
        filter(names);
        mapMethod(names);
        flatMap(values);
        forEachMethod(names);
        reduceMethod(intValues);
    }
}
