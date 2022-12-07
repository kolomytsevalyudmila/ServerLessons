
package serverlessons;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerLessons {

    
    public static void main(String[] args) throws IOException {
        
        ServerSocket server = new ServerSocket(30333);
        
        while(true) {
            Socket sock = server.accept();
            System.out.println("client " +sock.getInetAddress().getCanonicalHostName() + " connected");
            new ClienThread(sock).startProcessing();
        }
        
    }
    
}
