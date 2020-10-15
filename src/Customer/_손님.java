package Customer;

import java.util.Random;

public class _손님 extends Thread {
	Random ran = new Random();

	String nameC; // 일반손님
	String m = null;
	String b = null;

	public _손님() {
		this.nameC = "지나가던 손님";
	}

	public String 주문(String name) { // 매장명 따라 다른 메뉴배열을 갖는다
		//String f = null; 리스트 공부하기!******	
		if (name.equals("트럭")) {
			String[] menu = { "아메리카노", "라떼" };
			m = menu[ran.nextInt(menu.length)];
			System.out.print("\n\n  " + nameC + " - " + m + " 주세요."); // 랜덤값을 줘서 주어진 메뉴중에 랜덤으로 실행시키기
		} else if (name.equals("작은")) {
			String[] menu = { "아메리카노", "라떼", "딸기주스", "키위주스", "토마토주스" };
			m = menu[ran.nextInt(menu.length)];
			System.out.print("\n\n  " + nameC + " - " + m + " 주세요."); // 랜덤값을 줘서 주어진 메뉴중에 랜덤으로 실행시키기
		} else if (name.equals("브런치")) {
			String[] menu = { "아메리카노", "라떼", "딸기주스", "키위주스", "토마토주스", "베이글", "샌드위치", "케이크" };
			m = menu[ran.nextInt(menu.length)];
			System.out.print("\n\n  " + nameC + " - " + m + " 주세요."); // 랜덤값을 줘서 주어진 메뉴중에 랜덤으로 실행시키기
		} else if (name.equals("다이닝")) {
			String[] menu = { "아메리카노", "라떼", "딸기주스", "키위주스", "토마토주스", "베이글", "샌드위치", "케이크", "파스타", "스테이크" };
			m = menu[ran.nextInt(menu.length)];
			System.out.print("\n\n  " + nameC + " - " + m + " 주세요."); // 랜덤값을 줘서 주어진 메뉴중에 랜덤으로 실행시키기
		}
		return m; // 손님이 주문한 메뉴 고정값 리턴
	}
	
	public String 재주문(String name) { // 매장명 따라 다른 메뉴배열을 갖는다
		//String f = null; 리스트 공부하기!******	
		if (name.equals("트럭")||name.equals("작은")) {
		} else {
			String[] menu = { "아메리카노", "라떼", "딸기주스", "키위주스", "토마토주스" };
			b = menu[ran.nextInt(menu.length)];
			System.out.println("\n\n  " + nameC + " - 음료는 " + b + "로 주세요."); // 랜덤값을 줘서 주어진 메뉴중에 랜덤으로 실행시키기
		}
		return b; // 손님이 주문한 메뉴 고정값 리턴
	}

	public int 만족(int 평판) {
		System.out.println("\n\n  "+ nameC +" - 감사합니다. 수고하세요^o^");
		평판++;
		return 평판;
	}

	public int 화냄(int 평판) {
		System.out.println("\n\n  "+ nameC +" - Oh My God! 다시는 안 올줄 알아요!\n\n\n손님이 화를 내고 떠나버렸습니다.");
		평판 -= 2;
		return 평판;
	}
	
//	public void run() {
//		주문(카페운영.name);
//		//10초 기다리는 중에 메뉴가 제대로 나오면 만족한다
//		if (m == "베이글" || m == "샌드위치" || m == "케이크" || m == "파스타" || m == "스테이크") {
//			재주문(카페운영.name);
//			
//			if (카페운영.제조.equals(m + b)) { // 주문받은값(m)과 제조(입력받은 문자)가 동일한지 확인하기
//			만족(카페운영.평판);
//			}
//			//잘못 나오거나 10초넘어가면 화내며 떠난다
//			화냄(카페운영.평판);
//		}
//		
//		
//		만족(카페운영.평판);
//		
//		//잘못 나오거나 10초넘어가면 화내며 떠난다
//		화냄(카페운영.평판);
//	}
}
