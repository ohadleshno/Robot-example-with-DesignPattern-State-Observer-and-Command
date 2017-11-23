package sRobotics.core;

import sRobotics.command.*;
import sRobotics.core.state.RobotContext;

public abstract class RobotCommands
{
    protected RobotContext robotContext;
    private SwitchOnOffCommand turnOn = new SwitchOnOffCommand(robotContext);;
    private HelloCommand sayHello = new HelloCommand(robotContext);;
    private MoveLeft moveLeft = new MoveLeft(robotContext);
    private MoveRight moveRight = new MoveRight(robotContext);
    private MoveUp moveUp = new MoveUp(robotContext);
    private MoveDown moveDown = new MoveDown(robotContext);
    private IsOkCommand isOkCommand = new IsOkCommand(robotContext);

    public void init(RobotContext robotContext) {
        this.robotContext = robotContext;
        turnOn = new SwitchOnOffCommand(robotContext);;
        sayHello = new HelloCommand(robotContext);;
        moveLeft = new MoveLeft(robotContext);
        moveRight = new MoveRight(robotContext);
        moveUp = new MoveUp(robotContext);
        moveDown = new MoveDown(robotContext);
        isOkCommand = new IsOkCommand(robotContext);
    }

    public SwitchOnOffCommand getTurnOn() {
        return turnOn;
    }

    public HelloCommand getSayHello() {
        return sayHello;
    }

    public MoveLeft getMoveLeft() {
        return moveLeft;
    }

    public MoveRight getMoveRight() {
        return moveRight;
    }

    public MoveUp getMoveUp() {
        return moveUp;
    }

    public IsOkCommand getIsOkCommand() {
        return isOkCommand;
    }

    public MoveDown getMoveDown() {
        return moveDown;
    }

}
