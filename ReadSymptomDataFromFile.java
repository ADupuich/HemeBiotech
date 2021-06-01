package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
//C'est une classe fille de la classe mère IsymptomReaderd donc recuperer comportements et méthode de la classe mère
public class ReadSymptomDataFromFile implements ISymptomReader {

	//définit une variable qui s'appelle filepath
	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	// Nous avons une méthode qui reçoit une chaine de caractere appelé filepath
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	//Je comprends ça comme si nous alions instencier la liste GetSymptoms
	@Override
	public List<String> GetSymptoms() {
		//définition d'une List (tableau de données non ordonnées) nommé "result"
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
