package pl.edu.pjwstk.poj.pojexam;

public class Student extends Person {
	private Instructor instructor;
	private Lecturer lecturer;
	private Materials materials;
	private Task task;
	private Solution solution;
	
	private void generateSolution(){
		this.solution = new Solution(this);
		this.solution.setTask(this.task);
		String answer = "abc";
		
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Lecturer getLecturer() {
		return lecturer;
	}
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	public Solution getSolution() {
		return solution;
	}
	public void setMaterials(Materials materials) {
		this.materials = materials;
	}
	public void setTask(Task task) {
		this.task = task;
		this.generateSolution();
	}
}
