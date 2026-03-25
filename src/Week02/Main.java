package Week02;

import java.util.List;

public class Main {
    static void main() {
        Logger logger=  Logger.getLogger();

        for (int i = 0; i <10 ; i++) {
            logger.addLog("Main Error");
        }

        List<String> logs = logger.getLog();

        Test.main();
        Example.main();

        for (int i = 0; i < logs.size(); i++) {
            System.out.println(logs.get(i));
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(Logger.getLogger());
        }
    }

}
