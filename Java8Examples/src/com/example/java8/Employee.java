package com.example.java8;

public class Employee {

	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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
	}*/


	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = e2;
		
		System.out.println(e1.equals(e1));
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));
		
	}

}
