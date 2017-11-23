package sRobotics.drone;

import logger.RobotLogger;
import sRobotics.core.Robot;
import sRobotics.core.state.RobotContext;

public class DroneRobot extends Robot
{
    public DroneRobot(RobotLogger robotLogger)
    {
        super(robotLogger);
        this.robotContext = new RobotContext(new FlyingRobotState(),new DroneRobotCommands(), robotLogger);
    }
}
