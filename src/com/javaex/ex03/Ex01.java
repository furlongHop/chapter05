package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.txt"); 
		BufferedWriter bw = new BufferedWriter(fw);//보조 스트림은 섞어 쓰지 않는다.
		
		bw.write("학교 종이 땡떙떙");
		bw.newLine();//줄바꿈 코드(환경에 맞는 코드를 알아서 적용해준다)
		bw.write("어서 모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다♬");
		
		bw.close();//보조 스트림을 닫으면 보조 스트림이 주 스트림도 닫아준다.
	}

}
