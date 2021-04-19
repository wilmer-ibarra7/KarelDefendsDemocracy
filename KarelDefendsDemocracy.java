package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

			public void run() {
				CheckBallots();
				CollectBallots();
				GrabOneBallot();
				CollectBallots();
				}
		
				public void CheckBallots() {
						move();
					if (beepersPresent()) {
						turnLeft();
						move();
						turnAround();
						move();
						move();
						turnAround();
						move();
						turnRight();
						if(frontIsBlocked() == false){ move(); 
						}
					}
					}	
				// This method is for collecting all the beepers on the 10th Avenue
				public void CollectBallots() {
					if(frontIsBlocked() == false){ move();
						if (frontIsClear()) {
						turnLeft();
						move();
					if(beepersPresent()) {
						pickBeeper();
					}
					turnAround();
					move();
					move();
					if(beepersPresent()) {
						pickBeeper();
						pickBeeper();
					}
					turnAround();
					if(frontIsBlocked() == false){ move();
					turnRight();
					if(frontIsBlocked() == false){ move();
					}
					}
						}
					}
					}
			public void turnAround() {
						turnLeft();
						turnLeft();
}   
			public void turnRight() {
						turnLeft();
						turnLeft();
						turnLeft();
			}
			// Method to grab the ballot on Ave 6
			public void GrabOneBallot() {
				if(frontIsClear()) {
					  move();
					  turnLeft();
					  move();
					if(beepersPresent()) {
						pickBeeper();
						turnAround();
						move();
						turnLeft();
					}
				}
			}
}