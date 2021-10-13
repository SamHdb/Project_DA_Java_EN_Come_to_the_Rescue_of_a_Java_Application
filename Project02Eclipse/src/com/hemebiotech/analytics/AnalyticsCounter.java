package com.hemebiotech.analytics;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {
		// first get input

		/*
			on lit le fichier qui liste les effets secondaires recensés
		*/
		try{
		BufferedReader reader = new BufferedReader (new FileReader("C:\\Users\\hdb20\\Documents\\Workspace\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt"));
		String line = reader.readLine();
		}
		catch (FileNotFoundException fe){
			System.out.println("File not found");
		}

		/*
			on créé une liste avec tous les effets secondaires
		*/

		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("C:\\Users\\hdb20\\Documents\\Workspace\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
		List<String> symptoms = readSymptoms.GetSymptoms();

		/*
			on compte les occurences par symptome grâce à une HashMap
		 */

		Map<String, Integer> symptomsCountMap = new HashMap<>();

		for (String symptom:symptoms
			 ) {
			if (symptomsCountMap.containsKey(symptom))
				symptomsCountMap.put(symptom,symptomsCountMap.get(symptom)+1);
			else
				symptomsCountMap.put(symptom,1);
		}

		/*
			on trie les données par ordre alphabétique grâce à TreeMap
		 */

		TreeMap<String, Integer> sortedMap = new TreeMap<>(symptomsCountMap);

		System.out.println(sortedMap);
		
		// next generate output
		File outFile = new File("C:/Users/hdb20/Documents/Workspace/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/result.out");
		BufferedWriter bf;
		}

	}

	// try catch pour les exceptions + sortir les résultats en colonne + BufferedWriter pour écrire dans le fichier

