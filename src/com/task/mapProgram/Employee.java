package com.task.mapProgram;

import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private String position;

	public Employee(int id, String name, String position) {
		this.id = id;
		this.name = name;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, position);
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
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(position, other.position);
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", position='" + position + '\'' + '}';
	}
}