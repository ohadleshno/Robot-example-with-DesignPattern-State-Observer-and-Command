package sRobotics.command;

import sRobotics.core.state.ActivationStateType;
import sRobotics.core.state.RobotContext;

public class MoveUp extends Commandable<Integer> {

    public MoveUp(RobotContext context) {
        super(context);
    }

    public boolean Execute(Integer multipler)
    {
        if(context.getRobotState().getActivationState().getActivationStateType() == ActivationStateType.off) {
            context.getRobotLogger().info("Can't move up while in off state");
            return false;
        }
        else
        {
            context.getRobotState().changeLocationState(0,multipler*1);
            context.getRobotLogger().info("Moved up");
            return true;
        }
    }
}