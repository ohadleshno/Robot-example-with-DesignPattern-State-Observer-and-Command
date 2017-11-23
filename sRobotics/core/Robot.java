package sRobotics.core;


import logger.RobotLogger;
import sRobotics.core.state.RobotContext;

public abstract class Robot
{
    protected RobotContext robotContext;
    protected RobotLogger robotLogger;

    public void setRobotLogger(RobotLogger robotLogger) {
        robotContext.setRobotLogger(robotLogger);
    }


    public Robot(RobotLogger robotLogger)
    {
        this.robotLogger = robotLogger;
    }


    public RobotContext getRobotContext()
    {
        return robotContext;
    }

}
