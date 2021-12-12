package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDB {

	public static void main(String[] args) throws IOException {
		
		//1. List 만들기
		List<Person> pList = new ArrayList<Person>();
		
		//2. Reader로 원본 파일에 접속하기
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true){
			String line = br.readLine();
			
			if(line==null) {
				break;
			}
			
			String[] dArray = line.split(",");
			
			String name = dArray[0];
			String hp = dArray[1];
			String company =dArray[2];
			
			//3. 객체 생성
			Person person = new Person(name,hp,company);
			
			//4. 배열에 입력
			pList.add(person);
		}
		
		//5. 출력
		listPrint(pList);
		/*
		for(int i=0;i<pList.size();i++) {
			System.out.println("이름: "+pList.get(i).getName());
			System.out.println("핸드폰: "+pList.get(i).getHp());
			System.out.println("회사: "+pList.get(i).getCompany());
			System.out.println("");
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 번호, 회사를 입력하시오");
		
		//6. Scanner로 데이터 입력
		String line = sc.nextLine();
		
		String[] dArray = line.split(",");
		String name = dArray[0];
		String hp = dArray[1];
		String company =dArray[2];
		
		//7. 6번에서 입력한 값을 위한 객체 생성
		Person person = new Person(name,hp,company);
		
		//8. 7번 객체 주소 배열에 입력
		pList.add(person);
		
		//9. 출력
		listPrint(pList);
		/*
		for(int i=0;i<pList.size();i++) {
			System.out.println("이름: "+pList.get(i).getName());
			System.out.println("핸드폰: "+pList.get(i).getHp());
			System.out.println("회사: "+pList.get(i).getCompany());
			System.out.println("");
		}
		*/
		
		//10. Writer로 파일 재작성(초기화 후 처음부터 재작성)
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		for(int i=0;i<pList.size();i++) {
			String str = pList.get(i).info();
			bw.write(str);
			bw.newLine();
		}
		
		br.close();
		bw.close();
		
		sc.close();

	}
	
	
	public static void listPrint(List<Person> personList) {//main 메소드가 static에 올라와 있기 때문에 listPrint 메소드도 static에 올려야 사용할 수 있다.
		for(int i=0;i<personList.size();i++) {
			System.out.println("이름: "+personList.get(i).getName());
			System.out.println("핸드폰: "+personList.get(i).getHp());
			System.out.println("회사: "+personList.get(i).getCompany());
			System.out.println("");
		}
	}

}
