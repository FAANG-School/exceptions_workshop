package task_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class SimpsonsGrade {
    private SimpsonsCourse course;
    private SimpsonsCharacter character;
    private int gradeValue;

    public SimpsonsGrade() {
    }

    public SimpsonsGrade(SimpsonsCourse course, SimpsonsCharacter character, int gradeValue) {
        this.course = course;
        this.character = character;
        this.gradeValue = gradeValue;
    }

    public SimpsonsCourse getCourse() {
        return course;
    }

    public void setCourse(SimpsonsCourse course) {
        this.course = course;
    }

    public SimpsonsCharacter getCharacter() {
        return character;
    }

    public void setCharacter(SimpsonsCharacter character) {
        this.character = character;
    }

    public int getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(int gradeValue) {
        this.gradeValue = gradeValue;
    }
}
