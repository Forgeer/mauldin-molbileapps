package com.example.texttospeech;

import java.util.Locale;

import android.app.Activity;
import android.app.Service;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity implements TextToSpeech.OnInitListener {
	
	private Button speak;
	private EditText enterText;
	
	private String phrase;
	
	private TextToSpeech speaker;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_to_speech);
		
		speak = (Button) findViewById(R.id.speechButton);
		enterText = (EditText) findViewById(R.id.enterText);
		
		speaker = new TextToSpeech(this, this);
	}

	public void speak(View v) {
		
		InputMethodManager imm = (InputMethodManager) this.getSystemService(Service.INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(v.getApplicationWindowToken(), 0);
		
		Editable input = enterText.getText();
		
		phrase = input.toString();
		
		speaker.speak(phrase, 1, null);	
		
	}
		public void handleClick(View v) {
			switch (v.getId()) {
				case R.id.buttonEnglish:
					speaker.setLanguage(Locale.ENGLISH);
					break;
				case R.id.buttonFrench:
					speaker.setLanguage(Locale.FRENCH);
					break;
				case R.id.buttonCanada:
					speaker.setLanguage(Locale.CANADA);
					break;
				case R.id.buttonGerman:
					speaker.setLanguage(Locale.GERMAN);
					break;
					
					
				
			}
		}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.text_to_speech, menu);
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

	@Override
	public void onInit(int status) {
		// TODO Auto-generated method stub
	}
	
	public void onDestroy() {
		if (speaker !=null) {
			speaker.stop();
			speaker.shutdown();
		}
		super.onDestroy();
		
	}		
	
		
}
