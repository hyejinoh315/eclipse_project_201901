package MyCafe;

import java.util.Scanner;

public class Ŀ������ { // ������ ȿ����
	Scanner sc = new Scanner(System.in);

	// ������ �ð��� ������ �ٸ� ���� �����ع�����
	public String ����() {
		Time t = new Time(Main.name);
		t.start();
		// �ð��� �׾������ ���ϰ��� �ٸ��� �༭ �մ��� ���������� ����
		if(t.test == 99)
			return "";
		int n;
		if(t.test == 99)
			return "";
		System.out.println("  1. ��������\n  else. ���ư���"); // �ֹ� �������� ���ư��°� �������ϴµ�??
		if(t.test == 99)
			return "";
		n = sc.nextInt();
		if(t.test == 99)
			return "";
		if (n == 1) {
			if(t.test == 99)
				return "";
			// �ӽ� �̹��� �߰� ����(2��?)
			Pics img = new Pics("��������2", "Ŀ��", 450, 450);
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
			System.out.println("�������� ����!\n\nĿ�Ǹ� �����մϴ�.\n  1. �Ƹ޸�ī��\n  2. ��\n  else. ���ư���");
			if(t.test == 99)
				return "";
			n = sc.nextInt();
			if(t.test == 99)
				return "";
			if (n == 1) {
				if(t.test == 99)
					return "";
				return "�Ƹ޸�ī��";
			} else if (n == 2) {
				if(t.test == 99)
					return "";
				return "��";
			}
		}
		if(t.test == 99)
			return "";
		return "�ٽ�";
	}



}
