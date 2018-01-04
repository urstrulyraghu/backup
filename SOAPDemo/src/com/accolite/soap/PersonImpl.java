package com.accolite.soap;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface="com.accolite.soap.PersonInt")
public class PersonImpl implements PersonInt {

	ArrayList<Person> persons = new ArrayList<>();

	@Override
	public void createPerson(String Name, int age) {
		// TODO Auto-generated method stub
		Person p = new Person(Name,age);
		persons.add(p);
	}

	@Override
	public void deletePerson(String Name) {
		// TODO Auto-generated method stub
		int index = 0;
		for(Person p : persons) {
			if(p.getName().equals(Name)) {
				index = persons.indexOf(p);
				break;
			}
		}
		persons.remove(index);
	}

	@Override
	public void updatePerson(String Name, int age) {
		// TODO Auto-generated method stub
		for(Person p : persons) {
			if(p.getName().equals(Name)) {
				p.setAge(age);
				break;
			}
		}
	}

	@Override
	public String getPerson(String Name) {
		// TODO Auto-generated method stub
		int index = 0;
		for(Person p : persons) {
			if(p.getName().equals(Name)) {
				return "This is " + p.getName() + " and age is " + p.getAge();
			}
		}
		return "Person doesn't exist";
	}

	@Override
	public Person[] getPersons() {
		// TODO Auto-generated method stub
		Person[] people = new Person[persons.size()];
		for(int i = 0; i < persons.size(); i++) {
			people[i] = persons.get(i);
		}
		return people;
	}

}
