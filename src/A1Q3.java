
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            City berlin = new City(); 
    Robot russians = new Robot(berlin, 3, 0, Direction.EAST);
    russians.setLabel("Russians");

    new Wall(berlin, 3, 2, Direction.WEST);
    new Wall(berlin, 3, 2, Direction.NORTH);
    new Wall(berlin, 2, 3, Direction.WEST);
    new Wall(berlin, 1, 3, Direction.WEST);
    new Wall(berlin, 1, 3, Direction.EAST);
    new Wall(berlin, 1, 3, Direction.NORTH);
    new Wall(berlin, 2, 4, Direction.NORTH);
    new Wall(berlin, 2, 4, Direction.EAST);
    new Wall(berlin, 3, 4, Direction.EAST);
    new Thing(berlin, 3, 1);
    russians.move();
    russians.pickThing();
    russians.turnLeft();
    russians.move();
    russians.turnLeft();
    russians.turnLeft();
    russians.turnLeft();
    russians.move();
    russians.turnLeft();
    russians.move();
    russians.move();
    russians.turnLeft();
    russians.turnLeft();
    russians.turnLeft();
    russians.move();
    russians.putThing();
    russians.move();
    russians.turnLeft();
    russians.turnLeft();
    russians.turnLeft();
    russians.move();
    russians.turnLeft();
    russians.move();
    russians.turnLeft();
    russians.turnLeft();
    russians.turnLeft();
    russians.move();
    russians.move();
    russians.turnLeft();
    }
}
