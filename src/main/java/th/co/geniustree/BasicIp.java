/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree;

import com.sun.jmx.snmp.InetAddressAcl;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author BestKung
 */
public class BasicIp {
    
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("facebook.com");
        System.out.println(ia);
        
        InetAddress[] address = InetAddress.getAllByName("google.com");
        for(InetAddress a : address){
        System.out.println("ip : "+a);
        }
        
        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println("Localhost : "+address1);
    }
    
}
