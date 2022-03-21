package com.open.csv;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class OpenCSVReadEx {

	private static final String PATH = "C:\\Users\\Hp\\eclipse-workspace\\AnnotationsAndThirdPartyLibraries\\src\\main\\resources\\number.csv";

	public static void main(String[] args) throws IOException {

		CSVReader csvReader = new CSVReader(new FileReader(PATH), ',');
		List<Employee> emplyees = new ArrayList<>();

		String[] record = null;

		while ((record = csvReader.readNext()) != null) {
			Employee emp = new Employee();
			emp.setId(record[0]);
			emp.setName(record[1]);
			emp.setAge(record[2]);
			emp.setCountry(record[3]);
			emplyees.add(emp);
		}
		System.out.println(emplyees);
		csvReader.close();
	}
}
