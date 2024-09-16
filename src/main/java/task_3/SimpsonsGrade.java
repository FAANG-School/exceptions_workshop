package task_3;

public class SimpsonsGrade {
    private SimpsonsCourse course;
    private SimpsonsCharacter character;
    private int gradeValue;
    private final int MINIMAL_BAL = 0;
    private final int MAXIMUM_BAL = 5;

    public SimpsonsGrade() {
    }

    public SimpsonsGrade(SimpsonsCourse course, SimpsonsCharacter character, int gradeValue) {
        setCourse(course);
        setCharacter(character);
        setGradeValue(gradeValue);
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
        if (gradeValue <= MINIMAL_BAL || gradeValue > MAXIMUM_BAL) {
            throw new IllegalArgumentException("Введена оценка " + gradeValue + ". Оценка должна быть от 1 до 5");
        }
        this.gradeValue = gradeValue;
    }
}
