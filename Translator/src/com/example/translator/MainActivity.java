package com.example.translator;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	private EnglishToSpanish dictionary;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		dictionary = new EnglishToSpanish();
		
	}
		
		
		public List<String> getParsed(String s) {
			List <String> words = new ArrayList<String>(0);
			String phrase = s;
			phrase.toLowerCase();
			String currentWord = "";
			char [] charList = phrase.toCharArray();
			
			for (int i = 0; i < charList.length; i++) {
				if (!String.valueOf(charList[i]).equals(" ")) {
				}
				else {
					words.add(currentWord);
					currentWord = "";
				}
				
			}
			
			if (currentWord.length() > 0); {
				words.add(currentWord);
			
			}
			
			return words;
	}
		public String translate (String s) {
			String result = "";
			
			List <String> words = getParsed(s);
			List <String []> bank = dictionary.getDictionary();
			
			return result;
		}
			
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
