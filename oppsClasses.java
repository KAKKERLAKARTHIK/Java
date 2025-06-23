public class oppsClasses {
    static void Car (String brand,String color , String cost){
      System.out.println("Brand : " + brand + "  color  : " + color + "  Cost : " + cost);
    }
    static void Car (){
        System.out.println("This is default costrot");
    }
    static  String test;

    // Proper constructor (no return type, same name as class)
    oppsClasses(String value) {
        this.test = value;
        System.out.println("This is a constructor. Value: " + test);
    }
    public static void main(String[] args) {
        oppsClasses Obj = new oppsClasses("test");
        Obj.Car("BMW","Blue" , "20,00,000");
        Obj.Car();
    }
}
