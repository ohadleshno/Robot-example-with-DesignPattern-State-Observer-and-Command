package sRobotics.command;

import sRobotics.core.state.ActivationStateType;
import sRobotics.core.state.RobotContext;
import sRobotics.drone.FlyingRobotState;

public class FlyUp extends EmptyCommandable {

    public FlyUp(RobotContext robotContext) {
        super(robotContext);
    }

    public boolean Execute()
    {
        if(context.getRobotState() instanceof FlyingRobotState) {
            if (context.getRobotState().getActivationState().getActivationStateType() == ActivationStateType.off) {
                context.getRobotLogger().info("Can't move down while in off state");
                return false;
            }
            context.getRobotLogger().info("Flying up");
            return true;
        }
        else
        {
            context.getRobotLogger().info("This robot can't fly");
            return false;
        }
    }
}
