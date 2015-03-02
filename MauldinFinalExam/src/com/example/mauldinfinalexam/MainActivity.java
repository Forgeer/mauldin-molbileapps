package com.example.mauldinfinalexam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
	
 
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void handleClick(View v){
		EditText text1 = (EditText)findViewById(R.id.editDollars);
		double valueDollars = Double.parseDouble(String.valueOf(editDollars.getText()));
		EditText text2 = (EditText)findViewById(R.id.editYen);
		double valueYen = Double.parseDouble(String.valueOf(editYen.getText()));
		EditText text3 = (EditText)findViewById(R.id.editPounds);
		double valuePounds = Double.parseDouble(String.valueOf(editYen.getText()));
		
		
		
	}
		
////	public String dollarsToYen(double yen){
////		double editYen = valueDollars * 97;
////		return String.valueOf(editYen);
//		
//	}
//	
////	public String dollarsToPounds(double pounds){
////		double editPounds = valueDollars * 0.62;
////		return String.valueOf(editPounds);
//		
//	}
		
		
		
	

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
