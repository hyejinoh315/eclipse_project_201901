package MyCafe;

import java.util.Scanner;

public class »§Á¦Á¶ extends Thread {
	Scanner sc = new Scanner(System.in);

	public String Á¦Á¶() {
		Time t = new Time(Main.name);
		t.start();
		if(t.test == 99)
			return "";
		System.out.println("  1. »§²¨³»±â\n  else. µ¹¾Æ°¡±â");
		if(t.test == 99)
			return "";
		int n = sc.nextInt();
		if(t.test == 99)
			return "";
		if (n == 1) {
			if(t.test == 99)
				return "";
			System.out.println("»§À» ¼±ÅÃÇÏ¼¼¿ä.\n  1. »÷µåÀ§Ä¡\n  2. º£ÀÌ±Û\n  3. ÄÉÀÌÅ©\n  else. µ¹¾Æ°¡±â");
			if(t.test == 99)
				return "";
			n = sc.nextInt();
			if(t.test == 99)
				return "";
			// ¼îÄÉÀÌ½º¿­±â ÀÌ¹ÌÁö ¶ç¿ì±â
			if (n == 1) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("»§²¨³»±â", "»§", 600, 600);
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
				return "»÷µåÀ§Ä¡";
			} else if (n == 2) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("»§²¨³»±â", "»§", 600, 600);
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
				return "º£ÀÌ±Û";
			} else if (n == 3) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("»§²¨³»±â", "»§", 600, 600);
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
				return "ÄÉÀÌÅ©";
			}
		}
		if(t.test == 99)
			return "";
		return "´Ù½Ã";
	}

}
