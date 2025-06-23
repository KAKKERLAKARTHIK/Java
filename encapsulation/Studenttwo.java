package encapsulation;

public class Studenttwo {
     private int rollNo;
    private String name;
    private boolean isPresent;

    // Setter method
    public void setStudentDetails(int rollNo, String name, boolean isPresent) {
        this.rollNo = rollNo;
        this.name = name;
        this.isPresent = isPresent;
    }

    // Getter method
    public void getStudentDetails() {
        System.out.println(rollNo + " " + name + " " + isPresent);
    }
}
