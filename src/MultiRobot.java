import org.jointheleague.graphical.robot.Robot;

public class MultiRobot {
	public static void main(String[] args) {
		/*Robot sid = new Robot("mini");
		sid.setSpeed(50);
		sid.moveTo(500, 500);
		int i =20;
		while (i>0) {
			sid.penDown();
			sid.move(40);
			sid.turn(18);
			i = i -1;
		}
		Robot bob = new Robot("mini");
		bob.setSpeed(50);
		bob.setPenWidth(40);
		bob.penDown();
		bob.move(50);
		bob.turn(360);
		bob.move(50);
		
		rob.setSpeed(50);
		rob.penDown();
		rob.turn(270);
		rob.move(100);
		rob.turn(10);
		rob.move(70);
		rob.penUp();
		rob.moveTo(400, 400);
		rob.penDown();
		rob.turn(440);
		rob.move(500);
		rob.turn(90);
		rob.move(370);
		rob.turn(90);
		rob.move(500);
		rob.turn(90);
		rob.move(370);
	*/Robot rob = new Robot("mini");
	rob.penDown();
	rob.setSpeed(50);
		for (int i = 0; i < 20; i++) {
			rob.turn(20);
			for (int j = 0; j< 10; j++) {
				rob.turn(360/7);
				rob.move(70);
			}
		}
	}
}
