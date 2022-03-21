package com.json;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JSONWriterGSON {
	public static void main(String[] args) {
		try {
			// Create a new Employee object
			Employee employee = new Employee();
			// Set values to its properties
			employee.setEmployeeName("JavaInterviewPoint");
			employee.setEmployeeId(100);

			List<String> departmentList = new ArrayList<String>();
			departmentList.add("Chemical");
			departmentList.add("Mechanical");
			departmentList.add("Automobile");
			departmentList.add("Computer");

			employee.setDepartment(departmentList);

			// Create a new Gson object
			Gson gson = new Gson();

			// convert the Java object to json
			String jsonString = gson.toJson(employee);
			// Write JSON String to file
			FileWriter fileWriter = new FileWriter(
					"C:\\Users\\Hp\\eclipse-workspace\\AnnotationsAndThirdPartyLibraries\\employee.json");
			fileWriter.write(jsonString);
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
