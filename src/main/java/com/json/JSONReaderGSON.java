package com.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class JSONReaderGSON {
	public static void main(String[] args) {
		try {
			// Create a new Gson object
			Gson gson = new Gson();

			// Read the employee.json file
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\Hp\\eclipse-workspace\\AnnotationsAndThirdPartyLibraries\\employee.json"));

			// convert the json to Java object (Employee)
			Employee employee = gson.fromJson(br, Employee.class);

			// Printing the Employee Details
			System.out.println("****Employee Details****");
			System.out.println("Employee Name    : " + employee.getEmployeeName());
			System.out.println("Employee ID      : " + employee.getEmployeeId());
			System.out.print("Employee Department: ");
			for (String department : employee.getDepartment()) {
				System.out.print(department + " | ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
