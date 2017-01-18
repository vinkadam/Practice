package com.example.executor;

import com.example.csv.readerwriter.CSVReader;
import com.example.csv.readerwriter.CSVWriter;

public class CSVExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String fileName = System.getProperty("user.home") + "/students.csv";
		
		System.out.println("write file in CSV:");
		CSVWriter.writeCsvFile(fileName);
		
		System.out.println("Reading data from file:");
		CSVReader.readCsvFile(fileName);
	}

}