package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	
	public static void main(String args[]) throws Exception {
		// first get input = méthode Main, mon prg commence ici
		
		
	ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile ("/home/amaury/git/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
	List<String>nameOfSymptoms = readSymptoms.GetSymptoms();
	SymptomsCount symptomsCount = new SymptomsCount();
	Map<String, Integer> symptomsCounter = symptomsCount.getSymptomsCount(nameOfSymptoms);
	WriteSymptoms writeSymptoms = new WriteSymptoms();
	writeSymptoms.writeSymptomsInFile(symptomsCounter);
	
	
	}
}
