package com.work.view;

import java.util.Random;

public class Lotto645 {
	/*1. 정렬알고리즘
	 * 2. 단계임허용 => 다중 게임
	 * => 다중 게임 : 1장 =>총 5게임
	 * => 1차원 배열 => 2차원 배열 / 1게임 메서드를 다중게임수만큼
	 * 반복호출 수령
	 * ##기술
	 * -- 반복문
	 * => break; 
	 * => continue; 역할
	 * 
	 * --중첩 반복문
	 * => 반복문에 레이블 지정방법
	 * => break 레이블명;
	 * =>continue 레이블명;
	 * 
	 */
	
	public static void main(String[] args) {
		int[] lottos = new int[6];
		int uniqueLength = 0;
		
		int randomNo;
		outerLoop:
		while(uniqueLength < 6) {
			randomNo = getLottoNo();
			
			for (int index = 0; index < uniqueLength; index++) {
				if (lottos[index] == randomNo) {
					continue outerLoop;
				}
			}
			
			lottos[uniqueLength++] = randomNo;
		}
		
		System.out.print("[1등 당첨예약 번호] ");
		for (int index = 0; index < lottos.length; index++) {
			System.out.print(lottos[index] + "\t");
		}
		System.out.println();
		
	}

	public static int getLottoNo() {
		Random random = new Random((long)(Math.random() * System.nanoTime()));
		return random.nextInt(45) + 1;
	}
	
}
