import java.util.Vector;
import java.util.Random;
import java.util.HashSet;

public class Department {
    private String name; // the name of school “Dept of Computing and Info Science.”
    private String id; // short name for courses “SOFE”, “ELEE”, “STAT”, etc
    private Vector<Course> courseList; // all courses offered by the department
    private Vector<Student> registerList; // all students taking courses in the department.

    Random rand = new Random();

    public Department(String name, String id) {
        // also initialize the vectors
        this.name = name;
        this.id = id;

        Vector<Course>courseList = new Vector<Course>();
        Vector<Student>registerList = new Vector<Student>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        // returns a string representation of department name, number
        // of courses offered and number of students registered in the
        // department. Use the format:
        // ECSE: 53 courses, 460 students

        return name + ": " +courseList.size()+ " courses, " +registerList.size()+ " students";
    }

    public void offerCourse(Course course){
        courseList.add(course);
    }

    public void printCoursesOffered(){
        for(int i=0; i<courseList.size(); i++){
            courseList.elementAt(i).toString();
        }
    }

    public void addStudentToRegister(Student pupil){
        if(isStudentRegistered(pupil)){
            registerList.add(pupil);
        }
    }

    public boolean isStudentRegistered(Student student){
        return (registerList.contains(student));
    }

   /* public Vector<Student>studentsRegisteredInCourse(int code){
        boolean found = false;
        Vector<Student> studentInCourse = new Vector<Student>();

        for (int i=0; i<courseList.size(); i++){
            if(code==((courseList.elementAt(i)).getCode())){
                studentInCourse = (courseList.elementAt(i).getClassList());
                found = true;
                break;
            }
        }
    if(found){
        return studentsInCourse;
    }
    else{
        System.out.println("This course is not taught in this department.");
        return null;
    }
    }*/
}