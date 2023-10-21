package task_3.solution;

public class SimpsonsCourse {
    private String courseName;
    private int courseId;

    public SimpsonsCourse(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseId() {
        return courseId;
    }
}
