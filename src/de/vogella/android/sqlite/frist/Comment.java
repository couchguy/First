package de.vogella.android.sqlite.frist;

public class Comment {
	private long id;
	private String comment;
	
	public long getID() {
		return id;
	}
	
	public void setID(long id) {
		this.id = id;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	//will be used by the ArrayAdapter in the ListView
	@Override
	public String toString() {
		return comment;
	}
	
}
