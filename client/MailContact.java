package clien;

import logger.LogTypes;
import logger.ClientLog;

import java.util.Observable;
import java.util.Observer;

public class MailContact implements Observer
{
    private LogTypes logTypes;
    private String mail;

    public MailContact(LogTypes logTypes, String mail) {
        this.logTypes = logTypes;
        this.mail = mail;
    }

    public LogTypes getLogTypes() {
        return logTypes;
    }

    public void setLogTypes(LogTypes logTypes) {
        this.logTypes = logTypes;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public void update(Observable observable, Object o)
    {
        ClientLog messageToMail = (ClientLog) o;
        if(this.logTypes.isHigherOrEqualLevelLog(messageToMail.getLogTypes())) {
            System.out.println("Sent mail to: " +mail);
        }
    }
}
