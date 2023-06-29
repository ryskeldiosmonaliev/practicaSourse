package proselyte.basepatterns.creational.builder;

import java.util.Set;

public class Person {
private String name;
private String surname;
private int age;
private Set<Person> parent;

@Override
public String toString() {
	return "Person{" +
			       "name='" + name + '\'' +
			       ", surname='" + surname + '\'' +
			       ", age=" + age +
			       ", parent=" + parent +
			       '}';
}

public static class Builder {
	private Person newPerson;
	
	public Builder() {
		newPerson = new Person();
	}
	public Builder withName(String name){
		newPerson.name=name;
		return this;}
	public Builder withSurname(String surname){
		newPerson.surname=surname;
		return this;
	}
	public Builder withAge(int age){
		newPerson.age= age;
		return this;
	}
	public Builder withParent(Set<Person> parent){
		newPerson.parent=parent;
		return this;
	}
	public Person builds(){
		return  newPerson;
	}
}
}
