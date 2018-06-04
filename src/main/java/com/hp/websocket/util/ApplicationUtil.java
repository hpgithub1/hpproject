package com.hp.websocket.util;

import java.util.UUID;

public class ApplicationUtil {
	public static String getUUid() {
        return UUID.randomUUID().toString().replace("-", ""); 
        
	}
	/*public static void main(String[] args) {  
		System.out.println("--"+getUUid());
	}*/
}
