
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author millc9988
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City berlin = new City(); 
    Robot russians = new Robot(berlin, 0, 2, Direction.WEST);
    russians.setLabel("Russians");
    // creating a wall box
    new Wall(berlin, 1, 2, Direction.EAST);
    new Wall(berlin, 2, 2, Direction.EAST);
    new Wall(berlin, 2, 2, Direction.SOUTH);
    new Wall(berlin, 2, 1, Direction.SOUTH);
    new Wall(berlin, 2, 1, Direction.WEST);
    new Wall(berlin, 1, 1, Direction.WEST);
    new Wall(berlin, 1, 1, Direction.NORTH);
    new Wall(berlin, 1, 2, Direction.NORTH);
    //making russians circle berlin 5 times
    for(int i=0;i<5;i++) {
        russians.move();
        russians.move();
        russians.turnLeft();
        russians.move();
        russians.move();
        russians.move();
        russians.turnLeft();
        russians.move();
        russians.move();
        russians.move();
        russians.turnLeft();
        russians.move();
        russians.move();
        russians.move();
        russians.turnLeft();
        russians.move();
    }
    }
}
