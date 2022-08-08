package org.javaturk.oopj.ch08.point;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point1 = new Point(3);
		point1.posX = 3;
		System.out.println("Point X: " + point1.posX);
		System.out.println("Point Y: " + point1.posY);
		System.out.println("Distance to Center: " + point1.getDistanceToCenter());
		Point point2 = new Point(2,8);
		System.out.println("Point X: " + point2.getPosX());
		System.out.println("Point Y: " + point2.getPosY());
		System.out.println("Distance between two point: " + point1.getDistance(point2.posX,point2.posY));
	
	}

}
