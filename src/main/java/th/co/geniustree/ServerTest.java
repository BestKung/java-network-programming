/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree;

import java.io.IOException;
import java.net.*;

/**
 *
 * @author BestKung
 */
public class ServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("server : "+serverSocket.getLocalPort());
        Socket socket = null;
         while(true){
         socket = serverSocket.accept();
         if(socket.isConnected()){
          System.out.println("client Accept !");
         }
            
         socket.close();
         }
    }
}
