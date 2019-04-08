package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			robots[i] = new Robot();
			robots[i].miniaturize();
			robots[i].penDown();
			// robots[i].setSpeed(20);
			robots[i].setX(500);
			robots[i].setY(500);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		// robots[0].setX(300);
		// robots[0].setY(500);

		// robots[1].setX(400);
		// robots[1].setY(500);

		// robots[2].setX(500);
		// robots[2].setY(500);

		// robots[3].setX(600);
		// robots[3].setY(500);

		// robots[4].setX(700);
		// robots[4].setY(500);

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (robots[0].getY() > 0 && robots[1].getY() > 0 && robots[2].getY() > 0 && robots[3].getY() > 0
				&& robots[4].getY() > 0) {

			for (int a = 0; a < robots.length; a++) {
				Random r = new Random();

				robots[a].setSpeed(r.nextInt(15));
				robots[a].move(100);
				robots[a].turn(10);
				
				
				// if (robots[a].getY() <= 0) {
				// JOptionPane.showMessageDialog(null, "The robot at the " + (a + 1) + "
				// position won the race.");
				// }
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		// okay

		// 7. declare that robot the winner and throw it a party!
		// done

		// 8. try different races with different amounts of robots.
		// 9. make the robots race around a circular track.

	}
}