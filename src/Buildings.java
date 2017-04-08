import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Buildings {
	static Robot bob = new Robot();
	public static void main(String[] args) {
		
		drawFlatBuilding(50,Color.red);
		drawPointyBuilding(40,Color.blue);
		drawFlatBuilding(300,Color.green);
		drawFlatBuilding(200,Color.yellow);
		drawPointyBuilding(10,Color.cyan);
		drawPointyBuilding(10,Color.black);
		bob.turn(180);
		drawFlatBuilding(50,Color.red);
		drawPointyBuilding(40,Color.blue);
		drawFlatBuilding(300,Color.green);
		drawFlatBuilding(200,Color.yellow);
		drawPointyBuilding(10,Color.cyan);
		drawPointyBuilding(10,Color.black);
	}

	static void drawFlatBuilding(int height, Color colors) {
		bob.setSpeed(20);
		bob.setPenColor(colors);
		bob.setPenWidth(3);
		bob.penDown();
		bob.move(height);
		bob.turn(90);
		bob.move(75);//width
		bob.turn(90);
		bob.move(height);
		bob.turn(-90);
		bob.setPenColor(Color.GREEN);
		bob.move(50);
		bob.turn(-90);
	}

	static void drawPointyBuilding(int height, Color colors) {
		bob.setSpeed(20);
		bob.setPenColor(colors);
		bob.penDown();
		bob.setPenWidth(3);
		bob.move(height);
		bob.turn(45);
		bob.move(50);
		bob.turn(90);
		bob.move(50);
		bob.turn(45);
		bob.move(height);
		bob.turn(-90);
		bob.setPenColor(Color.GREEN);
		bob.move(50);
		bob.turn(-90);
	}
}
