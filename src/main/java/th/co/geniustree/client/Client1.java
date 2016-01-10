/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author BestKung
 */
public class Client1 {

    private static Socket socket = null;

    public static void main(String[] args) throws IOException {
        socket = new Socket("localhost", 1111);
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader in = new BufferedReader(inputStreamReader);
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader userMessage = new BufferedReader(new InputStreamReader(System.in));
        String message, respon;
        do {
            System.out.print("Enter Message : ");
            message = userMessage.readLine();
            out.println(message);
            respon = in.readLine();
            System.out.println("Server Respon" + respon);
             if("exit".equals(message)){
            socket.close();
            }
        } while (!message.equals("exit"));
        
    }
}
