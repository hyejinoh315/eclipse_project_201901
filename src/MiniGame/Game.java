package MiniGame;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);

	��� ��;
	ü�� hp;
//	���� a;
	������ g;
	public static char array[][] = new char[5][10];

	public void Set() { // ���� �ʱ� ����
		int x = (int) (Math.random() * 9) + 1;
		int y = (int) (Math.random() * 4) + 1;
		�� = new ���(0, 0, 1); // ó�� ��ġ (0, 0), �̵� �Ÿ� 1.
		hp = new ü��(4, 9);
		g = new ������(y, x);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = '��';
			}
		}
		array[��.x][��.y] = ��.getShape();
		array[hp.x][hp.y] = hp.getShape();
		array[g.x][g.y] = g.getShape();
	}

	public void ShowArray() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	public void WinArray() { // �̰��� ��� ������ �迭(Bear�� Fish ���� ���¿��� �� ��ǥ�� Bear ��� ����)
		array[��.x][��.y] = ��.getShape();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	public int Run(int ü��) {
		Set();

		while (true) {
			for (int i = 0; i < 5; i++) {
				ShowArray();
				��.move();

//				if ((��.collide(a)) == true) {
//					System.out.println("��!! �ҷ��踦 �������ϴ�.\n��Ʈ������ �޾Ƽ� ü���� ȸ������ �ʾҽ��ϴ�.");
//					return ü��;
//				}
				if ((��.collide(g)) == true) {
					System.out.println("\n�����ǿ� �鷶���ϴ�.");
					int x = (int) (Math.random() * 3);
					if (x == 0) { // 33%�� Ȯ���� ���ӿ� �¸�
						System.out.println("\n\n���ӿ� �̰ܼ� ��Ʈ������ ��� Ǯ�Ƚ��ϴ�.\nü���� 100�� �Ǿ����ϴ�.\n\n");
						ü�� = 100;
						return ü��;
					} else { // 66%�� Ȯ���� ������ �� ��Ǯ��
						System.out.println("\n\n�� ���� ������ �� ��Ǯ����..��\n��Ʈ������ �� Ǯ�� ü���� 60�� �Ǿ����ϴ�.\n\n");
						ü�� = 60;
						return ü��;
					}
				}
				if ((��.collide(hp)) == true) {
					WinArray();
					System.out.println("\n������ �޽��Ͽ� ü���� ȸ���մϴ�.\nü���� 80�� �Ǿ����ϴ�.\n\n"); // ü�� ȸ�� ������ 80
					ü�� = 80;
					return ü��;
				}
			}
		}
	}
}
