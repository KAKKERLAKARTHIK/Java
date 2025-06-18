public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // This is the entry point for running the class
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("add(int, int): " + calc.add(2, 3));
        System.out.println("add(int, int, int): " + calc.add(2, 3, 4));
        System.out.println("add(double, double): " + calc.add(10000000, 3.7));
    }
}
