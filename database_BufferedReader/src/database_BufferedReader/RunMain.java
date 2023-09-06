package database_BufferedReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RunMain {

	public static void main(String[] args) throws IOException{
//		// 스트림 생성 : file
//		File objFile = new File("tablelikedata.txt");
//		
//		// 스트림 연결 : fileReader
//		FileReader fileReader = new FileReader(objFile);
//		
//		// 스트림 버퍼화 : BufferedReader
//		BufferedReader br = new BufferedReader(fileReader);
		
		BufferedReader br = new BufferedReader(new FileReader(new File("/Users/j.ena/eclipse-workspace/database_BufferedReader/src/database_BufferedReader/tablelikedata.txt")));
		
		
		// 읽고 쓰기
		String oneLine = null;
		int iLineType = 0;			// 0: 타이틀, 1: 데이터
		while((oneLine = br.readLine()) != null) {
			if(oneLine.startsWith("Title")) {
				iLineType = 0;
			} else if(oneLine.startsWith("Data")) {
				iLineType = 1;
			}
			
			if(iLineType == 1) {
				String[] splitval = oneLine.split("#");
				System.out.print(splitval[1] + " ");
				System.out.print(splitval[2] + " ");
				System.out.print(splitval[3] + " \n");
			}
			
		}
		
		br.close();
	}
}
