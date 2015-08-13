package com.example.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientUtil {

	public static byte[] receiveData(StringBuffer result){
		byte[] data=null;
		DataInputStream in =null;
		Socket socket=null;
		try {   
			socket=new Socket("10.30.2.196", 30000);
			in = new DataInputStream(socket.getInputStream());    
			
			result.append(in.readUTF());
			
			int size = in.readInt();    
			data = new byte[size];    
			int len = 0;    
			while (len < size) {    
				len += in.read(data, len, size - len);    
			}    
			
		} catch (IOException e) {    
			e.printStackTrace();     
		} finally {    
			try {    
				in.close();
				socket.close();  
			} catch (IOException e) {    
				e.printStackTrace();    
			}    
		}
		return data; 
	}

	public static void sendData(byte[] bytes ){
		DataOutputStream out = null;
		Socket socket=null;
		try {  
			socket=new Socket("10.30.2.196", 30000);
			out = new DataOutputStream(socket.getOutputStream());   
			out.write(bytes);  
			System.out.println("bytes--->"+bytes);  
			 
		} catch (UnknownHostException e) {  
			e.printStackTrace();  
		} catch (IOException e) {  
			e.printStackTrace();  
		} finally{
			try {   
				out.close(); 
				socket.close();  
			} catch (IOException e) {    
				e.printStackTrace();    
			} 
		}
	}
}
