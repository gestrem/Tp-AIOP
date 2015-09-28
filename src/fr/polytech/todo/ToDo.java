package fr.polytech.todo;

public class ToDo {
	
	public ToDo(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	private long id;
	private String name;
	private String description;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "[" + id + "] " + name + " : "+ description +".";
	}
	
	public static void main(String[] args){
		ToDo td = new ToDo(1,"Acheter le lait","Penser à acheter le lait pour Marianne");
		System.out.println(td.toString()); 
	}
}
