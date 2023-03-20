package Singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    private int num = 1;

    private Date dateNow = new Date();
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public void log(String msg) {
        System.out.println("[" + formatDate.format(dateNow) + " " + num++ + "] " + msg);
    }

}
