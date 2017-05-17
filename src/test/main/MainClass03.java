package test.main;

import test.mypac.Beer;

public class MainClass03 {
	public static void main(String[] args) {
		
		// 1. Beer type 데이터를 담을수 있는 방 3개짜리 배열객체를 생성해서
		// 배열 객체의 참조값을 beers 라는 이름의 지역변수에 담아보세요.
		 Beer[] beers = new Beer[3]; 
		
		// 2.Beer 배열의 3개의 방에 Beer 객체의 참조값을 각각 담아보세요.
		 beers[0] = new Beer("에일");
		 beers[1] = new Beer("바이스");
		 beers[2] = new Beer("퉁글래스");
		 
		 // 3. for 문들 이용해서 배열에 저장된 참조값을 tmp 라는 변수에
		 // 순서대로 담아보는 코드를 작성해 보세요.
		 for(int i=0; i<beers.length; i++){
			 Beer tmp = beers[i];
			 // Beer 객체의 메소드 호출하기
			 tmp.drink();
		 }
	}
}
