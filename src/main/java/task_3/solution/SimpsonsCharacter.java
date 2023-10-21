package task_3.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpsonsCharacter {
    private String name;
    private int age;
    private int characterId;
    private List<SimpsonsCourse> enrolledCourses = new ArrayList<>();
    private Map<SimpsonsCourse, Integer> grades = new HashMap<>();

    public SimpsonsCharacter(String name, int age, int characterId) {
        this.name = name;
        this.age = age;
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCharacterId() {
        return characterId;
    }

    public List<SimpsonsCourse> getEnrolledCourses() {
        return enrolledCourses;
    }

    public Map<SimpsonsCourse, Integer> getGrades() {
        return grades;
    }
}
