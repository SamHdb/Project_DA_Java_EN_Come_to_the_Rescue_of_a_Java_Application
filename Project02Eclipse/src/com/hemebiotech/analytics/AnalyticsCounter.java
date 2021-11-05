package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args){

		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = readSymptoms.getSymptoms();

		SymptomsProcess symptomsList = new SymptomsProcess();
		TreeMap<String, Integer> symptomsCount = symptomsList.count(symptoms);
		symptomsList.writeResult(symptomsCount);
	}
}