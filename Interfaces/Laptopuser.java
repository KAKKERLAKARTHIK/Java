package Interfaces;

public class Laptopuser {
    public static void main(String[] args) {
        lenovo lenovoLaptop = new lenovo();
        lenovoLaptop.capture();
        lenovoLaptop.copy();
        lenovoLaptop.cut();
        lenovoLaptop.paste();
        lenovoLaptop.turnOff();
        lenovoLaptop.turnOn();
         System.out.println("");
        hpLaptop hpLaptopUser = new hpLaptop();
        
        hpLaptopUser.capture();
        hpLaptopUser.copy();
        hpLaptopUser.cut();
        hpLaptopUser.turnOff();
        hpLaptopUser.turnOn();
        hpLaptopUser.paste();
        
    }
}
