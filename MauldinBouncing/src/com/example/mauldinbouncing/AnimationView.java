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
	
	private Actor ball;
	private Actor paddle;
	
	private List <Actor> bricks;
	
	private float ax = 0;
	private float ay = 0;
	private float az = 0;
	
	private Handler h;
	private int RATE = 30;

	public AnimationView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	ball = new Actor(context, 100, 100, Color.BLUE, 25);
	paddle = new Actor (context, 300, 300, Color.RED, 40);
//	joshua = new Actor(context, 100, 100, Color.RED, 25);
//	rebecca = new Actor(context, 200, 200, Color.BLUE, 25);
//	stickperson = new Actor (context, 400, 400, Color.BLUE, 50);
//	stickperson.setCostume(R.drawable.stickmancostume);
//	stickman = new Actor (context, 300, 300, Color.BLUE, 50);
//	stickman.setCostume(R.drawable.stickmancostume);
	
	bricks = new ArrayList<Actor>(0);
	
	for (int i = 0; i > bricks.size(); i++){
		bricks.add(new Actor(context, i*80, 100, Color.GREEN, 40));
	}
//	Actor a = new Actor(context, i*20, 10, Color.BLUE, 20);

	
	for (int i = 0; i < 6; i++) {
	
	paddle.setWidth(150);
	paddle.setHeight(40);
	
	ball.setDX(10);
	ball.setDY(10);
	
	joshua.setDX(15);
	joshua.setDY(15);
	
	rebecca.setDX(15);
	rebecca.setDY(-15);
	
	h = new Handler();
	}
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
//		joshua.drawCircle(c);
//		rebecca.drawSquare(c);
//		stickman.draw(c);
//		stickperson.draw(c);
		paddle.drawRect(c);
		ball.drawCircle(c);
		if (ball.isTouching(paddle)){
			ball.bounceUp();
		}
		for  (int i = 0; i < bricks.size(); i++){
			bricks.get(i).setWidth((c.getWidth()/6)-3);
			int xPos = i * (c.getWidth()/6);
			bricks.get(i).goTo(xPos, 100);
			bricks.get(i).drawRect(c);
			
			if(ball.isTouching(bricks.get(i))){
				if(bricks.get(i).getVisable() == true) {
					ball.bounceUp();
					bricks.get(i).setVisable(false);
				}
			}
		}
		
		for (int i = 0; i < bricks.size(); i++) {
			bricks.get(i).setWidth(75);
		}
		
		ball.move();
		ball.bounce(c);
//		joshua.move();
//		rebecca.move();
//		joshua.bounce(c);
//		rebecca.bounce(c);
		
		if (joshua.isTouching(rebecca)){
			joshua.bounceOff();
			
		}
		
		
		stickperson.changeDX(ax * -1);
		stickperson.changeDY(ay);
		stickperson.move();
		stickperson.bounce(c);
	
		
		h.postDelayed(r, RATE);
	}
		private Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				invalidate();
			}
		public boolean onTouchEvent(MotionEvent event) {
			
			int action = event.getActionMasked();
			int actionIdex = event.getActionIndex();
			
			stickman.goTo((int)event.getX(), (int)event.getY());
			paddle.goTo((int) event.getX(), 750);
			
			return true;
		}
			
			
		};
		
		}
		
	
