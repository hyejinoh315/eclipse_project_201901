package MyCafe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ֹ��� extends JFrame implements Runnable{
	private static final long serialVersionUID = -2059757954717266976L;
	
	public �ֹ���() {
		setTitle("-- �� �� �� --");
		setSize(300, 400);
		setResizable(false);
		//setLocationRelativeTo(null); ȭ�� ��� ����
		setLocation(1900,300);
		setAlwaysOnTop(true); //�׻� �� ���� ǥ���ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel j1 = new JLabel();
		JLabel j2 = new JLabel();
		j1.setText(Main.m);
		j2.setText(Main.b);
		this.add(j1);				//�մ��� �ֹ��� ���� �ֹ����� ��´�
		this.add(j2);				//�մ��� ���� �ֹ������� �����ǰ� ..??....
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		setVisible(true);
	}
	public void close() {
		setVisible(false); // ���̱� ������
		dispose(); //Destroy the JFrame object
	}
}
