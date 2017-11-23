package sRobotics.drone;

import sRobotics.core.RobotCommands;
import sRobotics.command.FlyDown;
import sRobotics.command.FlyUp;
import sRobotics.core.state.RobotContext;

public class DroneRobotCommands extends RobotCommands
{
    private FlyUp flyUp = new FlyUp(robotContext);
    private FlyDown flyDown = new FlyDown(robotContext);

    @Override
    public void init(RobotContext robotContext) {
        super.init(robotContext);
        flyUp = new FlyUp(robotContext);
        flyDown = new FlyDown(robotContext);
    }

    public FlyUp getFlyUp() {
        return flyUp;
    }

    public FlyDown getFlyDown() {
        return flyDown;
    }
}
