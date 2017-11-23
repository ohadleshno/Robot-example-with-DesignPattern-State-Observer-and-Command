package logger;

public class ClientLog
{
    private LogTypes logTypes;
    private String message;

    public ClientLog(LogTypes logTypes, String message) {
        this.logTypes = logTypes;
        this.message = message;
    }

    public LogTypes getLogTypes() {
        return logTypes;
    }

    public String getMessage() {
        return message;
    }
}
