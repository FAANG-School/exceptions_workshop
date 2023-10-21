package task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SimpsonsCharacter {
    private String name;

    private int age;

    private int characterId;

    private List<SimpsonsCourse> enrolledCourses = new ArrayList<>();

    private List<SimpsonsGrade> grades = new ArrayList<>();

    public SimpsonsCharacter(String name, int age) {
        this.name = name;
        this.age = age;
        this.characterId = hashCode();
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

    public void setEnrolledCourses(List<SimpsonsCourse> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public List<SimpsonsGrade> getGrades() {
        return grades;
    }

    public void setGrades(List<SimpsonsGrade> grades) {
        this.grades = grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpsonsCharacter that = (SimpsonsCharacter) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
