package com.task.mapProgram;

import java.util.Map;

public class EmployeeMain {

	public static void main(String[] args) {

		java.util.HashMap<Integer, Employee> employeeMap = new java.util.HashMap<>();

		employeeMap.put(1, new Employee(1, "Prajit", "Developer"));
		employeeMap.put(2, new Employee(2, "Sandeep", "Designer"));
		employeeMap.put(3, new Employee(3, "raghav", "Manager"));

		System.out.println(" Employee Map: " + employeeMap);

		Employee employee = employeeMap.get(2);
		System.out.println("Employee with ID 2: " + employee);

		employeeMap.remove(2);
		System.out.println("Employee Map after removing ID 2: " + employeeMap);

		for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Employee: " + entry.getValue());
		}
	}
}
