package Week02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {

    private static int COUNT = 0;
    private static Logger instance = null;
    private List<String> logs;


    private Logger() {
        this.logs = new ArrayList<>();
        COUNT++;
        String s = this + " " + COUNT;
        System.out.println(s);
    }

    public void addLog(String msg) {
        this.logs.add(buildLog(msg));

    }

    public List<String> getLog() {
        return logs;
    }

    private String buildLog(String msg) {
        return LocalDateTime.now() + " - " + msg + " -> " + (logs.size() + 1);
    }

    public static Logger getLogger() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }
}
