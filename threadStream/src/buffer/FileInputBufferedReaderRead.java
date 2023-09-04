package buffer;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputBufferedReaderRead {
	private final static String sInFileName = "/Users/j.ena/eclipse-workspace/threadStream/src/stream/text.txt";	
	
	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(sInFileName);
			br = new BufferedReader(fr);
			String oneLine = "";
			oneLine = br.readLine();
			while(oneLine != null) {
				System.out.println(oneLine);
				oneLine = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("입출력 에러");
			e.printStackTrace();
		} 
	}
}