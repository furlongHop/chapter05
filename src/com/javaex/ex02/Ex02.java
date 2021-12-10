package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");//주스트림
		BufferedInputStream bin = new BufferedInputStream(in);//보조스트림
		//                                                 ↑ 주스트림과의 연결고리
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\bufferedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("복사 시작");
		while(true) {
			int data = bin.read();
			if(data==-1) {
				System.out.println("복사 완료 "+data);
				break;
			}
			bout.write(data);
		}
				
		
		bin.close();//buffered를 이용해 stream을 컨트롤>주stream까지 닫아준다
		bout.close();
	}

}
