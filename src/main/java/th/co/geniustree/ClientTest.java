/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author BestKung
 */
public class ClientTest {

    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost", 1234);
        System.out.println("open");
        InputStream response = clientSocket.getInputStream();
        StringBuffer str = new StringBuffer();
        int legnth = 0;

        while ((legnth = response.read()) != -1) {
            str.append((char) legnth);
        }
        
        System.out.println("end !");
    }
}
