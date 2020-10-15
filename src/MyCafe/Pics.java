package MyCafe;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame; // ctrl+shift+O �ϸ� �ѹ濡 ����


public class Pics extends JFrame implements Runnable{
	private static final long serialVersionUID = 7117967389004114839L;

	private Image screenImage;
	private Graphics screenGraphic;
	private Image pic;
	Music bgm;

	public Pics(String name, String �뷡����, int x, int y) {
		setTitle("������!!");
		setSize(x, y);
		setResizable(false);
		setLocationRelativeTo(null);
		//setLocation(100,100); ��ǥ���� �����ϸ鼭
		setAlwaysOnTop(true); //�׻� �� ���� ǥ���ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		pic = new ImageIcon(Main.class.getResource("../images/"+name+".gif")).getImage();
		bgm = new Music(�뷡����+".mp3", false);
		bgm.start();
		
	}

	public void paint(Graphics g) {
		// �ϳ��� ��ӵ� �޼ҵ�μ�, (,)�������� �̹����� ����� �� �� ��ũ���̹��������� �־���
		screenImage = createImage(600, 600);
		screenGraphic = screenImage.getGraphics();
		//�׷��� ��ü�� ����
		screenDraw(screenGraphic); // �׷��ȿ� ��� �׸��� �׷���		
		g.drawImage(screenImage, 0, 0, null); // 0,0 �� ��ġ�� �׷���
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(pic, 0, 0, null); // 0,0�� ��ġ�� �׷��ְ�
		this.repaint(); // ������Ʈ ���� -> ������ �����Ҷ����� ��� �׸��� �׷��ִ� ����
		// ȭ�� ũ�⸸ŭ �̹����� �����ؼ� �� �޼ҵ带 �̿��ؼ� �׷��ش�
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		setVisible(true);
	}
	
	public void close() {
		setVisible(false); // ���̱� ������
		dispose(); //Destroy the JFrame object
		bgm.close();
	}
	
}
