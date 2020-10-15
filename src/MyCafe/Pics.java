package MyCafe;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame; // ctrl+shift+O 하면 한방에 나옴


public class Pics extends JFrame implements Runnable{
	private static final long serialVersionUID = 7117967389004114839L;

	private Image screenImage;
	private Graphics screenGraphic;
	private Image pic;
	Music bgm;

	public Pics(String name, String 노래제목, int x, int y) {
		setTitle("제조중!!");
		setSize(x, y);
		setResizable(false);
		setLocationRelativeTo(null);
		//setLocation(100,100); 좌표값은 설정하면서
		setAlwaysOnTop(true); //항상 맨 위에 표시하기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		pic = new ImageIcon(Main.class.getResource("../images/"+name+".gif")).getImage();
		bgm = new Music(노래제목+".mp3", false);
		bgm.start();
		
	}

	public void paint(Graphics g) {
		// 하나의 약속된 메소드로서, (,)사이즈의 이미지를 만들어 준 뒤 스크린이미지변수에 넣어줌
		screenImage = createImage(600, 600);
		screenGraphic = screenImage.getGraphics();
		//그래픽 객체를 얻어옴
		screenDraw(screenGraphic); // 그래픽에 어떠한 그림을 그려줌		
		g.drawImage(screenImage, 0, 0, null); // 0,0 에 위치해 그려줌
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(pic, 0, 0, null); // 0,0에 위치해 그려주고
		this.repaint(); // 리페인트 해줌 -> 게임을 종료할때까지 계속 그림을 그려주는 원리
		// 화면 크기만큼 이미지를 생성해서 이 메소드를 이용해서 그려준다
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		setVisible(true);
	}
	
	public void close() {
		setVisible(false); // 보이기 꺼지게
		dispose(); //Destroy the JFrame object
		bgm.close();
	}
	
}
