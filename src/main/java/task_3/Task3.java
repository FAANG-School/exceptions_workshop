package task_3;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import task_3.exceptions.CoursesNotFoundException;

@Slf4j
public class Task3 {

	public static void main(String[] args) {

		SimpsonsCourse course1 = new SimpsonsCourse("History");
		SimpsonsCourse course2 = new SimpsonsCourse("Math");
		SimpsonsCourse course3 = new SimpsonsCourse("Bart's Pranks");
		SimpsonsCourse course4 = new SimpsonsCourse("Science");
		SimpsonsCourse course5 = new SimpsonsCourse("Music");
		SimpsonsCourse course6 = new SimpsonsCourse("Environmentalism");

		SimpsonsSchool school = new SimpsonsSchool();

		SimpsonsCharacter simpsonsCharacter1 = new SimpsonsCharacter("Bart Simpson", 10);
		SimpsonsCharacter simpsonsCharacter2 = new SimpsonsCharacter("Lisa Simpson", 8);

		List<SimpsonsCourse> emptyList = new ArrayList<>();

		try {
			school.enrollCharacter(simpsonsCharacter1, emptyList);
		} catch (IllegalArgumentException e) {
			log.error("Bad args in enrollCharacter(): {}", e.getMessage());
		}

		emptyList.add(null);
		emptyList.add(course6);

		try {
			school.enrollCharacter(simpsonsCharacter1, emptyList);
		} catch (IllegalArgumentException e) {
			log.error("Bad args in enrollCharacter(): {}", e.getMessage());
		}

		try {
			school.addGrade(simpsonsCharacter2, course6, 0);
		} catch (IllegalArgumentException e) {
			log.error("Bad args in addGrade: {}", e.getMessage());
		}

		try {
			school.addGrade(simpsonsCharacter2, null, 5);
		} catch (IllegalArgumentException e) {
			log.error("Bad args in addGrade(): {}", e.getMessage());
		}

		try {
			school.getCharacterTranscript(simpsonsCharacter2);
		} catch (CoursesNotFoundException e) {
			log.error("Attempt to get empty list in getCharacterTranscript(): {}", e.getMessage());
		}

		try {
			school.addGrade(simpsonsCharacter2, course1, 5);
		} catch (CoursesNotFoundException e) {
			log.error("Attempt to grade not enrolled course in addGrade(): {}", e.getMessage());
		}

		school.enrollCharacter(simpsonsCharacter1, List.of(course2, course1, course3));
		school.enrollCharacter(simpsonsCharacter2, List.of(course4, course5, course6));

		school.addGrade(simpsonsCharacter1, course2, 4);
		school.addGrade(simpsonsCharacter1, course1, 3);
		school.addGrade(simpsonsCharacter1, course3, 5);
		school.addGrade(simpsonsCharacter2, course4, 5);
		school.addGrade(simpsonsCharacter2, course5, 4);
		school.addGrade(simpsonsCharacter2, course6, 5);

		System.out.println(simpsonsCharacter2.getName() + " has following grades: "
				+ school.getCharacterTranscript(simpsonsCharacter2));
		System.out.println(simpsonsCharacter1.getName() + " has following grades: "
				+ school.getCharacterTranscript(simpsonsCharacter1));

	}
}
