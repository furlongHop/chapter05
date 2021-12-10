package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PointApp {
	
	public static void main(String[] args) throws IOException {
	
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();//한 줄 출력
			
			if(line==null) {//순서 이슈 주의! dataArray가 if문보다 선행될 때의 오류
				break;
			}//네 번째 line에는 null이 온다. 이때의 null은 주소 위치가 비어 있다는 뜻인데, 주소가 없는데 split을 명령할 경우 오류가 난다.
			//따라서 split이 오류를 일으키기 전에 null 값을 바로 잡아주어 반복문을 탈출해야 한다.
			
			String[] dataArray = line.split(",");
			
			String name = dataArray[0];
			String hp = dataArray[1];
			String company =dataArray[2];
			
			System.out.println("이름: "+name);
			System.out.println("핸드폰: "+hp);
			System.out.println("회사: "+company);
			System.out.println("");
		}
		
		br.close();
	}

}
