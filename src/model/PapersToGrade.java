package model;

public class PapersToGrade {
	private String name;
	private int assignmentsTurnedIn;
	
	public PapersToGrade(String name, int assignmentsTurnedIn){
		this.name = name;
		this.assignmentsTurnedIn = assignmentsTurnedIn;
	}

	public String getName() {
		return name;
	}

	public int getAssignmentsTurnedIn() {
		return assignmentsTurnedIn;
	}
}
