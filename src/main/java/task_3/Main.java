package task_3;

import task_3.enums.CourseType;
import task_3.exceptions.CourseNotFoundException;
import task_3.exceptions.EmptyCoursesException;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpsonsSchool school = new SimpsonsSchool();

        SimpsonsCharacter bart = new SimpsonsCharacter("Bart Simpson", 10);
        SimpsonsCharacter lisa = new SimpsonsCharacter("Lisa Simpson", 8);

        SimpsonsCourse math = new SimpsonsCourse(CourseType.MATH);
        SimpsonsCourse history = new SimpsonsCourse(CourseType.HISTORY);

        try {
            school.getCharacterTranscript(bart);
        } catch (EmptyCoursesException e) {
            System.out.println("Error 1: " + e.getMessage());
        }

        try {
            school.addGrade(math, bart, 10);
        } catch (CourseNotFoundException e) {
            System.out.println("Error 2: " + e.getMessage());
        }

        try {
            school.enrollCharacter(lisa, List.of(math, history));
            school.addGrade(math, lisa, 10);
            school.addGrade(history, lisa, 9);
            System.out.println(school.getCharacterTranscript(lisa));
        } catch (Exception e) {
            System.out.println("Error 3: " + e.getMessage());
        }
    }
}
