package MyCafe;

import java.util.Scanner;

public class 음식제조 extends Thread {
	Scanner sc = new Scanner(System.in);

	public String 제조() {
		Time t = new Time(Main.name);
		t.start();
		if(t.test == 99)
			return "";
		System.out.println("  1. 요리하기\n  else. 돌아가기");
		if(t.test == 99)
			return "";
		int n = sc.nextInt();
		if(t.test == 99)
			return "";
		if (n == 1) {
			if(t.test == 99)
				return "";
			System.out.println("음식을 선택하세요.\n  1. 파스타\n  2. 스테이크\n  else. 돌아가기");
			if(t.test == 99)
				return "";
			n = sc.nextInt();
			if(t.test == 99)
				return "";
			// 요리이미지띄우고종료
			if (n == 1) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("요리하기", "요리", 600, 600);
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
				return "파스타";
			} else if (n == 2) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("요리하기", "요리", 600, 600);
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
				return "스테이크";
			}
		}
		if(t.test == 99)
			return "";
		return "다시";
	}
}
