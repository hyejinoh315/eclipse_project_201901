package MyCafe;

public class Time extends Thread {

	int sec;
	static int n = 5;
	int test;
	
	public Time(String name) {
//		if(name.equals("Ʈ��")) // Ʈ���� ��ð��� �����Ѵ�
//			n = 10;
//		else if (name.equals("����")) // ����ī���� ��ð��� �����Ѵ�
//			n = 20;
//		else if (name.equals("�귱ġ")) // �귱ġī���� ��ð��� �����Ѵ�
//			n = 30;
//		else if (name.equals("���̴�")) // ���̴�ī���� ��ð��� �����Ѵ�
//			n = 4;
	}
	
	@Override
	public void run() {
		for (sec = 0; sec < n; sec++) {
			//System.out.print(sec);/*�׽�Ʈ*/
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Time.interrupted(); // over
		test = 99;
	}
	
	public void over() {
	}
	
	public void show() { // ���� �ð��� �����ش�
	}
}
