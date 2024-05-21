package it.unicam.cs.followme.robot;

import it.unicam.cs.followme.app.iController;

import java.util.ArrayList;
import java.util.List;

public class RobotController implements iController {

    RobotFactory robotFactory = new RobotFactory();
    public RobotController() {
        this.robotList = robotFactory.inizializzaRobot();
    }

    List<Robot> robotList = new ArrayList<>();


    @Override
    public List getlist() {
        return robotList;
    }
}
