package sRobotics.command;

import sRobotics.core.state.RobotContext;

public abstract class Commandable<T> {
    protected RobotContext context;

    public Commandable(RobotContext context) {
        this.context = context;
    }

    abstract boolean Execute(T options);
}

