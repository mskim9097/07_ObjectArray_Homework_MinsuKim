package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {
	
	public static final int SIZE = 10;
	
	private int memberCount = 0;
	
	Member[] mem = new Member[10];
	
	public int getMemberCount() {
		
		return memberCount;
	}
	
	public Member[] getMem() {
		return null;
		
	}
	
	public Member checkId(String userId) {
		return null;
		
	}
	
	public void insertMember(Member m) {
		
	}
	
	public Member searchMember(int menu, String search) {
		return null;
		
	}
	
	public void updateMember(Member m, int menu, String update) {
		
	}
	
	public void deleteMember(String userId) {
		
	}
	
	public Member[] sortIdAsc() {
		return mem;
		
	}
	
	public Member[] sortIdDesc() {
		return mem;
		
	}
	
	public Member[] sortAgeAsc() {
		return mem;
		
	}
	
	public Member[] sortAgeDesc() {
		return mem;
		
	}
	
	public Member[] sortGenderDesc() {
		return mem;
		
	}

}
