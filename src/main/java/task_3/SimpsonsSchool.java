package task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SimpsonsSchool {
  //  private List<SimpsonsGrade> simpsonsGradeList = new ArrayList<>();
    private List<SimpsonsCharacter> characterList = new ArrayList<>();
    private List<SimpsonsCourse> courseList = new ArrayList<>();

    public static void main(String[] args) {
        SimpsonsSchool school = new SimpsonsSchool();
        school.characterList.add(new SimpsonsCharacter("Ivan", 25, 1, new ArrayList<>(), new ArrayList<>()));
        school.characterList.add(new SimpsonsCharacter("Petr", 24, 1, new ArrayList<>(), new ArrayList<>()));
        school.characterList.add(new SimpsonsCharacter("Alexandr", 26, 1, new ArrayList<>(), new ArrayList<>()));
        school.courseList.add(new SimpsonsCourse("Math", 1));
        school.courseList.add(new SimpsonsCourse("Science", 2));
        school.courseList.add(new SimpsonsCourse("Music", 3));
        school.courseList.add(new SimpsonsCourse("History", 4));
        for (SimpsonsCharacter character : school.characterList) {
            school.enrollCharacter(character, school.courseList);
        }

            school.addGrade(school.characterList.get(1), school.courseList.get(0), 4);
            school.addGrade(school.characterList.get(1), school.courseList.get(1), 3);
            school.addGrade(school.characterList.get(1), school.courseList.get(2), 5);
            school.addGrade(school.characterList.get(1), school.courseList.get(3), 1);
            school.getCharacterTranscript(school.characterList.get(1));


    }

    public void enrollCharacter(SimpsonsCharacter character, List<SimpsonsCourse> courses) {
        character.setEnrolledCourses(courses);
    }

    public void addGrade(SimpsonsCharacter character, SimpsonsCourse course, int gradeValue) {
        character.getGrades().add(new SimpsonsGrade(course, character, gradeValue));
        //simpsonsGradeList.add(new SimpsonsGrade(course, character, gradeValue));
    }

    public void getCharacterTranscript(SimpsonsCharacter character) {
        System.out.println(character.getName() + " записан на предметы:");
        for (SimpsonsGrade simpsonsGrade : character.getGrades()) {
            if (simpsonsGrade.getCharacter().equals(character)) {
                System.out.print(simpsonsGrade.getCourse().getCourseName() + " - ");
                System.out.print("Оценка - " + simpsonsGrade.getGradeValue() + ";");
                System.out.println();
            }
        }

    }
}
