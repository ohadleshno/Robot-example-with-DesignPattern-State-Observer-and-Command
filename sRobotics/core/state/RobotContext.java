package sRobotics.core.state;

import logger.RobotLogger;
import sRobotics.core.RobotCommands;

public class RobotContext
{
    private RobotState robotState;
    private RobotCommands robotCommands;

    public RobotLogger getRobotLogger() {
        return robotLogger;
    }

    private RobotLogger robotLogger;

    public RobotContext(RobotState robotState, RobotCommands robotCommands, RobotLogger robotLogger) {
        this.robotState = robotState;
        this.robotCommands = robotCommands;
        this.robotCommands.init(this);
        this.robotLogger = robotLogger;
    }

    public RobotState getRobotState() {
        return robotState;
    }

    public void setRobotLogger(RobotLogger robotLogger) {
        this.robotLogger = robotLogger;
    }

    public void setRobotState(RobotState robotState) {
        this.robotState = robotState;
    }

    public RobotCommands getRobotCommands() {
        return robotCommands;
    }

    public void setRobotCommands(RobotCommands robotCommands) {
        this.robotCommands = robotCommands;
    }
}
