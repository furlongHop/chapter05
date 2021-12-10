package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\MS949.txt");//MS949는 UTF-8로 읽을 수 없다
		InputStreamReader isr = new InputStreamReader(is, "MS949");//보조 스트림, MS949 포맷으로 저장된 파일 읽기
		BufferedReader br = new BufferedReader(isr);//보조 스트림
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				break;
			}
			
			System.out.println(str);
		}
	}

}
