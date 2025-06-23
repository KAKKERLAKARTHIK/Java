package Interfaces;

public interface Laptop {
   public void turnOn();
   public void turnOff();
   public void capture();
   public void copy();
   public void paste();
   public void cut();

default void security(){
   commonFunctionality();
   System.out.println("add security feature for your laptop");
}
static void audioAndVideo (){
   commonFunctionality();
   
   System.out.println("add audio and video feature in your lap top");
}

private static void commonFunctionality(){
   System.out.println("need to add  screen recording and other feture are common for all laptops");
}
}
