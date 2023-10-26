package task_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpsonsCharacter {

	private static AtomicInteger counter = new AtomicInteger(0);
	private final String name;
	private int age;
	private final int characterId;
	private final Set<SimpsonsCourse> enrolledCourses;
	private final List<SimpsonsGrade> grades;

	public SimpsonsCharacter(String name, int age) {

		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Please provide correct name");
		}

		if (age < 1) {
			throw new IllegalArgumentException("Age must be above 0");
		}

		this.name = name;
		this.age = age;
		this.characterId = nextId();
		this.enrolledCourses = new HashSet<>();
		this.grades = new ArrayList<>();

	}

	private static int nextId() {
		return counter.incrementAndGet();
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

	public Set<SimpsonsCourse> getEnrolledCourses() {
		return enrolledCourses;
	}

	public List<SimpsonsGrade> getGrades() {
		return grades;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, characterId, enrolledCourses, grades, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpsonsCharacter other = (SimpsonsCharacter) obj;
		return age == other.age && characterId == other.characterId
				&& Objects.equals(enrolledCourses, other.enrolledCourses) && Objects.equals(grades, other.grades)
				&& Objects.equals(name, other.name);
	}

	
}
