package task_3;
public class SimpsonsCourse {
    private String courseName;
    private int courseId;

    public SimpsonsCourse() {
    }

    public SimpsonsCourse(String courseName, int courseId) {
        setCourseName(courseName);
        setCourseId(courseId);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
