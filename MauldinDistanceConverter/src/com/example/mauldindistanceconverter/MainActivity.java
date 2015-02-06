package com.example.mauldindistanceconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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
	
	public void resetClicked (View v){
		EditText text1 = (EditText)findViewById(R.id.editDistance);
		text1.setText("0");
	}
	
	public void handleClick(View v) {
		boolean checked = ((RadioButton) v).isChecked();
		EditText text1 = (EditText)findViewById(R.id.editDistance);
		double distance = Double.parseDouble(String.valueOf(text1.getText()));
		
		switch(v.getId()){
		case R.id.radioMiles:
			if (checked) {
				text1.setText(milesToKm(distance));
			}
			break;
		case R.id.radioKilometers:
			if (checked) {
				text1.setText(milesToKm(distance));
			}
			break;
			}
	}
	public String kmToMiles(double km) {
		double miles = km/1.609;
		return String.valueOf(miles);
	}
	public String milesToKm(double miles) {
		double km = miles * 1.609;
		return String.valueOf(km);
	}
	
	
}
	



