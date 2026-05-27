package Week06.Server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.List;

public class SocketHandler extends Thread {

    private Socket in;
    private String nameId;
    private String fromClient = "";
    private DataOutputStream out;
    private BufferedReader inFromClient;

    public SocketHandler(Socket in) {
        this.in = in;
        try {
            this.out = new DataOutputStream(in.getOutputStream());
            this.inFromClient = new BufferedReader(new InputStreamReader(in.getInputStream()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {

            Runnable runnableIn = new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            fromClient = inFromClient.readLine();
                            System.out.println(fromClient);
                            toAllClients();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }
            };

            Thread t2 = new Thread(runnableIn);
            t2.start();
            t2.join();


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void write(String msg) throws IOException {
        System.out.println("In");
        out.writeBytes(msg + "\n");
    }

    private void toAllClients() throws IOException {
        List<SocketHandler> clients = Server.clientMap;
        int size = clients.size();

        for (int i = 0; i < size; i++) {
            SocketHandler client = clients.get(i);
            if (client != this)
                client.write(fromClient);
        }
    }
}