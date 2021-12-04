import java.util.Vector;

public class Student extends Person{
    private String id;
    private String name;
    private Vector courses; // contains all courses the student is registered in

    // constructor
    public Student(String stdId, String stdName) {
        // initialize name and id. Also initialize the Vector
        name = stdName;
        id = stdId;
        Vector<Course>courses=new Vector<Course>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Vector getCourses(){
        return courses;
    }

    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
        String print = id + " " + name + "\r\n" +"Registered courses: " + courses;
        return print;
    }

    public void  registerFor (Course course){
        if(!courses.contains(course)){
            courses.add(course);
            course.add_ClassList(this);
            course.addPupil_ToRegister(this);
        }
    }

    public Boolean isRegisteredInCourse (Course course){
        return courses.contains(course);
    }
}
