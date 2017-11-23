package sRobotics.command;

import sRobotics.core.state.RobotContext;

import java.util.Random;

public class IsOkCommand extends EmptyCommandable {

    public IsOkCommand(RobotContext robotContext) {
        super(robotContext);
    }

    @Override
    public boolean Execute() {
        Random random = new Random();
        if (random.nextBoolean())
        {
            context.getRobotLogger().info("EveryThingOkMan");
            return true;
        }

        context.getRobotLogger().error("EveryThingNotOkMan");
        return false;
    }
}
