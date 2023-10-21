package task_3.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SimpsonsSchool {
    private List<SimpsonsCharacter> characters = new ArrayList<>();
    private List<SimpsonsCourse> courses = new ArrayList<>();
    private List<SimpsonsGrade> grades = new ArrayList<>();

    public void enrollCharacter(SimpsonsCharacter character, List<SimpsonsCourse> courses){
        character.getEnrolledCourses().addAll(courses);
        characters.add(character);
    }

    public void addGrade(SimpsonsCharacter character, SimpsonsCourse course, int gradeValue){
        if(gradeValue < 1 || gradeValue > 5){
            throw new IllegalArgumentException("Оценка должна быть между 1 и 5.");
        }
        SimpsonsGrade grade = new SimpsonsGrade(course, character, gradeValue);
        grades.add(grade);
        character.getGrades().put(course, gradeValue);
    }

    public Map<SimpsonsCourse, Integer> getCharacterTranscript(SimpsonsCharacter character){
        if(!character.getEnrolledCourses().isEmpty()){
            return character.getGrades();
        } else {
            throw new IllegalArgumentException(character.getName() + " не записан на курсы.");
        }
    }
}
