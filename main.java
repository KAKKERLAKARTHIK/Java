import java.util.Arrays;
public class main {

    public static void main(String[] args) {
        int x = -123;
        reverse(x);
    }

    // public boolean isPalindrome(int value) {
    // String convertedValue = Integer.toString(value);

    // int i = 0;
    // int j = convertedValue.length() - 1;

    // while (i <= j) {
    // if (convertedValue.charAt(i) != convertedValue.charAt(j)) {

    // return false;
    // }
    // i++;
    // j--;

    // }
    // return true;

    // }
    static int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        int result = 0;
        while (x != 0) {
            int val = x % 10;
            result = result * 10 + val;
            x = x / 10;
        }
        int [] arr = {4,2,0,1,2,3};
        Arrays.sort(arr);
        int [] copy = Arrays.copyOf(arr, 8);
        int [] array1 = {1,2,3};
        int [] array2 = {1,2,3};
        System.out.println(Arrays.equals(array1, array2));
        int [] newArray = new int [5];
        Arrays.fill(newArray, 6);
        int[] binarySearch = {8,5,4,6};
        // Arrays.binarySearch(binarySearch, 2);
        int[] copyOfRange =Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(copyOfRange));
        //  for (int i = 0; i < arr.length; i++) {
        //      System.out.println(arr[i]);
        //  }
        return sign * result;
    }
    
}