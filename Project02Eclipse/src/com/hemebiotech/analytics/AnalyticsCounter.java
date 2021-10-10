package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		// first get input
		BufferedReader reader = new BufferedReader (new FileReader("C:\\Users\\hdb20\\Documents\\Workspace\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
		String line = reader.readLine();

		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("C:\\Users\\hdb20\\Documents\\Workspace\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
		List<String> symptoms = readSymptoms.GetSymptoms();

		Map<String, Integer> symptomsCountMap = new HashMap<>();

		for (String symptom:symptoms
			 ) {
			if (symptomsCountMap.containsKey(symptom))
				symptomsCountMap.put(symptom,symptomsCountMap.get(symptom)+1);
			else
				symptomsCountMap.put(symptom,1);
		}

		TreeMap<String, Integer> sortedMap = new TreeMap<>(symptomsCountMap);

		System.out.println(sortedMap);
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
	}
}
