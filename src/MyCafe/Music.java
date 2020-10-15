package MyCafe;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Music extends Thread {
		
	private Player player;
	// �ڹ� �� ����Ʈ�� ���̺귯�� �� �ϳ�
	private boolean isLoop; // ���� ���� ���ѹݺ����� �ѹ��� ����Ǵ���
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			// ���� ���� ������ ��ġ�� ������ �� �ִ�
			fis = new FileInputStream(file);// �ش� ������ ���ۿ� ��� �о�� �� �ֵ��� �Ѵ�
			bis = new BufferedInputStream(fis);
			player = new Player(bis);// �ش� ������ ���� ���ֵ��� �Ѵ�
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() { // ���� ����ǰ� �ִ� ������ � ��ġ�� ����ǰ� �ֳ�?
		if (player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() { // ������ �� ���ᰡ �����ϰ� ��
		isLoop = false;
		player.close();
		this.interrupt(); // ���� �������ִ� ��
	}
	
	@Override
	public void run() { // ������ ��ӽ� ������ ���
		try {
			do {
				player.play();
				fis = new FileInputStream(file);// �ش� ������ ���ۿ� ��� �о�� �� �ֵ��� �Ѵ�
				bis = new BufferedInputStream(fis);
				player = new Player(bis);// �ش� ������ ���� ���ֵ��� �Ѵ�
			}while(isLoop);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
