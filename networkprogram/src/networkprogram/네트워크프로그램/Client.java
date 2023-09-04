package networkprogram.네트워크프로그램;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
	
	public Client() throws IOException{
		// file 객체 생성처럼 Socket 객체를 생성되면 네트워크 스트림(체널)이 생성
		Socket socket = new Socket("localhost", 1001);
		System.out.println("클라이언트 : 연결성공");
		
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
		String message = socketInDataRepo.readLine();
		System.out.println("From Server To Client: " + message);
		
		socketOutDataRepo.println("난 클라이언트 첫연결 반갑");
		
		socket.close();
		System.out.println("클라이언트: 소켓종료.");
	}

	public static void main(String[] args) {
		

	}

}
