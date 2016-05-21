package pl.edu.pjwstk.poj.pojexam;

import java.util.List;

public class Instructor extends Teacher {
	private Lecturer lecturer;
	private List<Student> students;
	
	public void addStudent(Student student){
		this.students.add(student);
	}
	
	public Lecturer getLecturer() {
		return lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
}
