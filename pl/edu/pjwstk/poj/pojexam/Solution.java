package pl.edu.pjwstk.poj.pojexam;

public class Solution {
	private Task task;
	private String studentName;
	private String studentLastname;
	private String instructorInitials;
	private String answer;
	
	public Solution(Student student){
		this.studentName = student.getFirstname();
		this.studentName = student.getLastname();
		this.instructorInitials = student.getInstructor().getInitials();
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentLastname() {
		return studentLastname;
	}

	public String getInstructorInitials() {
		return instructorInitials;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
