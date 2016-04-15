package org.yelp.netty;

import java.util.Scanner;

public class TestNettyClient {
    
	public static void main(String[] args) throws Exception {  
        try {  
            TcpClient.sendMsg("hello server");
            Scanner scanner = new Scanner(System.in);
            TcpClient.sendMsg(scanner.nextLine());
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }
}
