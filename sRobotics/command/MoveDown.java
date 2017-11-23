package sRobotics.command;

import sRobotics.core.state.ActivationStateType;
import sRobotics.core.state.RobotContext;

public class MoveDown extends Commandable<Integer> {

    public MoveDown(RobotContext context) {
        super(context);
    }

    public boolean Execute(Integer multipler)
    {
        if(context.getRobotState().getActivationState().getActivationStateType() == ActivationStateType.off) {
            context.getRobotLogger().info("Can't move down while in off state");
            return false;
        }
        else
        {
            context.getRobotState().changeLocationState(0,-1* multipler);
            context.getRobotLogger().info("Moved down");
            return true;
        }
    }
}