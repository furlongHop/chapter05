package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		/*
		본래 형태(예외 상황으로 처리해주어야 한다.)
		try {
			InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		} catch (Exception e) {
			
		}
		*/
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
		//FileInputStream() 안쪽 경로와 같은 경로를 입력할 경우 백지가 되어 오류가 난다. 주의. ↑
		
		byte[] buff = new byte[1024];
		
		System.out.println("복사 시작");
		while(true) {
			
			int data = in.read(buff);
			
			if(data==-1) {//-1:복사가 완료될 때 출력되는 값(메소드로 이미 정해져 있는 값)
				System.out.println("복사 완료 "+data);
				break;
			}
			out.write(buff);
		}
		
		
		/*
		System.out.println("복사 시작");
		while (true) {//무한 루프
			int data = in.read();//data를 하나씩 읽어올 것
			if(data==-1) {//무한 루프 종료 조건>data값이 -1이면 루프문 탈출
				System.out.println("복사 완료. "+data);
				break;
			}
			out.write(data);
		}
		*/

		in.close();//닫는 것 잊지 말기!
		out.close();//미리 써놓자!
		
	}
	

}
