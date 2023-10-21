package task_3.solution;

public class SimpsonsGrade {
    private SimpsonsCourse course;
    private SimpsonsCharacter character;
    private int gradeValue;

    public SimpsonsGrade(SimpsonsCourse course, SimpsonsCharacter character, int gradeValue) {
        this.course = course;
        this.character = character;
        this.gradeValue = gradeValue;
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
}
