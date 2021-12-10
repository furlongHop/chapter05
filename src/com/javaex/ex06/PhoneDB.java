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
		
		List<Person> pList = new ArrayList<Person>();
		
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
			
			
			Person person = new Person(name,hp,company);
			pList.add(person);
		}
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
		String line = sc.nextLine();
		
		String[] dArray = line.split(",");
		String name = dArray[0];
		String hp = dArray[1];
		String company =dArray[2];
		
		
		Person person = new Person(name,hp,company);
		pList.add(person);
		
		
		listPrint(pList);
		/*
		for(int i=0;i<pList.size();i++) {
			System.out.println("이름: "+pList.get(i).getName());
			System.out.println("핸드폰: "+pList.get(i).getHp());
			System.out.println("회사: "+pList.get(i).getCompany());
			System.out.println("");
		}
		*/
		
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
