package MyCafe;

import java.util.Scanner;

public class 주스제조 extends Thread {
	Scanner sc = new Scanner(System.in);

	public String 제조() {
		Time t = new Time(Main.name);
		t.start();
		if(t.test == 99)
			return "";
		System.out.println("  1. 주스갈기\n  else. 돌아가기");
		if(t.test == 99)
			return "";
		int n = sc.nextInt();
		if(t.test == 99)
			return "";
		if (n == 1) {
			if(t.test == 99)
				return "";
			System.out.println("과일을 선택하세요.\n  1. 딸기\n  2. 키위\n  3. 토마토\n  else. 돌아가기");
			if(t.test == 99)
				return "";
			n = sc.nextInt();
			if(t.test == 99)
				return "";
			// 믹서기 이미지 띄우기
			if (n == 1) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("주스갈기4", "주스", 500, 500);
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
				return "딸기주스";
			} else if (n == 2) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("주스갈기4", "주스", 500, 500);
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
				return "키위주스";
			} else if (n == 3) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("주스갈기4", "주스", 500, 500);
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
				return "토마토주스";
			}
		}
		if(t.test == 99)
			return "";
		return "다시";
	}

}
