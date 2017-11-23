package logger;

public enum LogTypes {
    INFO(0),
    WARNING(1),
    ERROR(2);

    private int logLevel;

    LogTypes(int logLevel) {
        this.logLevel = logLevel;
    }

    public int getLogLevel() {
        return logLevel;
    }

    public boolean isHigherOrEqualLevelLog(LogTypes logTypes) {
        return (this.logLevel <= logTypes.getLogLevel());
    }

}
