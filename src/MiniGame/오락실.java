package MiniGame;

public class ������ extends �޽� {

	public ������(int startX, int startY) {
		super(startX, startY, 0);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() * 4);
		Game.array[x][y] = '��'; // ���� ��ǥ�� �ƹ��͵� ���� �س��´�.
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
	} // �ٲ� ��ǥ�� �ٽ� ��� �Է�.

	@Override
	public char getShape() {
		// TODO Auto-generated method stub
		return 'G';
	}

}
