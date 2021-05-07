import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Person;

public class Main {
	

	public static void main(String[] args) {
		
		//Create an arraylist of Person
		List<Person> personList = new ArrayList<>();
		
		//Create new person
		Person bruno = new Person("Bruno", "Brazilian", "To buy a cool house");
		
		//Add new person to array
		personList.add(bruno);
		
		//Iterate over array, printing each one of its elements
		for(Person p:personList ) {
			System.out.println("Name: " + p.name);
			System.out.println("Nationality: " + p.nationality);
			System.out.println("Biggest Dream: " + p.dream);
		}
		
	}

}
