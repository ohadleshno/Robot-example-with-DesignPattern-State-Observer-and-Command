package sRobotics.command;

import sRobotics.core.state.RobotContext;
import sRobotics.core.state.ActivationStateType;

public class SwitchOnOffCommand extends Commandable<ActivationStateType> {
    public SwitchOnOffCommand(RobotContext context) {
        super(context);
    }

    public boolean Execute(ActivationStateType type)
    {
        if (context.getRobotState().getActivationState().getActivationStateType() != type) {
            context.getRobotState().getActivationState().change(context, type);
            context.getRobotLogger().info("Change active state to:" +type.name());
            return true;
        }
        else
        {
            context.getRobotLogger().error("can't change active state to " +type.name() + " ,you already in this command");
            return false;
        }

    }
}
