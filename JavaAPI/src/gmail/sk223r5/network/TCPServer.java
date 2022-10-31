package gmail.sk223r5.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) {

		//try ~ resources 구문 - 메모리 해제를 하지 않아도 됨
		try(ServerSocket ss = new ServerSocket(9999);) {
			System.out.println("서버 대기 중...");

			//클라이언트의 요청 대기
			try {
				Socket socket = null;
				while(true) {
					
					//대기하다가 클라이언트의 요청이 오면 접속됨
					socket = ss.accept();
					System.out.println("-----연결됨-----");

					//접속자 정보 출력
					System.out.println("접속자 정보 : " + socket.toString());

					//접속자와 문자열을 읽을 수 있는 스트림 생성
					BufferedReader br = new BufferedReader(
							new InputStreamReader(socket.getInputStream()));

					//한 줄의 메시지 읽기
					String msg = br.readLine();
					if(msg.equals("멍멍")) {
						System.out.println(msg = "ㅁㄴㅇㄹ");
					} else {
						System.out.println(msg);
					}

					//메시지를 보낼 수 있는 스트림 생성
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					pw.println(msg);

					//정리 작업
					pw.close();
					br.close();
					socket.close();
				}
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			} 

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
