package clien;

import logger.ClientLog;
import logger.LogTypes;

import java.util.Observable;
import java.util.Observer;

public class FileObserver implements Observer {

    private LogTypes logTypes;

    @Override
    public void update(Observable observable, Object clientLog)
    {
        ClientLog messageToPrint = (ClientLog) clientLog;
        if(this.logTypes.isHigherOrEqualLevelLog(messageToPrint.getLogTypes())) {
            System.out.println(messageToPrint.getMessage());
        }
    }
}

