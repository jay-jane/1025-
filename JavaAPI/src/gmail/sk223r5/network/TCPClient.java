package gmail.sk223r5.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in);) {
			
			while(true) {
				Socket socket = new Socket(
						InetAddress.getByName("localhost"), 8888);
				
				//메시지 보내기
				System.out.print("보낼 메시지 : ");
				String msg = sc.nextLine();
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println(msg + "\n");
				pw.flush();
				
				//메시지 받기
				BufferedReader br = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				String response = br.readLine();
				System.out.println("받은 메시지 : " + response);
				
				//정리 작업
				br.close();
				pw.close();
				socket.close();
			}
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
	}

}
