package MyCafe;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class 주문서 extends JFrame implements Runnable{
	private static final long serialVersionUID = -2059757954717266976L;
	
	public 주문서() {
		setTitle("-- 주 문 서 --");
		setSize(300, 400);
		setResizable(false);
		//setLocationRelativeTo(null); 화면 가운데 정렬
		setLocation(1900,300);
		setAlwaysOnTop(true); //항상 맨 위에 표시하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel j1 = new JLabel();
		JLabel j2 = new JLabel();
		j1.setText(Main.m);
		j2.setText(Main.b);
		this.add(j1);				//손님이 주문한 값을 주문서에 담는다
		this.add(j2);				//손님이 가면 주문서에서 삭제되고 ..??....
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		setVisible(true);
	}
	public void close() {
		setVisible(false); // 보이기 꺼지게
		dispose(); //Destroy the JFrame object
	}
}
