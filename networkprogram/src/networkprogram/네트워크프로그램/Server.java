package networkprogram.네트워크프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

// 입/출력 버퍼 사이즈 조정: regedit

public class Server {

	public Server() throws IOException{
		// // ⤵️ 서버 소켓이라는 것은 정보오픈시 사용함., 서버정보가 저장되어 있음 저장 후 소켓을 통해 데이터 통신
		ServerSocket server_socket = new ServerSocket(10001);
		System.out.println("서버 : 10001번 포트가 오픈");
		
		// // ⤵️ 소켓 객체를 사용해서 데이터 통신함
		// 클라이언트에서 서버로 오는 응답 대기 (연결요청이 있을 때까지 실행 중지)_
		Socket socket = server_socket.accept();  
		// getInetAddress: 클라이언트의 IP주소
		System.out.println("서버 : 클라이언트 : " + socket.getInetAddress() + " 연결됨.");
		// getPort() : 클라이언트의 포트
		System.out.println("서버: 클라이언트 : " + socket.getPort() + " 연결됨.");
		
		// ⤵️ 입출력(데이터)저장소 = I/O buffer
		/*입력받는 버퍼*/
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8/*문자를 보내는 형식을 지정해줌(선택요소)*/);
		BufferedReader socketInDataRepo 
									= new BufferedReader(isr);
									// socket.getInputStream()을 받아 InputStreamReader로 문자단위로 처리해 BufferedReader로 읽는다.
		/*출력하는 버퍼*/ 
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
		PrintWriter socketOutDataRepo
								 	= new PrintWriter(osw, true);
		
		// 출력버퍼 : 클라이언트에게 메시지 보내기
		socketOutDataRepo.println("당신의 연결을 환영합니다.");	// 보냄
		String message = socketInDataRepo.readLine();
		System.out.println("From client to Server : " + message);
		
		server_socket.close();
		System.out.println("서버: 소켓종료");
		
		
	}
	public static void main(String[] args) {
		// 소켓에 기본적으로 자신의 아이피와 포트번호를 저장 
		try {
			new Server();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
