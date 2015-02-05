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
	private int w;
	private int h;
	
	private boolean isVisable = true;
	
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
		
		w = s;
		h = s;
		
		
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
		w = getBitmap().getWidth();
		h = getBitmap().getHeight();
	}
	
	public Bitmap getBitmap() {
		return graphic.getBitmap ();
		
	}
	
	public int getHeight() {
		return h;
	}
	
	public int getWidth() {
		return w;
	}
	
	public void draw (Canvas c) {
		c.drawBitmap (getBitmap(), p.x, p.y, paint);
	}
	
	public boolean getVisable() {
		return isVisable;
	}
	public void setVisable(boolean v){
		isVisable = v;
	}
	
	public void passThrough(Canvas c){
		if(p.y > c.getHeight ());
	}
	
	public boolean isTouching(Actor a) {
		boolean result = false;
		
		if ((p.x+w > a.getX() && p.x < a.getX()+a.getWidth() 
				&& (p.y+h > a.getY() && p.y+h < a.getY() + a.getHeight()))){
			result = true;
		}
		
		
		return result;
	}
	public void bounceOff() {
		dx = dx * -1;
		dy = dy * -1;
	}
	public void bounceUp() {
		dy = dy *-1;
	}
	public void setHeight(int height) {
		h = height;
	}
	public void setWidth(int width) {
		w = width;
	}
	public void drawRect (Canvas c){
		if(isVisable) {
		c.drawRect(p.x, p.y, p.x+w, p.y+h, paint);
		}
	
	}
	
	
	
	
}
