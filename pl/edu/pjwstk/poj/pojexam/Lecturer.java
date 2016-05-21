package pl.edu.pjwstk.poj.pojexam;

import java.util.List;

public class Lecturer extends Teacher {
	private List<Student> students;
	private List<Instructor> instructors;
	private Task task;
	
	public void addStudent(Student student){
		this.students.add(student);
	}
	
	public void addInstructor(Instructor instructor){
		this.instructors.add(instructor);
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public void runExam(){
		//TODO: run Exam
	}
}
