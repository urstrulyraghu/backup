package com.accolite.miniau;

public class Employee {
	String name;
	int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Raghu", 123);
		Employee e2 = new Employee("Raghu", 123);
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		int a = 0,b = 0;
		System.out.println(a/b);
	}
	
}
