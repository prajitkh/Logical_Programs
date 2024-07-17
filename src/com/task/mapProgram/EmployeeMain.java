package com.task.mapProgram;

import java.util.Map;

public class EmployeeMain {

	public static void main(String[] args) {

		java.util.HashMap<Employee, Integer> employeeMap = new java.util.HashMap<>();

		employeeMap.put(new Employee(1, "Prajit", "Developer"), 1);
		employeeMap.put(new Employee(1, "Prajit", "Developer"), 1);
		employeeMap.put(new Employee(2, "Prajit", "Developer"), 1);

		System.out.println(" Employee Map: " + employeeMap);

		// Employee employee = employeeMap.get(2);
		// System.out.println("Employee with ID 2: " + employee);

		employeeMap.remove(2);
		System.out.println("Employee Map after removing ID 2: " + employeeMap);

		for (Map.Entry<Employee, Integer> entry : employeeMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Employee: " + entry.getValue());
		}
	}
}
