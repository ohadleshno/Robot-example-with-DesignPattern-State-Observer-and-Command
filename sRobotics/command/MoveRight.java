package sRobotics.command;

import sRobotics.core.state.ActivationStateType;
import sRobotics.core.state.RobotContext;

public class MoveRight extends Commandable<Integer> {
    public MoveRight(RobotContext context) {
        super(context);
    }

    public boolean Execute(Integer multiplier)
    {
        if(context.getRobotState().getActivationState().getActivationStateType() == ActivationStateType.off) {
           context.getRobotLogger().info("Can't move right while in off state");
           return false;
        }
        else
        {
            context.getRobotState().changeLocationState(multiplier*1,0);
            context.getRobotLogger().info("Moved right");
            return true;
        }
    }
}
