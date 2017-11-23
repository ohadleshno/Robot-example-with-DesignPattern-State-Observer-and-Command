package sRobotics.command;

import sRobotics.core.state.ActivationStateType;
import sRobotics.core.state.RobotContext;

public class MoveLeft extends Commandable<Integer> {
    public MoveLeft(RobotContext context) {
        super(context);
    }

    public boolean Execute(Integer multipler)
    {
        if(context.getRobotState().getActivationState().getActivationStateType() == ActivationStateType.off) {
            context.getRobotLogger().info("Can't move left while in off state");
            return false;
        }
        else
        {
            context.getRobotState().changeLocationState(-1*multipler,0);
            context.getRobotLogger().info("Moved left");
            return true;
        }
    }
}
