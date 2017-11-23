package sRobotics.command;

import sRobotics.core.state.RobotContext;

public abstract class EmptyCommandable
{
    protected RobotContext context;

    public EmptyCommandable(RobotContext robotContext) {
        this.context = robotContext;
    }

    abstract boolean Execute();
}
