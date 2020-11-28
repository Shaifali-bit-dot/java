package com.capgemini.casestudy;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
public class EmployeeRepository {

	private static List<Employee> employeeList;

	static {
		prepareEmployeeList();
	}

	private static void prepareEmployeeList() {
		employeeList = new ArrayList<>();
		Departmant d1 = new Departmant(1, "ComputerScience", 1);
		employeeList.add(
				new Employee("shaifali", "verma", "ccc", "744258", LocalDate.of(12, 01, 03), "HOD", 20000, 01, d1));
		Departmant d2 = new Departmant(2, "Entc", 2);
		employeeList.add(
				new Employee("praveen", "Mehra", "ddd", "12345", LocalDate.of(20, 03, 04), "Manager", 22000, 02, d2));
		Departmant d3 = new Departmant(3, "", 3);
		employeeList.add(
				new Employee("harshad", "mehta", "pqr", "65453", LocalDate.of(2020, 02, 07), "Peun", 4000, 03, d3));
		

	}
	
	public static List<Employee> getEmployeeList() {
		return employeeList;
	}
}
