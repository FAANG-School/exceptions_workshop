package task_3;

import java.util.Objects;

public class SimpsonsGrade {

	private final SimpsonsCourse course;
	private final SimpsonsCharacter character;
	private final int gradeValue;

	public SimpsonsGrade(SimpsonsCourse course, SimpsonsCharacter character, int gradeValue) {
		this.course = course;
		this.character = character;
		this.gradeValue = gradeValue;
	}

	public SimpsonsCourse getCourse() {
		return course;
	}

	public SimpsonsCharacter getCharacter() {
		return character;
	}

	public int getGradeValue() {
		return gradeValue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(character, course, gradeValue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpsonsGrade other = (SimpsonsGrade) obj;
		return Objects.equals(character, other.character) && Objects.equals(course, other.course)
				&& gradeValue == other.gradeValue;
	}
	
	

}
