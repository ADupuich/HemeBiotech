package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;


public class SymptomsCount implements ISymp {

	Map<String, Integer> symptomsCount = new TreeMap<>();
	
	@Override	
	public Map<String, Integer>getSymptomsCount(List<String>nameOfSymptoms) {
			if (nameOfSymptoms != null && !nameOfSymptoms.isEmpty()) {
					
				for (String symptom : nameOfSymptoms) {
					symptomsCount.put(symptom, symptomsCount.containsKey(symptom) ? symptomsCount.get(symptom) + 1 : 1);
				}
			}
			return symptomsCount;
	}
	
}
