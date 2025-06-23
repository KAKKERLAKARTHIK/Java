package inheritance.simInhertence;

public class sim4g extends sim3g {
public void volte() {
    System.out.println("4g volte");
}
    public void callParentMethod() {
        super.call("this is calling from 4g"); // Call parent (sim3g) method
    }
 public static void main(String[] args) {
     sim4g sim4g = new sim4g();
     sim4g.callParentMethod();
 }
}
