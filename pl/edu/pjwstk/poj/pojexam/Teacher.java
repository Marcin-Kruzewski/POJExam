package pl.edu.pjwstk.poj.pojexam;

public class Teacher extends Person{
	protected String Initials;
	
	
	public String getInitials() {
		return Initials;
	}
	public void setInitials() {
		Initials = this.getFirstname().substring(0, 0) + this.getLastname().substring(0, 0);
	}
	
}
