package encapsulation;

public class Teacher {
    public static void main(String[] args) {
        StudentOne studentOne = new StudentOne();
        studentOne.setStudentDetails(1, "Karthik", true);
        studentOne.isPresent = false;
        studentOne.getStudentDetails();



        Studenttwo studenttwo = new Studenttwo();
        studenttwo.setStudentDetails(2, "Lavan", true);
        studenttwo.getStudentDetails();
    }
}
