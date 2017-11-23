package logger;

import java.util.Observable;

public class RobotLogger extends Observable implements RobotLoggerI
{
    @Override
    public void info(String msg)
    {
        setChanged();
        notifyObservers(new ClientLog(LogTypes.INFO,msg));
    }

    @Override
    public void warning(String msg)
    {
        setChanged();
        notifyObservers(new ClientLog(LogTypes.WARNING,msg));
    }

    @Override
    public void error(String msg)
    {
        setChanged();
        notifyObservers(new ClientLog(LogTypes.ERROR,msg));
    }
}
