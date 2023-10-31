package task_3;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
public class SimpsonsSchool {
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
        school.addGrade(school.characterList.get(1), school.courseList.get(2), 6);
        school.addGrade(school.characterList.get(1), school.courseList.get(3), 1);
        try {
            school.getCharacterTranscript(school.characterList.get(1));
        } catch (EmptyCoursesException e) {
            log.info(e.getStackTrace());
        }


    }

    public void enrollCharacter(SimpsonsCharacter character, List<SimpsonsCourse> courses) {
        character.setEnrolledCourses(courses);
    }

    public void addGrade(SimpsonsCharacter character, SimpsonsCourse course, int gradeValue) {
        try {
            character.getGrades().add(new SimpsonsGrade(course, character, gradeValue));
        } catch (IllegalArgumentException e) {
            log.info(e.getStackTrace());
        }
    }

    public void getCharacterTranscript(SimpsonsCharacter character) throws EmptyCoursesException {
        if (character.getEnrolledCourses().isEmpty()) {
            throw new EmptyCoursesException("Список курсов у " + character.getName() + " пуст");
        }
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
