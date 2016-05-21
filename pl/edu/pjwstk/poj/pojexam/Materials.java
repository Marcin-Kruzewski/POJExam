package pl.edu.pjwstk.poj.pojexam;

import java.util.List;

public class Materials {
	private List<String> notes;
	private List<String> books;
	private List<Solution> solutions;

	public void addNote(String note){
		this.notes.add(note);
	}
	
	public void addBook(String book){
		this.books.add(book);
	}
	
	public void addNote(Solution solution){
		this.solutions.add(solution);
	}

	public List<String> getNotes() {
		return notes;
	}

	public List<String> getBooks() {
		return books;
	}

	public List<Solution> getSolutions() {
		return solutions;
	}
	
}
