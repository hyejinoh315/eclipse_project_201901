package MiniGame;

public class 오락실 extends 휴식 {

	public 오락실(int startX, int startY) {
		super(startX, startY, 0);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() * 4);
		Game.array[x][y] = '▒'; // 현재 좌표에 아무것도 없게 해놓는다.
		switch (num) {
		case 0:
			if (y == 0)
				y = 0;
			break;
		case 1:
			if (x == 9)
				x = 9;
			break;
		case 2:
			if (x == 0)
				x = 0;
			break;
		case 3:
			if (y == 19)
				y = 19;
			break;
		default:
			System.out.println("error");
		}
		Game.array[x][y] = getShape();
	} // 바뀐 좌표에 다시 모양 입력.

	@Override
	public char getShape() {
		// TODO Auto-generated method stub
		return 'G';
	}

}
