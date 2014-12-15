import java.util.ArrayList;
import java.util.List;


public class EnglishToFrench {
	// Field for List to String Arrays
	private List<String []> dictionary;
	
public EnglishToFrench() {
	dictionary = new ArrayList<String []> (0);
	
	// Add words to the dictionary
	addEntry("that", "que");
	addEntry("plane", "plan");
	addEntry("tall", "grand");
	addEntry("my", "ma");
	addEntry("short", "court");
	addEntry("banana", "banane");
}
	
	// Adds words to the dictionary list
	public void addEntry (String e, String s) {
		String entry [] = {e, s};
		dictionary.add (entry);
	}
	// translate function
	public String translate(String s) {
			String result = ""; //Blank word
			
			// Search for Translation
			for (int w = 0; w < dictionary.size(); w++) {
				if (s.equals(dictionary.get(w)[0])) {
					result = dictionary.get(w)[1]; // get match
				}
			}
			if (result.equals ("")) {
				result = s; // set to incoming word
			}
			return result; //Give back to the program
			
	} //end translate
}