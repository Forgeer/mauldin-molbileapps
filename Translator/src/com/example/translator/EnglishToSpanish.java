package com.example.translator;

import java.util.ArrayList;
import java.util.List;

public class EnglishToSpanish {
	
	private List<String[]> dictionary;
	
	public EnglishToSpanish () {
	
	dictionary = new ArrayList<String []>(0);
	
	addEntry("this","esta");
	addEntry("dog","pero");
	addEntry("is","es");
	addEntry("a","un");
	addEntry("father","padre");
	addEntry("mother","madre");
	addEntry("kitchen","cocina");
	addEntry("in","en");
	addEntry("with","con");
	addEntry("the","el");	
	
	}
	
	public void addEntry(String e, String s) {
		String entry [] = {e,s};
		dictionary.add(entry);
	}
	public List <String []> getDictionary() {
		return dictionary;
	}
	
	
}
