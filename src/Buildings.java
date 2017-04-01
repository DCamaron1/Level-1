import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Buildings {
	static Robot bob = new Robot();
	public static void main(String[] args) {
		
		drawBuilding(500,Color.red);
		drawBuilding(400,Color.blue);
		drawBuilding(300,Color.green);
		drawBuilding(200,Color.yellow);
		drawBuilding(100,Color.cyan);
		drawBuilding(10,Color.black);
	}

	static void drawBuilding(int height, Color colors) {
		bob.setSpeed(20);
		bob.setPenColor(colors);
		bob.penDown();
		bob.move(height);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(height);
		bob.turn(-90);
		bob.setPenColor(Color.GREEN);
		bob.move(50);
		bob.turn(-90);
	}
}
