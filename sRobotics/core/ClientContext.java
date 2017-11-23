package sRobotics.core;

import sRobotics.core.state.ActivationStateType;
import sRobotics.drone.DroneRobot;
import sRobotics.drone.DroneRobotCommands;

public class ClientContext
{
    public Robot currentRobot;

    public ClientContext(Robot currentRobot) {
        this.currentRobot = currentRobot;
    }

    public void changeRobot(Robot robot)
    {
        currentRobot = robot;
    }

    public RobotCommands getRobotCommands()
    {
        return currentRobot.getRobotContext().getRobotCommands();
    }

    public boolean turnOn()
    {
        return currentRobot.getRobotContext().getRobotCommands().getTurnOn().Execute(ActivationStateType.on);
    }

    public boolean turnOff()
    {
        boolean didTurnOff = currentRobot.getRobotContext().getRobotCommands().getTurnOn().Execute(ActivationStateType.off);

        if(!didTurnOff)
        {
            return false;
        }

        if(currentRobot instanceof DroneRobot)
        {
            DroneRobotCommands droneRobotCommands = (DroneRobotCommands) currentRobot.getRobotContext().getRobotCommands();
            boolean didFlyDown = droneRobotCommands.getFlyDown().Execute();
            return didTurnOff && didFlyDown;
        }

        return didTurnOff;
    }

    public boolean checkIsOk()
    {
        return currentRobot.getRobotContext().getRobotCommands().getIsOkCommand().Execute();
    }

    public boolean moveRight(int multipler)
    {
        return currentRobot.getRobotContext().getRobotCommands().getMoveRight().Execute(multipler);
    }

    public boolean moveLeft(int multipler)
    {
        return currentRobot.getRobotContext().getRobotCommands().getMoveLeft().Execute(multipler);
    }

    public boolean moveDown(int multipler)
    {
        return currentRobot.getRobotContext().getRobotCommands().getMoveDown().Execute(multipler);
    }

    public boolean moveUp(int multipler)
    {
        return currentRobot.getRobotContext().getRobotCommands().getMoveUp().Execute(multipler);
    }

    public boolean flyUp()
    {
        if(currentRobot instanceof DroneRobot) {
            DroneRobotCommands droneRobotCommands = (DroneRobotCommands) currentRobot.getRobotContext().getRobotCommands();
            droneRobotCommands.getFlyUp().Execute();

            return true;
        }
        currentRobot.getRobotContext().getRobotLogger().error("Command fly up unavailable for this robot");
        return false;
    }

    public boolean flyDown()
    {
        if(currentRobot instanceof DroneRobot) {
            DroneRobotCommands droneRobotCommands = (DroneRobotCommands) currentRobot.getRobotContext().getRobotCommands();
            droneRobotCommands.getFlyDown().Execute();
            return true;
        }
        currentRobot.getRobotContext().getRobotLogger().error("Command fly down unavailable for this robot");
        return false;
    }

}
