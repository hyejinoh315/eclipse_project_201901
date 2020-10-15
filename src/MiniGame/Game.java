package MiniGame;

import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);

	사람 나;
	체력 hp;
//	깡패 a;
	오락실 g;
	public static char array[][] = new char[5][10];

	public void Set() { // 게임 초기 설정
		int x = (int) (Math.random() * 9) + 1;
		int y = (int) (Math.random() * 4) + 1;
		나 = new 사람(0, 0, 1); // 처음 위치 (0, 0), 이동 거리 1.
		hp = new 체력(4, 9);
		g = new 오락실(y, x);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = '▒';
			}
		}
		array[나.x][나.y] = 나.getShape();
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

	public void WinArray() { // 이겼을 경우 보여줄 배열(Bear가 Fish 먹은 상태에서 그 좌표에 Bear 모양 삽입)
		array[나.x][나.y] = 나.getShape();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	public int Run(int 체력) {
		Set();

		while (true) {
			for (int i = 0; i < 5; i++) {
				ShowArray();
				나.move();

//				if ((나.collide(a)) == true) {
//					System.out.println("앗!! 불량배를 만났습니다.\n스트레스를 받아서 체력이 회복되지 않았습니다.");
//					return 체력;
//				}
				if ((나.collide(g)) == true) {
					System.out.println("\n오락실에 들렀습니다.");
					int x = (int) (Math.random() * 3);
					if (x == 0) { // 33%의 확률로 게임에 승리
						System.out.println("\n\n게임에 이겨서 스트레스가 모두 풀렸습니다.\n체력이 100이 되었습니다.\n\n");
						체력 = 100;
						return 체력;
					} else { // 66%의 확률로 게임이 잘 안풀림
						System.out.println("\n\n『 오늘 게임이 잘 안풀리네..』\n스트레스가 덜 풀려 체력이 60이 되었습니다.\n\n");
						체력 = 60;
						return 체력;
					}
				}
				if ((나.collide(hp)) == true) {
					WinArray();
					System.out.println("\n집에서 휴식하여 체력을 회복합니다.\n체력이 80이 되었습니다.\n\n"); // 체력 회복 고정값 80
					체력 = 80;
					return 체력;
				}
			}
		}
	}
}
