package MyCafe;

public class �ε� extends Thread {
	String str;
	public �ε� (String str) {
		this.str = str;
	}

	@Override
	public void run() {
		//���� �����帧���� �ϰ���� ��
		System.out.print("�ε���.. ");
		for(int i = 0; i < 25; i++) {
			synchronized(this) {
			System.out.print(str);
			}
			
			try {
				Thread.sleep((int)(Math.random()*110));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println("  100%  �Ϸ�!");
	}

}
