package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class SymptomsProcess {

    /* on compte les occurences par symptom et on trie par ordre alphabétique grâce à une TreeMap */
    public TreeMap<String, Integer> count(List<String> symptoms) {

        TreeMap<String, Integer> symptomsCountMap = new TreeMap<>();

        for (String symptom : symptoms) {
            if (symptomsCountMap.containsKey(symptom))
                symptomsCountMap.put(symptom, symptomsCountMap.get(symptom) + 1);
            else
                symptomsCountMap.put(symptom, 1);
        }
        return symptomsCountMap;
    }

    // next generate output
    public void WriteResult(TreeMap<String, Integer> symptomsCountAndSorted) {

        try (
                FileWriter writer = new FileWriter("C:/Users/hdb20/Documents/Workspace/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/result.out", true);
                BufferedWriter bw = new BufferedWriter(writer)) {
                bw.write(String.valueOf(symptomsCountAndSorted));
                bw.newLine();
        } catch (
                IOException oe) {
                System.err.format("erreur");
        }
    }
}