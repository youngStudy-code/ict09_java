package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ioException {
	
	public static void main(String[] args) throws IOException{ //부모(jvm)에 떠넘기기
		
		FileInputStream fis = null; //전역변수
		
		// 목적: 비정상 되는 문제를 해결하기 위해
		try {
			 fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			
			/*
			java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
			at java.base/java.io.FileInputStream.open0(Native Method)
			at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
			at ch09._03_ioException.main(_03_ioException.java:14)
			*/
			
			System.out.println("메시지: " + e.getMessage());
		} finally {
			if(fis != null) { //a.txt파일이 있을 경우
				fis.close();
			}
			System.out.println("<<<<<finally 문장이므로 항상 수행됩니다.>>>>");
		}
		System.out.println("<<<<<정상종료>>>>");
	} 
}

/*
 * 메시지: a.txt (지정된 파일을 찾을 수 없습니다)
<<<<<finally 문장이므로 항상 수행됩니다.>>>>
<<<<<정상종료>>>>
 */
