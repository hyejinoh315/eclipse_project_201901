package MyCafe;

// Random, Scanner �� �� ����Ѵٸ� *�� �����ϴ°� �ڵ尡 ª����
import java.util.Scanner;

import Customer._���;
import Customer._�ܰ�;
import Customer._�մ�;
import Customer._������;
import MiniGame.Game;

public class Main {
	public static int ���� = 0; // �ʱ� ����
	public static String name = "Ʈ��"; // Ʈ������ ����
	public static int ü�� = 100; // �ʱ� ü��
	public static String m;
	public static String b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		clear c = new clear(); // ȭ���� �����ϰ� �����
		���� ���� = new ����(); // ���� Ŭ���� ��뼱�� -> ���� ���, ���� ����, ���׷��̵�, �λ�� ����(���峻 �ݺ�����)
		_�մ� �Ϲ� = new _�մ�(); // �մ� Ŭ���� ��뼱�� -> �ֹ�, ����, ȭ����(�ݺ�����)
		_�ܰ� �ܰ� = new _�ܰ�();
		_��� ��� = new _���();
		_������ ������ = new _������();
		_���� ���� = new _����(); // ���� Ŭ���� ��� ���� -> Ȯ���� ���� ���� ���� �߻�(�ݺ�����)
		// int sec = 0; // ��������->�ʴ����� �����ð��� �����ű� ����
		int n; // Ű���� �Է°�
		c.clean();
		System.out.println("\r\n" + " .___  ___. ____    ____      ______      ___       _______  _______ \r\n"
				+ " |   \\/   | \\   \\  /   /     /      |    /   \\     |   ____||   ____|\r\n"
				+ " |  \\  /  |  \\   \\/   /     |  ,----'   /  ^  \\    |  |__   |  |__   \r\n"
				+ " |  |\\/|  |   \\_    _/      |  |       /  /_\\  \\   |   __|  |   __|  \r\n"
				+ " |  |  |  |     |  |        |  `----. /  _____  \\  |  |     |  |____ \r\n"
				+ " |__|  |__|     |__|         \\______|/__/     \\__\\ |__|     |_______|\r\n");
		System.out.println("  .___________.____    ____   ______   ______     ______   .__   __. \r\n"
				+ "  |           |\\   \\  /   /  /      | /  __  \\   /  __  \\  |  \\ |  | \r\n"
				+ "  `---|  |----` \\   \\/   /  |  ,----'|  |  |  | |  |  |  | |   \\|  | \r\n"
				+ "      |  |       \\_    _/   |  |     |  |  |  | |  |  |  | |  . `  | \r\n"
				+ "      |  |         |  |     |  `----.|  `--'  | |  `--'  | |  |\\   | \r\n"
				+ "      |__|         |__|      \\______| \\______/   \\______/  |__| \\__| \r\n"
				+ "                                                                   ");
		System.out.println("\n-Ʈ������ �����ؼ� ������ ������ �ٷ� ������!-\n");
		�ε� l = new �ε�("���");
		l.start();
		try {
			l.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Music bgm = new Music("BGM2.mp3", true);
		bgm.start();
		System.out.println("\n��Ͻ� ī�� �̸��� �Է��� �ּ���.");
		String ī���̸� = sc.next(); // ����ڰ� �ֿܼ� �Է��� ���� ī������� ����
		c.clean();
		System.out.println("===========================================================================");

		home: for (int day = 1; day < 31; day++) { // 1�Ϻ��� 30�ϱ��� ������ �ݺ��ȴ�

			if (���� > 99)
				break; // ������ 100 �̻�Ǹ� ���ǿ����� �����ϹǷ� �ݺ����� �����Ѵ�
			else if (���� < -9)
				break; // ���ϵ���
			System.out.println("[HOME]\nī�� ���� " + day + "���� �Դϴ�.\n������ �Ͻðڽ��ϱ�?");
			System.out.println("  1. ���� ���\n  2. ���� ���׷��̵�\n  3. ���� ����\n  4. ���� ����\n  5. �޽� (���� ����)");
			System.out.println("  6. BGM ON/OFF");
			if (ü�� <= 30)
				System.out.println("\n ��ü���� �����ϹǷ� �޽��� �����մϴ�.\n�� ���� ü�� : " + ü�� + "/100");
			n = sc.nextInt(); // ���� �� �غ��ؾ� �� ���׵��� �����մϴ�

			if (n == 1) { // ���ӹ���� �ȳ��մϴ�
				����.���();
				System.out.println("����Ű�� �Է��ϸ� [HOME]���� ���ư��ϴ�.\n");
				n = sc.nextInt();
				c.clean();
				day--;
				continue home;
			} else if (n == 2) {
				name = ����.UP(name, ����);
				System.out.println("����Ű�� �Է��ϸ� [HOME]���� ���ư��ϴ�.\n");
				n = sc.nextInt();
				c.clean();
				day--;
				continue home;
			} else if (n == 3) { // ���¸� Ȯ���մϴ�
				����.����(����, day, name, ī���̸�, ü��);
				System.out.println("����Ű�� �Է��ϸ� [HOME]���� ���ư��ϴ�.\n");
				n = sc.nextInt();
				c.clean();
				day--;
				continue home;
			} else if (n == 4) { // ?���� ������ �����մϴ�
				if (ü�� <= 20) {
					System.out.println("ü���� 20 ���ϸ� ������ ������ �� �����ϴ�.\n����ü�� : " + ü��);
					System.out.println("����Ű�� �Է��ϸ� [HOME]���� ���ư��ϴ�.\n");
					n = sc.nextInt();
					c.clean();
					day--;
					continue home;
				} else {
					int �մԼ� = ����.����(ü��); // ���� Ŭ�������� ���ϵ� ���� �޽��ϴ�
					if (�մԼ� == 0 && ü�� <= 80) {
						ü�� += 20; // ��ǳ������ �������� ü�� +20
					} else if (�մԼ� == 0 && ü�� > 80) {
						ü�� = 100;
					} else {
						ü�� -= 10; // �����ϸ� �ϴ� ü���� ���� -10
						if (ü�� <= 50) {
							System.out.println(
									"===========================================================================");
							System.out.println("�� ü���� ���� �޸���.. ���� �Ϸ�� �� ����� �ڴ°�..? ��");
						}
						for (int n1 = 0; n1 < �մԼ�; n1++) { // �մԼ��� ���� ������ �ݺ��˴ϴ�
							if (���� > 99)
								break; // ������ 100 �̻�Ǹ� ���ǿ����� �����ϹǷ� �ݺ����� �����Ѵ�
							else if (���� < -9)
								break; // ���ϵ���
							System.out.println(
									"===========================================================================");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							//�ֹ��� �ֹ� = new �ֹ���();
							//Thread t = new Thread(�ֹ�);
							Music �� = new Music("��.mp3", false);
							��.start();
							System.out.println("\n\n              �١� �մ� ���� �ڡ� ");
							try {
								Thread.sleep(400);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							����.�λ�(ī���̸�);
							try {
								Thread.sleep(400);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							// ���� �� �����ؼ� Ʈ�� - �Ϲ�1, ���� - �Ϲ�1 �ܰ�2, �귱ġ - �Ϲ�1 �ܰ�2 ���3, ���̴� - �Ϲ�1 �ܰ�2 ���3 ������4
							int r;
							if (name == "Ʈ��") {
								r = (int) (Math.random() * 1); // �Ϲݼմ� ���̾ ���� 1�� ���� 0
							} else if (name == "����") {
								r = (int) (Math.random() * 2); // �Ϲ�+�ܰ� ���� 2�� ���� 0~1
							} else if (name == "�귱ġ") {
								r = (int) (Math.random() * 3); // �Ϲ�+�ܰ�+��� ���� 3�� ���� 0~2
							} else {
								r = (int) (Math.random() * 4); // +������ ���� 4�� ���� 0~3
							}
							if (r == 0) {
//								for (int t = 0; t < 5; t++) {
//									System.out.println(t);
//								}
								try {
									Thread.sleep(600);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								System.out.println("�� ó�� �� �մ��ε� �ϴ�... ù�λ��� ���ƾ� �ܰ��� �Ǵ� ��! �Ǽ����� ���� ��");
								m = �Ϲ�.�ֹ�(name); // �ֹ� �� ���ϵ� ���� m�� ��´�
								if (m == "���̱�" || m == "������ġ" || m == "����ũ" || m == "�Ľ�Ÿ" || m == "������ũ") {
									b = �Ϲ�.���ֹ�(name);
									//t.start();
									String ���� = ����.��������();
									if (����.equals(m + b)) { // �ֹ�������(m)�� ����(�Է¹��� ����)�� �������� Ȯ���ϱ�
										���� = �Ϲ�.����(����);
										ü�� -= 2;
										//�ֹ�.close();
									} else {
										���� = �Ϲ�.ȭ��(����);
										ü�� -= 10;
										//�ֹ�.close();
									}
								} else {
									//t.start();
									System.out.println();
									String ���� = ����.����(); // ���� �� ���ϵ� ���� ������ ��´�
									if (����.equals(m)) { // �ֹ�������(m)�� ����(�Է¹��� ����)�� �������� Ȯ���ϱ�
										���� = �Ϲ�.����(����);
										ü�� -= 2;
										//�ֹ�.close();
									} else {
										���� = �Ϲ�.ȭ��(����);
										ü�� -= 10;
										//�ֹ�.close();
									}
								}
							} else if (r == 1) {
								try {
									Thread.sleep(600);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								System.out.println("�� ���� ���ô� �ܰ� ���̳ע� �Ǽ����� ���ƾ��� ��");
								m = �ܰ�.�ֹ�(name); // �ֹ� �� ���ϵ� ���� m�� ��´�
								if (m == "���̱�" || m == "������ġ" || m == "����ũ" || m == "�Ľ�Ÿ" || m == "������ũ") {
									b = �ܰ�.���ֹ�(name);
									String ���� = ����.��������();
									if (����.equals(m + b)) { // �ֹ�������(m)�� ����(�Է¹��� ����)�� �������� Ȯ���ϱ�
										���� = �ܰ�.����(����);
										ü�� -= 2;
									} else {
										���� = �ܰ�.ȭ��(����);
										ü�� -= 10;
									}
								} else {
									System.out.println();
									String ���� = ����.����(); // ���� �� ���ϵ� ���� ������ ��´�
									if (����.equals(m)) { // �ֹ�������(m)�� ����(�Է¹��� ����)�� �������� Ȯ���ϱ�
										���� = �ܰ�.����(����);
										ü�� -= 2;
									} else {
										���� = �ܰ�.ȭ��(����);
										ü�� -= 10;
									}
								}
							} else if (r == 2) {
								try {
									Thread.sleep(600);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								System.out.println("�� �ǰ� ����ϰ� ���� �մ��̴�... �Ǽ��ϸ� ū�ϳ��ڴ°�...��");
								m = ���.�ֹ�(name); // �ֹ� �� ���ϵ� ���� m�� ��´�
								if (m == "���̱�" || m == "������ġ" || m == "����ũ" || m == "�Ľ�Ÿ" || m == "������ũ") {
									b = ���.���ֹ�(name);
									String ���� = ����.��������();
									if (����.equals(m + b)) { // �ֹ�������(m)�� ����(�Է¹��� ����)�� �������� Ȯ���ϱ�
										���� = ���.����(����);
										ü�� -= 2;
									} else {
										���� = ���.ȭ��(����);
										ü�� -= 10;
									}
								} else {
									System.out.println();
									String ���� = ����.����(); // ���� �� ���ϵ� ���� ������ ��´�
									if (����.equals(m)) { // �ֹ�������(m)�� ����(�Է¹��� ����)�� �������� Ȯ���ϱ�
										���� = ���.����(����);
										ü�� -= 2;
									} else {
										���� = ���.ȭ��(����);
										ü�� -= 10;
									}
								}
							} else if (r == 3) {
								try {
									Thread.sleep(600);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								System.out.println("�� ���� ��� �� �� ���� ����ε�...? ��������...��");
								m = ������.�ֹ�(name); // �ֹ� �� ���ϵ� ���� m�� ��´�
								if (m == "���̱�" || m == "������ġ" || m == "����ũ" || m == "�Ľ�Ÿ" || m == "������ũ") {
									b = ������.���ֹ�(name);
									String ���� = ����.��������();
									if (����.equals(m + b)) { // �ֹ�������(m)�� ����(�Է¹��� ����)�� �������� Ȯ���ϱ�
										���� = ������.����(����);
										ü�� -= 2;
									} else {
										���� = ������.ȭ��(����);
										ü�� -= 10;
									}
								} else {
									System.out.println();
									String ���� = ����.����(); // ���� �� ���ϵ� ���� ������ ��´�
									if (����.equals(m)) { // �ֹ�������(m)�� ����(�Է¹��� ����)�� �������� Ȯ���ϱ�
										���� = ������.����(����);
										ü�� -= 2;
									} else {
										���� = ������.ȭ��(����);
										ü�� -= 10;
									}
								}
							}
							if (ü�� <= 0) {
								// ü���� �� �����Ǹ� ���޽����� �Ѿ�� 3���� �帥��
								Music ������ = new Music("���޽�.mp3", false);
								������.start();
								System.out.println(
										"\n\n===========================================================================\n\n");
								System.out.println(" ������ ü���� " + ü�� + "(��)�� 0 ������ �����Դϴ�.");
								System.out.println("�� ����...���̷��� ��������...��");
								for (int i = 0; i < 5; i++) {
									System.out.println(".");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								System.out.println("���� �� ����  ���Ͼ� õ���� ���δ�. ��Ȳ�� ���� ������ �Ұ� �������� �Ƿ��� ����̴�.");
								System.out.println(
										"\n\nü�� ������ ��Ȧ�� �Ͽ� 3�� ���� ������ ����� ���߽��ϴ�.\n������ (10)�Ҿ����ϴ�.\nü���� (80)ȸ���Ͽ����ϴ�.");
								System.out.println(
										"===========================================================================\n\n");
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								���� -= 10;
								day += 2;
								ü�� = 80;
								������.close();
								continue home;
							}
							System.out.println("\n\n���� ���� : " + ����);
							System.out.println("���� ü�� : " + ü�� + "/100");
						}
						Music ���Ͽ������� = new Music("����.mp3", false);
						���Ͽ�������.start();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				System.out
						.println("\n\n===========================================================================\n\n");
			} else if (n == 5) { // �޽��� �����մϴ�. ��� �����ϰ� ü���� ȸ���մϴ�. �̴ϰ��� �����ϰ�ʹ�....
				if (ü�� > 50) {
					c.clean();
					System.out.println("��ü���� 50 �̻��̸� �� �� �����ϴ�.��");
					System.out.println("���� ü�� : " + ü�� + "/100\n\n\n");
					day--;
					continue home;
				} else {
					c.clean();
					System.out
							.println("\n\n===========================================================================");
					System.out.println("�� ���� ���� ����? �������� ����? ������ �� ��Ǯ���� ¥�����µ�..��\n");
					Game ���� = new Game();
					ü�� = ����.Run(ü��);
					System.out
							.println("\n\n===========================================================================");
					System.out.println("���� ü�� : " + ü�� + "/100");
					System.out
							.println("===========================================================================\n\n");
				}
			} else if (n == 6) {
				if (/* ���� �������̶�� */bgm.isAlive()) {
					bgm.close();// �����̸����
					c.clean();
					System.out.println("---BGM�� [OFF]�մϴ�---\n\n");
					day--;
					continue home;
				} else {// ���� �����
					bgm = new Music("BGM2.mp3", true);
					bgm.start();
				}
				c.clean();
				System.out.println("---BGM�� [ON]�մϴ�---\n\n");
				day--;
				continue home;
			} else {
				c.clean();
				System.out.println("�ؿùٸ� ��ȣ�� �Է��� �ּ����\n");
				day--;
				continue home;
			}
		} // ���� ���౸��
		���� �� = new ����();
		if (���� > 99)
			��.����();
		else if (���� < 51 || ���� < -9)
			��.���(����);
		else if (���� > 50 && ���� < 100)
			��.���();
		sc.close();
		bgm.close();
	}
}
