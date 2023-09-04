package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamRead {		// 이 클래스의 부모는 object임. 
	
	public static void main(String[] args) {  /* throws FileNotFoundException{		 // 이렇게 처리해주면 부모쪽에서 처리를 한다는 건데 모호해져서 이렇게 사용하지는 않고 직접여기서 처리해야 좋다.*/
		String sFileName = "/Users/j.ena/eclipse-workspace/threadStream/src/stream/text.txt";
		String sFileCopy = "/Users/j.ena/eclipse-workspace/threadStream/src/stream/testdataout.txt";
		// 이러이러한 파일이 있어요 라는 버튼을 만들기
		// 파일시스탬 관리자에게 iNode 요청해서
		// 파일시스탬과 하드디스크 사이에 뎐결된 채널(스트림)정보 얻어옴
		File objFile = new File(sFileName);		// 파일스트림 생성됨.
		
		// inputStream 이 추상클래스로 만든 이유는 들어오는 (키보드, 마우스)등은 다양해서 추상으로 만들고 설계는 우리가 하세요.
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		// ==  파일복사하기 ==
		try {
			fis = new FileInputStream(objFile);
			int fileAvailabLelength = fis.available();	// 따로 변수로 저장한 이유는 available(총 글자 수)으로 한번읽고 오면 줄어들기 때문에.
			// // // 파일 읽어오기 // // // 
//			while(fileAvailabLelength > 0) {
//				System.out.print((char)fis.read());
//				fileAvailabLelength = fis.available();
//			}
			
			// // // 파일 복사 // // //
			// fis.read() 를 사용해 정수배열에 저장, 문자로 출력하기
			// FileOutputStream 객체 만들고, 파일이름 "testdataout.txt" 정하고, 객체 생성
			// 복사한 데이터를 testdataout.txt에 쓰기.
			int[] iFilecopy = new int[fileAvailabLelength];
			fos = new FileOutputStream(sFileCopy);
			for(int i = 0; i < fileAvailabLelength; i++) {
				iFilecopy[i] = fis.read();
				fos.write(iFilecopy[i]);
			}
			
		} catch(FileNotFoundException e /* <<얘는 IOExeoption보다 좀 더 작은 범위 체크 */ ) {
			System.out.println("해당파일이 존재하지 않습니다.");
//			e.printStackTrace();		// 어디서 에러가 났는지 트레킹해줌.
		} catch(IOException e) {
			System.out.println("입출력 에러");
		} finally {
			// 종료할 때 알아서 해주세요..
			fis.close();
			fos.close();
		}
	}
}
