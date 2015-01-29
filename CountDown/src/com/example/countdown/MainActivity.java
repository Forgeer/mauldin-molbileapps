package com.example.countdown;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	//Fields
	private TextView textTimer;
	private Button resetButton;
	private Button pauseButton;
	private Button startButton;
	boolean isRunning = true;
	
	//For the handler / runnable
	private int elaspedTime; //hold the time that has passed
	private Handler h; //the handler
	private int RATE = 1000; //Milliseconds - how fast

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textTimer = (TextView)findViewById(R.id.textTimer);
		resetButton = (Button)findViewById(R.id.resetButton);
		pauseButton = (Button)findViewById(R.id.pauseButton);
		startButton = (Button)findViewById(R.id.startButton);
	
		elaspedTime = 0;
		
		h = new Handler();
		count();
		
	}
	
	public void pauseClicked(View v){
		isRunning = false;

	}
	
	public void startClicked(View v){
		isRunning = true;
	}
	public void resetClicked(View v){
		elaspedTime = 60;
		textTimer.setText(String.valueOf(elaspedTime));
		
	
	
}
	
	public void reset(View v) {
		elaspedTime = 60;
		
	}
	public void count() {
		elaspedTime--;
		textTimer.setText(String.valueOf(elaspedTime));
		h.postDelayed(r, RATE);
		
		if (elaspedTime < 1){
			isRunning = false;
		}
		
		if (elaspedTime > 1){
			isRunning = true;
		}
		
		if (isRunning == true){
			h.postDelayed(r, RATE);
		}
		
	}
	
	private Runnable r = new Runnable() {
		
			public void run() {
				count();
			}
	};
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		
}
	
	
		


			
	
	


