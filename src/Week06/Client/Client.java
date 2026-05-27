package Week06.Client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static void main() throws IOException {

        Socket client = null;
        try {
            client = new Socket("localhost", 3000);
            Scanner sc = new Scanner(System.in);
            DataOutputStream out = new DataOutputStream(client.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            Runnable runnableOut = new Runnable() {
                String toServer = "";
                @Override
                public void run() {
                    while (true) {
                        System.out.println("Enter msg:");
                        toServer = sc.nextLine();
                        try {
                            out.writeBytes(toServer + "\n");
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            };
            Runnable runnableIn = new Runnable() {
                String fromServer = "";

                @Override
                public void run() {
                    while (true) {
                        try {
                            fromServer = in.readLine();
                            System.out.println(fromServer);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            };
            Thread t1 = new Thread(runnableOut);
            Thread t2 = new Thread(runnableIn);
            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
