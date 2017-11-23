package sRobotics;

import clien.ConsoleObserver;
import clien.MailContact;
import logger.LogTypes;
import logger.RobotLogger;
import sRobotics.core.*;
import sRobotics.drone.DroneRobot;
import sRobotics.iRobot.IRobot;

public class Main {

    public static void main(String[] args)
    {
        ConsoleObserver consoleObserver2 = new ConsoleObserver(LogTypes.INFO);
        MailContact mailObserver1 = new MailContact(LogTypes.ERROR,"realAdress@gmail.ac.il");
        RobotLogger robotLogger = new RobotLogger();
        robotLogger.addObserver(consoleObserver2);
        robotLogger.addObserver(mailObserver1);

        DroneRobot testRobot1 = new DroneRobot(robotLogger);
        IRobot iRobot = new IRobot(robotLogger);

        ClientContext ctx = new ClientContext(testRobot1);

        test1(ctx);

        ctx.changeRobot(iRobot);
        test1(ctx);

    }

    private static void test1(ClientContext ctx) {
        ctx.turnOn();
        ctx.turnOn();
        ctx.flyDown();
        ctx.flyUp();
        ctx.checkIsOk();
        ctx.checkIsOk();
        ctx.checkIsOk();
        ctx.turnOff();
        ctx.turnOff();
    }
}
