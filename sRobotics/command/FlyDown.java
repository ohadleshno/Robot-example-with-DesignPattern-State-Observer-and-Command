package sRobotics.command;

import sRobotics.core.state.ActivationStateType;
import sRobotics.core.state.RobotContext;
import sRobotics.drone.FlyingRobotState;

public class FlyDown extends EmptyCommandable
{
    public FlyDown(RobotContext robotContext) {
        super(robotContext);
    }

    public boolean Execute()
    {
        if (context.getRobotState() instanceof FlyingRobotState) {

            if (context.getRobotState().getActivationState().getActivationStateType() == ActivationStateType.off)
            {
                context.getRobotLogger().info("Doing landing");
            }
            else
            {
                context.getRobotLogger().info("Flying down");
            }

            return true;
        }
        else
        {
            context.getRobotLogger().info("This robot can't fly");
            return false;
        }

    }
}
