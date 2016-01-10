/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author BestKung
 */
public class UrlDetail {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://www.ru.ac.th");
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getProtocol());
        System.out.println(url.getFile());
        System.out.println(url.getRef());    
    }
}
