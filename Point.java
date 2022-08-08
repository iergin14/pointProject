package org.javaturk.oopj.ch08.point;

public class Point {

	int posX;
	int posY;

	double randPosX;
	int randPosY;
	
	{
		randPosX = this.getRandPos();
		randPosY = (int)(randPosX + Math.random());
		System.out.println("\nIn an instance initializer block.");
	}
	
	Point(int posX,int posY){
		this.posX=posX;
		this.posY = posY;
	}
	
	Point(int posY){
		this(5,posY);
	}
	double getRandPos() {
		return Math.random() * 10;
	}

	
	int getPosX(){
    	return posX;
    }
	
    void setPosX(int newPosX) {
    	posX = newPosX;
    }	
  
	
    int getPosY(){
    	return posY;
    }
    
    void setPosY(int newPosY) {
    	posY = newPosY;
    }
    

	double getDistance(int x, int y) {
		double distanceY = Math.pow((posY - y), 2);
		double distanceX = Math.pow((posX - x), 2);
		double distance = distanceX + distanceY;
		return Math.pow(distance, 0.5);
	}
	
	double getDistanceToCenter() {
		return this.getDistance(0, 0);
	}  
	
	//Point clone() {
	//	Point tempPoint = new Point();
	//	tempPoint.posX =this.posX;
	//	tempPoint.posY = this.posY;
	//	return tempPoint;
	//}
	
	void move(int x, int y) {
		this.posX += x;
		this.posY += y;
	}
	
	
	

}

