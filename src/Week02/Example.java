package Week02;

import java.util.List;

public class Example

{
    static void main() {
        Logger logger = Logger.getLogger();

        for (int i = 0; i < 10; i++) {
            logger.addLog("Example Error");
        }

        List<String> logs = logger.getLog();

//        for (int i = 0; i < logs.size(); i++) {
//            System.out.println(logs.get(i));
//        }
    }
}
