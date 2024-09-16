package task_3;


import java.util.List;
public class SimpsonsCharacter {
    private String name;
    private int age;
    private int characterId;
    private List<SimpsonsCourse> enrolledCourses;
    private List<SimpsonsGrade> grades;

    public SimpsonsCharacter(String name, int age, int characterId, List<SimpsonsCourse> enrolledCourses, List<SimpsonsGrade> grades) {
        setName(name);
        setAge(age);
        setCharacterId(characterId);
        setEnrolledCourses(enrolledCourses);
        setGrades(grades);
    }

    public SimpsonsCharacter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
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
}
