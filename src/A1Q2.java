
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author millc9988
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City berlin = new City(); 
    Robot russians = new Robot(berlin, 1, 2, Direction.SOUTH);
    russians.setLabel("Russians");
    //setting up scenario
    new Wall(berlin, 1, 2, Direction.EAST);
    new Wall(berlin, 2, 1, Direction.SOUTH);
    new Wall(berlin, 1, 2, Direction.SOUTH);
    new Wall(berlin, 1, 1, Direction.NORTH);
    new Wall(berlin, 1, 2, Direction.NORTH);
    new Wall(berlin, 1, 1, Direction.WEST);
    new Wall(berlin, 2, 1, Direction.WEST);
    new Thing(berlin, 2, 2);
    //moving through the scenario
    russians.turnLeft();
    russians.turnLeft();
    russians.turnLeft();
    russians.move();
    russians.turnLeft();
    russians.move();
    russians.turnLeft();
    russians.move();
    russians.pickThing();
    russians.turnLeft();
    russians.turnLeft();
    russians.move();
    russians.turnLeft();
    russians.turnLeft();
    russians.turnLeft();
    russians.move();
    russians.turnLeft();
    russians.turnLeft();
    russians.turnLeft();
    russians.move();
    russians.turnLeft();
    russians.turnLeft();
    russians.turnLeft();
    }
}
