package task_3;

import task_3.enums.CourseType;

import java.util.Objects;

public class SimpsonsCourse {
    private CourseType courseType;

    private int courseId;

    public SimpsonsCourse(CourseType courseType) {
        this.courseType = courseType;
        this.courseId = hashCode();
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public int getCourseId() {
        return courseId;
    }

    @Override
    public String toString() {
        return courseType.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpsonsCourse course = (SimpsonsCourse) o;
        return courseType == course.courseType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseType);
    }
}
