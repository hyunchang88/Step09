package test.main;

import test.mypac.Beer;

public class MainClass05 {
	public static void main(String[] args) {
		String[] names = {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		
		// names 배열을 이용해서 확장 for 문들 구성해 보세요.
		for(String tmp : names){
			// tmp 변수에 참조된 문자열을 콘솔에 출력해보기
			System.out.println(tmp);
		}
		
		// 방 5개 짜리 Beer[] 객체를 생성해서
		// 5개의 방에 Beer 객체의 참조값을 넣고
		// 확장 for 문을 이용해서 Beer 객체의 drink() 메소드를 호출해보세요.
		
		Beer[] beers = new Beer[5];
		beers[0] = new Beer("Hite");
		beers[1] = new Beer("Cass");
		beers[2] = new Beer("ALE");
		beers[3] = new Beer("Vice");
		beers[4] = new Beer("Budweiser");
		for(Beer tmp : beers){
			tmp.drink();
		}
		
//		for(int i=0; i<beers.length; i++){
//			Beer tmp = beers[i];
//			tmp.drink();
//		}
		
	}
}
