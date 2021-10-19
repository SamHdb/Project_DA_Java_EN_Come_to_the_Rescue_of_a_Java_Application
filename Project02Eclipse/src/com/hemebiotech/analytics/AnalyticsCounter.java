package com.hemebiotech.analytics;

import java.io.*;
import java.util.List;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		// first get input

		/* on lit le fichier qui liste les effets secondaires recensés */

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hdb20\\Documents\\Workspace\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
		String line = reader.readLine();

		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("C:\\Users\\hdb20\\Documents\\Workspace\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
		List<String> symptoms = readSymptoms.GetSymptoms();

		SymptomsProcess symptomsProcess = new SymptomsProcess(symptoms);

	}
}