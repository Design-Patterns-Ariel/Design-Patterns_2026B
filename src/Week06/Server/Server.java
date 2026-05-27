package Week06.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    static List<SocketHandler> clientMap = new ArrayList<>();

    static void main() {
        ServerSocket s = null;
        int port = 3000;
        int counter = 0;
        try {
            s = new ServerSocket(port);
            System.out.println("Server is running on port " + port);

            while (true) {
                Socket client = null;
                client = s.accept();
                SocketHandler sh = new SocketHandler(client);
                sh.start();
                clientMap.add(sh);

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}