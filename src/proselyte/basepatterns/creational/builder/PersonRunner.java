package proselyte.basepatterns.creational.builder;

public class PersonRunner {
public static void main(String[] args) {
	Person person = new Person.Builder()
			                .withName("Ryskeldi")
			                .withSurname("Osmonaliev")
			                .withAge(26)
			                .builds();
	System.out.println(person);
}
}
