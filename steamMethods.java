
import java.lang.reflect.Array;
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

    // sorting method
    static void sort(int[] array) {
        List<Integer> sortedArray = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
        System.out.println(sortedArray);
    }

    // distinct method
    static void getUnqValues(int[] array) {
        List<Integer> unq = Arrays.stream(array).boxed().distinct().sorted().filter(val -> val != 1)
                .collect(Collectors.toList());
        System.out.println(unq);
    }

    // collect
    static void collectValues(String[] values) {
        List<String> collect = Arrays.stream(values).sorted().filter(val -> val != "Karthik")
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    // macthing condtions
    static void matchingConditions(int[] array) {

        boolean anyMatch = Arrays.stream(array).allMatch(n -> n > 4);

        boolean allEven = List.of(2, 4).stream()
                .allMatch(n -> n % 2 == 0);

        boolean noneNegative = List.of(1, 2).stream()
                .noneMatch(n -> n < 0); // true
        System.out.println(anyMatch + " " + allEven + " " + noneNegative);
    }

    static boolean amStronNumber(int value) {
        int orginal = value;
        int result = 0;
        int length = String.valueOf(value).length();
        while (value != 0) {
            int ld = value % 10;
            result += Math.pow(ld, length);
            value /= 10;
        }
        // System.out.println( orginal == result  +  123);
        return orginal == result;
    }

    public static void main(String[] args) {
        String[] names = { "Karthik", "Kavaya", "zaaajf", "Lavan", "Amar" };
        String[][] values = { { "1", "2", "3" }, { "4", "5", "6" } };
        int[] intValues = { 7, 8, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8 };
        filter(names);
        mapMethod(names);
        flatMap(values);
        forEachMethod(names);
        reduceMethod(intValues);
        sort(intValues);
        getUnqValues(intValues);
        collectValues(names);
        matchingConditions(intValues);
        System.out.println(amStronNumber(370));
    }
}
