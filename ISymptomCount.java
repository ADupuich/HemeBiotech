package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomCount {
	
	Map<String,Integer>getSymptomsCount(List<String>nameOfSymptoms);

}
