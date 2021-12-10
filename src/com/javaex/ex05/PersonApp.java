package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PersonApp {

	public static void main(String[] args) throws IOException {
		
		//ArrayList 메모리 로딩
		List<Person> pList = new ArrayList<Person>();
		
		//phoneDB 접속
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		while(true) {
			String line = br.readLine();//한줄씩 읽어오기
			
			if(line==null) {//마지막일 경우 반복문 탈출
				break;
			}
			
			//마지막이 아닐 경우 ,로 구분
			String[] dataArray=line.split(",");
			
			String name = dataArray[0];
			String hp = dataArray[1];
			String company =dataArray[2];
			
			//Person 객체 생성 후 값 입력
			Person person = new Person(name,hp,company);
			pList.add(person);//pList에 추가
		}
		
		for(int i=0;i<pList.size();i++) {
			System.out.println("이름: "+pList.get(i).getName());
			System.out.println("핸드폰: "+pList.get(i).getHp());
			System.out.println("회사: "+pList.get(i).getCompany());
			System.out.println("");
		}
		
		
		br.close();
	}

}
