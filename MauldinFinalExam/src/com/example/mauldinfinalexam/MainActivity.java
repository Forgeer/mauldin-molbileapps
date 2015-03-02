package com.example.mauldinfinalexam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText editDollars;
	private EditText editYen;
	private EditText editPounds;
	private Button buttonDollars;
	private Button buttonYen;
	private Button buttonPounds;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editDollars = (EditText)findViewById(editDollars);
		editYen = (EditText)findViewById(editYen);
		editPounds = (EditText)findViewById(editPounds);
		buttonDollars = (Button)findViewById(buttonDollars);
		buttonYen = (Button)findViewById(buttonYen);
		buttonPounds = (Button)findViewById(buttonPounds);
		
	}

	private Button findViewById(Button buttonDollars2) {
		// TODO Auto-generated method stub
		return null;
	}

	private EditText findViewById(EditText editPounds2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void getText(){
		
		
	}
		
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private String getDollars(){
		double dollar = Double.valueOf(editDollars.getText().toString());
		double yen = dollar * (getText(editYen)/1.62);
		double pounds = dollar * (getText(editPounds)/0.0103);
		String dollarString = String.valueOf(yen, pounds);
		return dollarString;
		
		
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
