package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomsWriter { 
	
	void writeSymptomsInFile(Map<String, Integer> symptomsCount);

}
