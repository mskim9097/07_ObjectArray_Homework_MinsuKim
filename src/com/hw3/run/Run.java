package com.hw3.run;

import com.hw3.controller.ProductController;

public class Run {

	public static void main(String[] args) {
		
		//Product Controller의 mainMenu를 실행
		ProductController pc = new ProductController();
		
		pc.mainMenu();
	}

}
