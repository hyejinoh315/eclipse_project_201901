package MyCafe;

public class Time extends Thread {

	int sec;
	static int n = 5;
	int test;
	
	public Time(String name) {
//		if(name.equals("트럭")) // 트럭의 운영시간을 설정한다
//			n = 10;
//		else if (name.equals("작은")) // 작은카페의 운영시간을 설정한다
//			n = 20;
//		else if (name.equals("브런치")) // 브런치카페의 운영시간을 설정한다
//			n = 30;
//		else if (name.equals("다이닝")) // 다이닝카페의 운영시간을 설정한다
//			n = 4;
	}
	
	@Override
	public void run() {
		for (sec = 0; sec < n; sec++) {
			//System.out.print(sec);/*테스트*/
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
	
	public void show() { // 현재 시간을 보여준다
	}
}
