package com.example.csv.readerwriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortCSVFile {

	public static void main(String[] args) {
/*
		String[] cmd = {
//				"cmd", "/c", 
				// above should be changed to "sh", "-c" if on Unix system
				"sort " + "C:\\MyWorkspace\\Sample.csv" + " > "
	               + "C:\\MyWorkspace\\Sample.csv" };*/


		String[] cmd = {
				"cmd", "/c", " 'C:\\Program Files (x86)\\GnuWin32\\bin\\sort.exe' -t , -k 1,1 -k 2,2 "+ "C:\\MyWorkspace\\Sample.csv" + " -o"+ " C:\\MyWorkspace\\Sample.csv", 
				// above should be changed to "sh", "-c" if on Unix system 
				};

		try {
			Process sortProcess = Runtime.getRuntime().exec(cmd);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(sortProcess.getErrorStream()));
			System.out.println(bufferedReader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


