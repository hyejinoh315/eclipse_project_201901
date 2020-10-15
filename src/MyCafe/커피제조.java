package MyCafe;

import java.util.Scanner;

public class 커피제조 { // 제조시 효과음
	Scanner sc = new Scanner(System.in);

	// 제조시 시간이 지나면 다른 값을 리턴해버리자
	public String 제조() {
		Time t = new Time(Main.name);
		t.start();
		// 시간이 죽어버리면 리턴값을 다르게 줘서 손님이 떠나버리게 하자
		if(t.test == 99)
			return "";
		int n;
		if(t.test == 99)
			return "";
		System.out.println("  1. 샷내리기\n  else. 돌아가기"); // 주방 선택지로 돌아가는거 만들어야하는데??
		if(t.test == 99)
			return "";
		n = sc.nextInt();
		if(t.test == 99)
			return "";
		if (n == 1) {
			if(t.test == 99)
				return "";
			// 머신 이미지 뜨고 종료(2초?)
			Pics img = new Pics("샷내리기2", "커피", 450, 450);
			if(t.test == 99)
				return "";
			img.run();
			if(t.test == 99) {
				img.close();
				return "";
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(t.test == 99) {
				img.close();
				return "";
			}
			img.close();
			if(t.test == 99)
				return "";
			System.out.println("샷내리기 성공!\n\n커피를 제조합니다.\n  1. 아메리카노\n  2. 라떼\n  else. 돌아가기");
			if(t.test == 99)
				return "";
			n = sc.nextInt();
			if(t.test == 99)
				return "";
			if (n == 1) {
				if(t.test == 99)
					return "";
				return "아메리카노";
			} else if (n == 2) {
				if(t.test == 99)
					return "";
				return "라떼";
			}
		}
		if(t.test == 99)
			return "";
		return "다시";
	}



}
