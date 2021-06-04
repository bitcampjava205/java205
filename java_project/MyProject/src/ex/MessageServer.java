package ex;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MessageServer {

	public static void main(String[] args) {

		ServerSocket ss = null;
		Socket s = null;
		
		DataInputStream din = null;
		DataOutputStream dout = null;
		
		try {
			
			ss = new ServerSocket(8888);

			s = ss.accept();

			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());

			Scanner sc = new Scanner(System.in);

			String str1 = null; // 받는 메시지
			String str2 = null; // 보내는 메시지

			while (!str2.equals("exit")) {

				str1 = din.readUTF();
				System.out.println(str1);

				str2 = sc.nextLine();
				dout.writeUTF(str2);
			}
			
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {

			if(din != null) {
				try {
					din.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(dout != null) {
				try {
					dout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(s != null) {
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(ss != null) {
				try {
					ss.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

	}

}
