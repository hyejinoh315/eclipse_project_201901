package MyCafe;

import java.util.Scanner;

public class �������� extends Thread {
	Scanner sc = new Scanner(System.in);

	public String ����() {
		Time t = new Time(Main.name);
		t.start();
		if(t.test == 99)
			return "";
		System.out.println("  1. �丮�ϱ�\n  else. ���ư���");
		if(t.test == 99)
			return "";
		int n = sc.nextInt();
		if(t.test == 99)
			return "";
		if (n == 1) {
			if(t.test == 99)
				return "";
			System.out.println("������ �����ϼ���.\n  1. �Ľ�Ÿ\n  2. ������ũ\n  else. ���ư���");
			if(t.test == 99)
				return "";
			n = sc.nextInt();
			if(t.test == 99)
				return "";
			// �丮�̹�����������
			if (n == 1) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("�丮�ϱ�", "�丮", 600, 600);
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
				return "�Ľ�Ÿ";
			} else if (n == 2) {
				if(t.test == 99)
					return "";
				Pics img = new Pics("�丮�ϱ�", "�丮", 600, 600);
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
				return "������ũ";
			}
		}
		if(t.test == 99)
			return "";
		return "�ٽ�";
	}
}
