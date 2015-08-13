package com.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerUtils {

	public static void handleData(){
		try {    
			ServerSocket server = new ServerSocket(30000);    
			Socket socket = server.accept();    
			DataInputStream dis = new DataInputStream(socket.getInputStream());    
			int len = dis.available();   
			System.out.println("len = "+len);  
			byte[] data = new byte[len];    
			dis.read(data);  
			
			System.out.println("data = "+data);   

			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());    
			FileInputStream fis = new FileInputStream("E:/about.jpg");    
			int size = fis.available();  

			System.out.println("size = "+size);  
			byte[] data2 = new byte[size];    
			fis.read(data2);  
			dos.writeUTF("size ="+size);  
			dos.writeInt(size);
			dos.write(data2);    

			dis.close();  
			dos.flush();    
			dos.close();    
			fis.close();    
			socket.close();    
			server.close(); 
			
		} catch (IOException e) {    
			e.printStackTrace();
		}    
	}
	
}
