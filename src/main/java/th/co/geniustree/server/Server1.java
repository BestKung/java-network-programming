/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author BestKung
 */
public class Server1 {

    private static ServerSocket serverSocket;
    private static Socket socket;
    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(1111);
        while (true) {
            socket = serverSocket.accept();
            InputStreamReader input = new InputStreamReader(socket.getInputStream());
            BufferedReader in = new BufferedReader(input);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            String message = in.readLine();
             if(socket.isConnected()){
                    System.out.println("Client Accept !");
                }
            try {
                 while (!message.equals("exit")) {
                System.out.println("Message Received "+message);
                out.println("Received from you : "+message);
                message = in.readLine();
           }
            } catch (Exception e) {
            }
            socket.close();
             
        }
    }
}
