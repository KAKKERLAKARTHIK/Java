package Interfaces;

public class lenovo implements  Laptop{
   public  void turnOn(){
    System.out.println("lenovo had a turn on feature");
   }
   public  void turnOff (){
    System.out.println("lenovo had turn off feature");
   }

   public void capture(){
    System.out.println("lenovo had caoture feture with camere");
   }

     public void copy (){
    System.out.println("lenovo had copy feature");
   }


   public void paste (){
    System.out.println("lenovo had paste feature");
   }
     public void cut (){
    System.out.println("lenovo had cut feature");
   }
 public static void main(String[] args) {
  Laptop.audioAndVideo();
   lenovo myLenovo = new  lenovo();
   myLenovo.capture();
 }
}
