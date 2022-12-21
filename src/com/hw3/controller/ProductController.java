package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	private Product[] pro = new Product[10]; // = null
	public int count = 0; // 현재 추가된 객체수
		
	Scanner sc = new Scanner(System.in);

	// 초기화 블럭을 이용하여 10개의 Prodcut 배열 크기 할당
	
	public ProductController() {
		pro[0] = new Product();
		pro[1] = new Product();
		pro[2] = new Product();
		pro[3] = new Product();
		pro[4] = new Product();
		pro[5] = new Product();
		pro[6] = new Product();
		pro[7] = new Product();
		pro[8] = new Product();
		pro[9] = new Product();
		
	}
	
	
	
	
	//do~while 문을 이용하여 반복적으로 메뉴화면 출력 각 버튼 선택 시 각각의 메소드 호출	
	public void mainMenu() {
		int menuNum = 0;
		do { // 한번은 무조건 반복
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(" 메뉴선택 >>");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 0: System.out.println("\n프로그램을 종료합니다"); break;
			default: System.out.println("\n다시 입력해주세요");
			}
		} while(menuNum != 0);
							
		
	}
	// 새로운 제품 정보 기록을 위해 키보드로 정보들을 입력받아 객체를 생성
	// 현재 카운트 인덱스에 주소저장
	public void productInput() {
		System.out.println("===== 제품 정보 추가 =====");	
		
		if(count == 10) {
			System.out.println("모든 공간이 저장되어있습니다.");
		} else {			
			System.out.print("제품 번호 : ");
			int inputPld = sc.nextInt();
			sc.nextLine();
			System.out.print("제품명 : ");
			String inputPName = sc.next();
			System.out.print("제품 가격 : ");
			int inputPrice = sc.nextInt();
			sc.nextLine();
			System.out.print("제품 세금 : ");
			double inputTax = sc.nextDouble();
			
			for(int i = 0; i <= count; i++) {				
				pro[i].setPld(inputPld);
				pro[i].setpName(inputPName);
				pro[i].setPrice(inputPrice);
				pro[i].setTax(inputTax);			
				count ++;

			}
		}
		
		
	}
	//현재까지 기록된 도서 정보 모두 출력
	public void productPrint() {
		System.out.println("===== 제품 정보 조회 =====");
		

		
		for(int i = 0; i < pro.length; i++) {
			if(pro[i] == null) {
				continue;
			} else {
				System.out.println(pro[i].information());
			}
				 
		
		}	
			
	}
	
}
