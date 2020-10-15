package MyCafe;

public class 로딩 extends Thread {
	String str;
	public 로딩 (String str) {
		this.str = str;
	}

	@Override
	public void run() {
		//뭐든 수행흐름에서 하고싶은 것
		System.out.print("로딩중.. ");
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
		}System.out.println("  100%  완료!");
	}

}
