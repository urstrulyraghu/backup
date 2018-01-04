package com.accolite.soap;

public class Person {
	int age;
	String Name;
	
	public Person(String name, int age) {
		super();
		this.age = age;
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", Name=" + Name + "]";
	}

}
