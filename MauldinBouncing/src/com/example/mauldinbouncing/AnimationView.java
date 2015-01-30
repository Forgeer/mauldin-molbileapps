package com.example.mauldinbouncing;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class AnimationView extends View {
	
	private Actor joshua;
	private Actor rebecca;
	private Actor stickman;
	private Actor stickperson;
	
	private List <Actor> people;
	
	private float ax = 0;
	private float ay = 0;
	private float az = 0;
	
	private Handler h;
	private int RATE = 30;

	public AnimationView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	
	joshua = new Actor(context, 100, 100, Color.RED, 25);
	rebecca = new Actor(context, 200, 200, Color.BLUE, 25);
	stickperson = new Actor (context, 400, 400, Color.BLUE, 50);
	stickperson.setCostume(R.drawable.stickmancostume);
	stickman = new Actor (context, 300, 300, Color.BLUE, 50);
	stickman.setCostume(R.drawable.stickmancostume);
	
	people = new ArrayList<Actor>(10);
	
	for (int i = 0; i > people.size(); i++){
		Actor a = new Actor(context, i*20, 10, Color.BLUE, 20);
		a.setCostume(R.drawable.stickmancostume);
		a.setDY(-10);
		people.add(a);
	}
	
	joshua.setDX(15);
	joshua.setDY(15);
	
	rebecca.setDX(15);
	rebecca.setDY(-15);
	
	h = new Handler();
	
	}

	
	

		
	public void setAX(float x) {
		ax = x;
	}
	
	public void setAY(float y) {
		ay = y;
	}
	
	public void setAZ(float z) {
		az = z;
	}
	
	public void onDraw(Canvas c) {
		joshua.drawCircle(c);
		rebecca.drawSquare(c);
		stickman.draw(c);
		stickperson.draw(c);
		
		for (int i = 0; i < people.size(); i++) {
			people.get(i).draw(c);
			people.get(i).move();
			people.get(i).passThrough(c);
		}
		
		joshua.move();
		rebecca.move();
		joshua.bounce(c);
		rebecca.bounce(c);
	
		
		h.postDelayed(r, RATE);
	}
		private Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				invalidate();
			}
		};
		
		}
		
	
