package task15;

public class Course {

    private final int courseID;
    private final String courseName;

    public Course(int courseID, String courseName){
        this.courseID = courseID;
        this.courseName = courseName;

    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

public void  showCourseDetails(){
    System.out.println("The course id is: "+courseID);
    System.out.println("The course name is: "+courseName);
}

}