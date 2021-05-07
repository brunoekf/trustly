package model;

/**
 * Classe {@link Person} Which represents a person to be described
 * @author Bruno Ferrari
 */

public class Person {
	public String name;
	public String nationality;
	public String dream;
	
	public Person(String name, String nationality, String dream) {
		this.name=name;
		this.nationality=nationality;
		this.dream=dream;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDream() {
		return dream;
	}
	public void setDream(String dream) {
		this.dream = dream;
	}

}
