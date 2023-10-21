package task_3;

import java.util.Objects;

public class SimpsonsGrade {
    private SimpsonsCourse course;

    private SimpsonsCharacter character;

    private int gradeValue;

    public SimpsonsGrade(SimpsonsCourse course, SimpsonsCharacter character, int gradeValue) {
        if (course != null) {
            this.course = course;
        } else {
            throw new IllegalArgumentException("Course can not be null");
        }
        if(character != null) {
            this.character = character;
        } else {
            throw new IllegalArgumentException("Character can not be null");
        }
        if(gradeValue >= 0 || gradeValue < 11) {
            this.gradeValue = gradeValue;
        } else {
            throw new IllegalArgumentException("Grade should be in the range from 1 to 10");
        }
    }

    public SimpsonsCourse getCourse() {
        return course;
    }

    public SimpsonsCharacter getCharacter() {
        return character;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpsonsGrade grade = (SimpsonsGrade) o;
        return gradeValue == grade.gradeValue && Objects.equals(course, grade.course) && Objects.equals(character, grade.character);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, character, gradeValue);
    }
}
