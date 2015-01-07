package com.example.soundsapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	private ImageButton buttonPartyhat;
	private ImageButton buttonMic;
	private ImageButton buttonBeachball;
	private ImageButton buttonBaby;
	private ImageButton buttonCub;
	private ImageButton buttonFox;

	
	private Button buttonStopSounds;
	
	private MediaPlayer soundPlayer [] = new MediaPlayer[6];
	
	private int soundResources []= {R.raw.babycry, R.raw.balloonscratch,
									R.raw.laugh_male4, R.raw.pop, 
									R.raw.trumpet1, R.raw.wolfhowl};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonPartyhat = (ImageButton) findViewById(R.id.buttonPartyhat);
		buttonMic = (ImageButton) findViewById(R.id.buttonMic);
		buttonBeachball = (ImageButton) findViewById(R.id.buttonBeachball);
		buttonBaby = (ImageButton) findViewById(R.id.buttonBaby);
		buttonCub = (ImageButton) findViewById (R.id.buttonCub);
		buttonFox = (ImageButton) findViewById(R.id.buttonFox);
		
		soundPlayer[0] = MediaPlayer.create(this, soundResources[0]);
		soundPlayer[1] = MediaPlayer.create(this, soundResources[1]);
		soundPlayer[2] = MediaPlayer.create(this, soundResources[2]);
		soundPlayer[3] = MediaPlayer.create(this, soundResources[3]);
		soundPlayer[4] = MediaPlayer.create(this, soundResources[4]);
		soundPlayer[5] = MediaPlayer.create(this, soundResources[5]);
		
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

	public void buttonPartyhatClick(View v) {
		soundPlayer[4].start();}
	
	public void buttonMicClick(View v){
		soundPlayer[2].start();}
	
	public void buttonBeachballClick(View v){
		soundPlayer[3].start();}
	
	public void buttonBabyClick(View v){
		soundPlayer[0].start();}
	
	public void buttonFoxClick(View v){
		soundPlayer[5].start();}
	
	public void buttonCubClick(View v){
		soundPlayer[1].start();}
		
	public void stopAllSounds(View v){
		for (int s = 0; s < soundPlayer.length; s++) {
			if (soundPlayer[s].isPlaying()) {
				soundPlayer[s].pause();
				soundPlayer[s].seekTo(0);
			}
		}
	}
	

		}


		

