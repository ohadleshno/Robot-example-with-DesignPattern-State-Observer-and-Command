package sRobotics.iRobot;

import logger.RobotLogger;
import sRobotics.core.Robot;
import sRobotics.core.state.RobotContext;
import sRobotics.core.state.RobotState;

public class IRobot extends Robot {

    public IRobot(RobotLogger robotLogger)
    {
        super(robotLogger);
        this.robotContext = new RobotContext(new IRobotState(),new IRobotCommands(), robotLogger);
    }
}
