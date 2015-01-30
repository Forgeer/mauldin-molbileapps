package com.example.mauldinbouncing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;

public class Actor {
	private Point p;
	private int c;
	private int s;
	private int dx;
	private int dy;
	private Paint paint;
	
	private Context aContext;
	private int costume;
	private BitmapDrawable graphic;
	
	public Actor(Context context, int x, int y, int col, int size){
		p = new Point(x,y);
		c = col;
		s = size;
		paint = new Paint();
		paint.setColor(c);
		dx = 0;
		dy = 0;
		
		
		aContext = context;
		
		
	}
	
	//Getters and Setters
	public int getX() {
		return p.x;
	
	}
	
	public int getY(){
		return p.y; 
	
	}

	public int getSize() {
		return s;
	}
	
	//Modifiers
	public void setColor(int col){
		c = col;
		paint.setColor(c);
	}
	
	public void goTo(int x, int y){
		p.x = x;
		p.y = y;
	}
	
	public void setDX(int speed) {
		dx = speed;
		
	}
	public void setDY(int speed){
		dy = speed;
		
	}
	
	public void changeDX(float a) {
		dx += a;
	}
	public void changeDY(float a) {
		dy += a;
	}
	public void move() {
		p.x += dx;
		p.y += dy;
		
	}
	
	public void bounce(Canvas c) {
		if (p.x > c.getWidth() || p.x < 0) {
			dx = dx * -1;
		
		}
		if (p.y > c.getHeight() || p.y < 0 ) {
			dy = dy * -1;
		}
		
	}
	
	public void bounceActor(Actor a) {
		
	}
	
	public void drawCircle(Canvas c){
		c.drawCircle(p.x, p.y, s, paint);
	}
	
	public void drawSquare(Canvas c) {
		c.drawRect(p.x, p.y, p.x+s, p.y+s, paint);
	}
	
	public void setCostume(int cost) {
		costume = cost;
		graphic = (BitmapDrawable)aContext.getResources().getDrawable(costume);
		
	}
	
	public Bitmap getBitmap() {
		return graphic.getBitmap ();
		
	}
	
	public void draw (Canvas c) {
		c.drawBitmap (getBitmap(), p.x, p.y, paint);
	}
	
	public void passThrough(Canvas c){
		if(p.y > c.getHeight ());
	}
	
	
	
}
