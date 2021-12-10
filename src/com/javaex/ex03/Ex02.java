package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);//속도를 올리기 위해 쓰는 보조 스트림
		
		while(true) {
			String str = br.readLine();//파일에서 한 줄씩 읽어오는 메소드(줄바꿈 기호 제외)
			if(str==null) {//조건문, 출력을 위해 String 타입의 str이란 그릇에 넣음
				break;
			}
			
			System.out.println(str);
		}
		
		
	}

}
