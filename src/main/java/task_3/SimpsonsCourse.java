package task_3;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpsonsCourse {

	private final String courseName;
	private static AtomicInteger counter = new AtomicInteger(0);
	private final int courseId;

	public SimpsonsCourse(String courseName) {
		if (courseName == null || courseName.isBlank()) {
			throw new IllegalArgumentException("Please provide correct courseName");
		}

		this.courseName = courseName;
		this.courseId = nextId();
	}

	private static int nextId() {
		return counter.incrementAndGet();
	}

	public String getCourseName() {
		return courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseId, courseName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SimpsonsCourse other = (SimpsonsCourse) obj;
		return courseId == other.courseId && Objects.equals(courseName, other.courseName);
	}

	@Override
	public String toString() {
		return "courseId: " + courseId;
	}
	
	

}
