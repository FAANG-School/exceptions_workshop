package task_3;

import java.util.List;

import task_3.exceptions.CoursesNotFoundException;

public class SimpsonsSchool {

	public void enrollCharacter(SimpsonsCharacter character, List<SimpsonsCourse> courses) {

		if (character == null || courses == null || courses.isEmpty()) {
			throw new IllegalArgumentException("Arguments can't be null or empty");
		}

		if (courses.stream().anyMatch(course -> course == null)) {
			throw new IllegalArgumentException("Courses can't contain null elements");
		}

		character.getEnrolledCourses().addAll(courses);

	}

	public void addGrade(SimpsonsCharacter character, SimpsonsCourse course, int gradeValue) {

		if (gradeValue < 1 || gradeValue > 5) {
			throw new IllegalArgumentException("Grade value must be from 1 to 5");
		}

		if (character == null || course == null) {
			throw new IllegalArgumentException("Null args was got");
		}

		if (!character.getEnrolledCourses().contains(course)) {
			throw new CoursesNotFoundException(
					character.getName() + " not enrolled on " + course.getCourseName() + " yet");
		}

		character.getGrades().add(new SimpsonsGrade(course, character, gradeValue));

	}

	public void getCharacterTranscript(SimpsonsCharacter character) {

		if (character.getEnrolledCourses().isEmpty()) {
			throw new CoursesNotFoundException("Not found any " + character.getName() + "'s courses");
		}

		System.out.println(character.getName() + " has following grades:");
		character.getGrades().forEach(grade -> System.out.println(grade.getCourse().getCourseName() + ": " + grade.getGradeValue()));

	}

}
