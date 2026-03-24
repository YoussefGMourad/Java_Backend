package task17.PackTwo;

public class Teacher {
    private int teacherId;
    private String teacherName;
    boolean active;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

     boolean isActive() {
        return active;
    }

     void setActive(boolean active) {
        this.active = active;
    }
}