package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args){
		// first get input

		/* on lit le fichier qui liste les effets secondaires recensés */

		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("C:\\Users\\hdb20\\Documents\\Workspace\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
		List<String> symptoms = readSymptoms.getSymptoms();

		SymptomsProcess symptomsList = new SymptomsProcess();
		TreeMap<String, Integer> symptomsCount = symptomsList.count(symptoms);
		symptomsList.writeResult(symptomsCount);
	}
}