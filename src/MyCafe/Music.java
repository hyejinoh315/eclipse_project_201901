package MyCafe;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Music extends Thread {
		
	private Player player;
	// 자바 줌 사이트의 라이브러리 중 하나
	private boolean isLoop; // 현재 곡이 무한반복인지 한번만 재생되는지
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			// 뮤직 안의 파일의 위치를 가져올 수 있다
			fis = new FileInputStream(file);// 해당 파일을 버퍼에 담아 읽어올 수 있도록 한다
			bis = new BufferedInputStream(fis);
			player = new Player(bis);// 해당 파일을 담을 수있도록 한다
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() { // 현재 실행되고 있는 음악이 어떤 위치에 실행되고 있나?
		if (player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() { // 언제든 곡 종료가 가능하게 끔
		isLoop = false;
		player.close();
		this.interrupt(); // 곡을 종료해주는 것
	}
	
	@Override
	public void run() { // 쓰레드 상속시 무조건 사용
		try {
			do {
				player.play();
				fis = new FileInputStream(file);// 해당 파일을 버퍼에 담아 읽어올 수 있도록 한다
				bis = new BufferedInputStream(fis);
				player = new Player(bis);// 해당 파일을 담을 수있도록 한다
			}while(isLoop);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
