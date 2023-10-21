package task_3;

import task_3.exceptions.CourseNotFoundException;
import task_3.exceptions.DuplicateException;
import task_3.exceptions.EmptyCoursesException;

import java.util.List;
import java.util.stream.Collectors;

public class SimpsonsSchool {

    public void enrollCharacter(SimpsonsCharacter character, List<SimpsonsCourse> courses) {
        for (SimpsonsCourse course : courses) {
            if(!character.getEnrolledCourses().contains(course)) {
                character.getEnrolledCourses().add(course);
            } else {
                throw new DuplicateException("Character has already been enrolled");
            }
        }
    }

    public void addGrade(SimpsonsCourse course, SimpsonsCharacter character, int gradeValue) {
        SimpsonsGrade grade = new SimpsonsGrade(course, character, gradeValue);

        if(!character.getEnrolledCourses().contains(course)) {
            throw new CourseNotFoundException();
        }

        if(!character.getGrades().contains(grade)) {
            character.getGrades().add(grade);
        } else {
            throw new DuplicateException("Grade has already been added");
        }
    }

    public String getCharacterTranscript(SimpsonsCharacter character) {
        if(character.getEnrolledCourses().isEmpty()) {
            throw new EmptyCoursesException();
        }

        String courseNames = character.getEnrolledCourses()
                .stream()
                .map(course -> course.getCourseType().toString())
                .collect(Collectors.joining(", "));

        String grades = character.getGrades()
                .stream()
                .map(grade -> grade.getGradeValue() + " in " + grade.getCourse().getCourseType())
                .collect(Collectors.joining(", "));

        return character.getName() + " is enrolled in the following subjects: " + courseNames +
                "; and received a " + grades;
    }
}
