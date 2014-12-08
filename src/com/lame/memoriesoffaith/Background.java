package com.lame.memoriesoffaith;


public class Background {
	
	private int bgX, bgY, speedX, speedY;
	
	public Background(int x, int y){
		bgX = x;
		bgY = y;
		speedX = 0;
		speedY = 5;
	}
	
	public void update() {
		bgX += speedX;
		
		bgY += speedY;

		if (bgX <= -2160){
			bgX += 4320;
		}

		if (bgY >= 1150){
			bgY = -130;
		}
	}

	public int getBgX() {
		return bgX;
	}

	public int getBgY() {
		return bgY;
	}

	public int getSpeedX() {
		return speedX;
	}
	
	public int getSpeedY() {
		return speedY;
	}

	public void setBgX(int bgX) {
		this.bgX = bgX;
	}

	public void setBgY(int bgY) {
		this.bgY = bgY;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}
	
	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	
	
	
}
