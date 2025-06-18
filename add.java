public class add {
    public int sum(int val) {
        if (val > 0) {
            return val + sum(val - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        add obj = new add();
        int result = obj.sum(10);
        System.out.println(result);
    }
}
