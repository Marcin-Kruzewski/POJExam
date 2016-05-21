package pl.edu.pjwstk.poj.pojexam;

import java.util.List;

public class Task {
	private Question question;
	private List<Hint> hints;
	
	public Task(Question question){
		this.question = question;
	}
	
	public Question getQuestion(){
		return this.question;
	}
	
	public void addHint(Hint hint){
		this.hints.add(hint);
	}
}
