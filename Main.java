import java.util.Date;

public class Main {
    String name;
    Date dob;

    Main(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    void displayInfo() {
        int currentYear = 2025;
        int birthYear = dob.getYear() + 1900;
        int age = currentYear - birthYear;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Date dob = new Date(102, 0, 1);
        Main student = new Main("Ram", dob);
        student.displayInfo();
    }
}
