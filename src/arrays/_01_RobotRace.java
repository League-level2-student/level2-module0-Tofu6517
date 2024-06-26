package arrays;

import java.awt.AWTException;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	private static int randomInt(){
		Random ran =new Random();
		int r=ran.nextInt(50);	
		return r;
	}
	public static void main(String[] args) throws AWTException {

	//2. create an array of 5 robots.
		Robot[] rob=new Robot[8];
	//3. use a for loop to initialize the robots.
		for(int i=0;i<rob.length;i++) {
			rob[i]=new Robot();
			rob[i].setSpeed(10);
			rob[i].moveTo(50+100*i, 500);
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		int k=0;

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.\
		boolean tOrF=true;
		while(tOrF){
			for(int i=0;i<=rob.length-1;) {
				int r=randomInt();
				rob[i].move(r);	
				if(rob[i].getY()<0) {
					System.out.println("Robot "+(i+1)+" won!");
					System.exit(0);
				}
				i=i+1;
			}
		}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}

}
