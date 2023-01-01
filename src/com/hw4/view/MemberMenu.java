package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;

public class MemberMenu {
	
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("====== 회원 관리 메뉴 ======");
			
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 >>");
			
			try {
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1: break;
				case 2: break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 6: break;
				case 0: break;
				default: System.out.println("다시 입력해주세요");
				}
				
			} 
			 catch (Exception e) {
				System.out.println("다시 입력해주세요");
				sc.nextLine();
				menuNum = -1;
				
			} 
		}while(menuNum != 0);
			
			
		
	}
	
	public void insertMember() {
		
	}
	
	public void searchMember() {
		
	}
	
	public void updateMember() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void sortMember() {
		
	}

}
