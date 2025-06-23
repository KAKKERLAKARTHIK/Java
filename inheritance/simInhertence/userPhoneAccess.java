package inheritance.simInhertence;

public class userPhoneAccess {
    public static void main(String[] args) {
        sim2g sim2g = new sim2g();
        sim3g sim3g = new sim3g();
        sim4g sim4g = new sim4g();
        sim5g sim5g = new sim5g();

     //sim2g call sms acces
     System.out.println("sim2g call sms acces");
     sim2g.call("hello how are you");
     sim2g.sms();
     //sim3g call sms acces and internet gprs
     System.out.println("sim3g call sms acces and internet gprs");
     sim3g.call("sdfd");
     sim3g.sms();
     sim3g.gprs();
     // sim4g call sms acces and internet gprs and volte
     System.out.println("sim4g call sms acces and internet gprs and volte");
     sim4g.call("hello how are you");
     sim4g.sms();
     sim4g.gprs();
     sim4g.volte();
     // sim5g call sms acces and internet gprs and volte and fiveg
     System.out.println("sim5g call sms acces and internet gprs and volte and fiveg");
     sim5g.call("hello how are you");
     sim5g.sms();
     sim5g.gprs();
     sim5g.volte();
     sim5g.fiveg();
    }
}
