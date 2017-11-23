package sRobotics.command;

import sRobotics.core.state.RobotContext;

public class HelloCommand extends EmptyCommandable
{
    public HelloCommand(RobotContext robotContext) {
        super(robotContext);
    }

    public boolean Execute()
    {
       context.getRobotLogger().info("hello");
       return true;
    }
}
