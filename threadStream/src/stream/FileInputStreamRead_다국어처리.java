package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamRead_다국어처리 {		// 이 클래스의 부모는 object임. 
	
	public static void main(String[] args) {  /* throws FileNotFoundException{		 // 이렇게 처리해주면 부모쪽에서 처리를 한다는 건데 모호해져서 이렇게 사용하지는 않고 직접여기서 처리해야 좋다.*/
		String sFileName = "/Users/j.ena/eclipse-workspace/threadStream/src/stream/text.txt";
		String sFileCopy = "/Users/j.ena/eclipse-workspace/threadStream/src/stream/testdataout.txt";
		File objFile = new File(sFileName);		// 파일스트림 생성됨.
		
		FileReader fir = null;

		try {
			fir = new FileReader(objFile);
			
			int i = fir.read();
			while(i != -1) {
				System.out.println((char)i);
				i = fir.read();
			}
			
			fir.close();
		} catch(IOException e) {
			System.out.println("입출력 에러");
		}
	}
}
