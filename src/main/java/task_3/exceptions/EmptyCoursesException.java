package task_3.exceptions;

public class EmptyCoursesException extends RuntimeException {
    public EmptyCoursesException() {
        super("Course list is empty");
    }
}
