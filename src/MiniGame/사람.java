package MiniGame;

import java.util.Scanner;

import MyCafe.clear;

public class 사람 extends 휴식 {
	
	clear c = new clear();
	
	public 사람(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}

	@SuppressWarnings("resource")
	@Override
	public void move() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >> ");
		String direction = sc.next();

		Game.array[x][y] = '▒'; // 현재 좌표에 아무것도 없게 해놓는다.

		switch (direction) {
		case "a":
			if (y == 0)
				y = 0;
			else
				y -= distance;
			break;
		case "s":
			if (x == 9)
				x = 9;
			else
				x += distance;
			break;
		case "w":
			if (x == 0)
				x = 0;
			else
				x -= distance;
			break;
		case "d":
			if (y == 19)
				y = 19;
			else
				y += distance;
			break;

		default:
			c.clean();
			System.out.println("\n※asdw만 입력해 주세요.");
		}
		c.clean();
		Game.array[x][y] = getShape();
	} // 바뀐 좌표에 다시 모양 입력.

	@Override
	public char getShape() {
		// TODO Auto-generated method stub
		return '!';
	}
}
