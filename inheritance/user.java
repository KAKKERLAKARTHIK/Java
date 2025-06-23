package inheritance;

public class user {
    public static void main(String[] args) {
        guest geustUser = new guest();
        geustUser.read("Guest User");
        Developer developerUser = new Developer();
        developerUser.read("Developer User");
        developerUser.write("Developer User");
        Admin adminUser = new Admin();
        adminUser.read("Admin User");
        adminUser.manage("Admin User");
        adminUser.write("Admin User");
    }
}
