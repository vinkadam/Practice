/*package com.example.csv.readerwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Student;

public class CSVWriter {

	//Delimiter used for file 
	private static final String LINE_SEPERATOR = "\n";

	//File header
	private final static Object[] FILE_HEADER = {"id", "fName", "lName", "Gender", "Age"};

	public static void writeCsvFile(String fileName) {

		//Creating students with default information
		Student s1 = new Student(1, "fA", "lA", "M", 20);
		Student s2 = new Student(2, "fB", "lB", "F", 30);
		Student s3 = new Student(3, "fC", "lC", "M", 40);
		Student s4 = new Student(4, "fD", "lD", "F", 50);
		Student s5 = new Student(5, "fE", "lE", "M", 60);

		//List of students to insert into file
		List<Student> students = new ArrayList<Student>();
		students.add(s1); students.add(s2); students.add(s3); students.add(s4); students.add(s5);

		FileWriter fileWriter = null;
		CSVPrinter csvPrinter = null;

		//Create CSVformat with delimiter
		CSVFormat csvFormat = CSVFormat.DEFAULT.withRecordSeparator(LINE_SEPERATOR);

		try {

			fileWriter = new FileWriter(fileName);
			csvPrinter = new CSVPrinter(fileWriter, csvFormat);

			//Create CSV file header
			csvPrinter.printRecord(FILE_HEADER);

			//Write students in CSV file
			for (Student student : students) {
				List<String> studentDataRecord = new ArrayList<String>();
				studentDataRecord.add(String.valueOf(student.getId()));
				studentDataRecord.add(student.getfName());
				studentDataRecord.add(student.getlName());
				studentDataRecord.add(student.getGender());
				studentDataRecord.add(String.valueOf(student.getAge()));
				csvPrinter.printRecord(studentDataRecord);
			}
			System.out.println("CSV file was created successfully !!!");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
				csvPrinter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
*/