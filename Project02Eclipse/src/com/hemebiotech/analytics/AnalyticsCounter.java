package com.hemebiotech.analytics;

import java.io.*;
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


		/*
			on créé une liste avec tous les effets secondaires
		*/

		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("C:\\Users\\hdb20\\Documents\\Workspace\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
		List<String> symptoms = readSymptoms.GetSymptoms();

		/*
			on compte les occurences par symptom et on trie par ordre alphabétique grâce à une TreeMap
		 */

		TreeMap<String, Integer> symptomsCountMap = new TreeMap<>();

		for (String symptom:symptoms
			 ) {
			if (symptomsCountMap.containsKey(symptom))
				symptomsCountMap.put(symptom,symptomsCountMap.get(symptom)+1);
			else
				symptomsCountMap.put(symptom,1);
		}

		/*
			affiche le contenu de la map dans la console
		 */
		System.out.println(symptomsCountMap);
		
		// next generate output
		/*Try (FileWriter writer = new FileWriter("C:/Users/hdb20/Documents/Workspace/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/result.out", true);
			BufferedWriter bw = new BufferedWriter(writer)) {

			bw.write(String.valueOf(symptomsCountMap));

		}
		catch (IOException) {
			System.err.format("erreur");
		}*/


	};

	// try catch pour les exceptions + sortir les résultats en colonne + BufferedWriter pour écrire dans le fichier