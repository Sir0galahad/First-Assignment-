
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            City berlin = new City(); 
    Robot russians = new Robot(berlin, 0, 0, Direction.SOUTH);
    russians.setLabel("Russians");
    Robot germans = new Robot(berlin, 0, 1, Direction.SOUTH);
    germans.setLabel("Germans");
    new Wall(berlin, 0, 1, Direction.WEST);
    new Wall(berlin, 1, 1, Direction.WEST);
    new Wall(berlin, 1, 1, Direction.SOUTH);
    russians.move();
    germans.move();
    germans.turnLeft();
    russians.move();
    germans.move();
    russians.turnLeft();
    germans.turnLeft();
    germans.turnLeft();
    germans.turnLeft();
    germans.move();
    germans.turnLeft();
    germans.turnLeft();
    germans.turnLeft();
    germans.move();
    russians.move();
    }
}
