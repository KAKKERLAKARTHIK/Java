package inheritance;
public class Admin extends Developer {
    public void manage(String name) {
        System.out.println("Admin manage" + name);
    }
}
