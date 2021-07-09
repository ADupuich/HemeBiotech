package com.hemebiotech.analytics;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;


public class WriteSymptoms implements ISymptomsWriter{
	@Override
	public void writeSymptomsInFile(Map<String, Integer> symptomsCount) {
		try {
			
				FileWriter writer = new FileWriter ("result.txt");
				String symptom;
				Integer valeur;
				Iterator<String>iterator = symptomsCount.keySet().iterator();
				String newligne=System.getProperty("line.separator");
				while (iterator.hasNext()) {
					symptom = iterator.next();
					valeur = symptomsCount.get(symptom);
					writer.write(symptom +" : " + valeur + newligne);
				
					}
	writer.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
}
