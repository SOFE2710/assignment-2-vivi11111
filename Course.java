import java.util.Vector;

public class Course {

    private Department dept;
    private String title; // title of the course (e.g. “Intro to programming”);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private Vector<Student> classList; // contains all students registered in this course

    public Department getDept() {
        return dept;
    }

    public String getTitle(){
        return title;
    }

    public String getCode(){
        return code;
    }

    private int getNumber(){
        return number;
    }

    public Course(String code, int number, Department dept, String title) {
        // also initialize the classList;
        this.code = code;
        this.number = number;
        this.dept = dept;
        this.title = title;

        Vector<Student>classList = new Vector<Student>();
    }

    public Course(){
        // TODO Auto-generated constructor stub
    }


    public String toString() {
        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260

        return code + " " +number+ " " +title+ ", Enrollment = " +classList.size();
    }

    public void add_ClassList(Student pupil){
        classList.add(pupil);
    }

    public void addPupil_ToRegister(Student pupil){
        dept.addStudentToRegister(pupil);
    }
}
