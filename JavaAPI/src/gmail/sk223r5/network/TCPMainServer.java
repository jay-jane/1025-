package gmail.sk223r5.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPMainServer {
	public static void main(String[] args) {
		
		try(ServerSocket ss = new ServerSocket(8888);) {
			System.out.println("대기중");
			try {
				Socket socket = null;
				while(true) {
					socket = ss.accept();
					System.out.println("---연결---");
					
					System.out.println("접속자 : " + socket.toString());
					
					BufferedReader br = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
					
					String msg = br.readLine();
					if(msg.equals("멍멍")) {
						System.out.println(msg = "강아지");
					} else {
						System.out.println(msg);
					}
					
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					pw.println(msg);
					
					pw.close();
					br.close();
					socket.close();
				}
				
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
			
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
