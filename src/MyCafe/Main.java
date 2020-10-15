package MyCafe;

// Random, Scanner 둘 다 사용한다면 *로 선언하는게 코드가 짧아짐
import java.util.Scanner;

import Customer._깐깐;
import Customer._단골;
import Customer._손님;
import Customer._전문가;
import MiniGame.Game;

public class Main {
	public static int 평판 = 0; // 초기 평판
	public static String name = "트럭"; // 트럭에서 시작
	public static int 체력 = 100; // 초기 체력
	public static String m;
	public static String b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		clear c = new clear(); // 화면을 말끔하게 지운다
		매장 매장 = new 매장(); // 매장 클래스 사용선언 -> 게임 방법, 현재 상태, 업그레이드, 인사와 제조(매장내 반복동작)
		_손님 일반 = new _손님(); // 손님 클래스 사용선언 -> 주문, 만족, 화내기(반복동작)
		_단골 단골 = new _단골();
		_깐깐 깐깐 = new _깐깐();
		_전문가 전문가 = new _전문가();
		_날씨 날씨 = new _날씨(); // 날씨 클래스 사용 선언 -> 확률에 따라 날씨 랜덤 발생(반복동작)
		// int sec = 0; // 스레드사용->초단위로 영업시간이 빠질거기 때문
		int n; // 키보드 입력값
		c.clean();
		System.out.println("\r\n" + " .___  ___. ____    ____      ______      ___       _______  _______ \r\n"
				+ " |   \\/   | \\   \\  /   /     /      |    /   \\     |   ____||   ____|\r\n"
				+ " |  \\  /  |  \\   \\/   /     |  ,----'   /  ^  \\    |  |__   |  |__   \r\n"
				+ " |  |\\/|  |   \\_    _/      |  |       /  /_\\  \\   |   __|  |   __|  \r\n"
				+ " |  |  |  |     |  |        |  `----. /  _____  \\  |  |     |  |____ \r\n"
				+ " |__|  |__|     |__|         \\______|/__/     \\__\\ |__|     |_______|\r\n");
		System.out.println("  .___________.____    ____   ______   ______     ______   .__   __. \r\n"
				+ "  |           |\\   \\  /   /  /      | /  __  \\   /  __  \\  |  \\ |  | \r\n"
				+ "  `---|  |----` \\   \\/   /  |  ,----'|  |  |  | |  |  |  | |   \\|  | \r\n"
				+ "      |  |       \\_    _/   |  |     |  |  |  | |  |  |  | |  . `  | \r\n"
				+ "      |  |         |  |     |  `----.|  `--'  | |  `--'  | |  |\\   | \r\n"
				+ "      |__|         |__|      \\______| \\______/   \\______/  |__| \\__| \r\n"
				+ "                                                                   ");
		System.out.println("\n-트럭장사로 시작해서 나만의 매장을 꾸려 보세요!-\n");
		로딩 l = new 로딩("■■");
		l.start();
		try {
			l.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Music bgm = new Music("BGM2.mp3", true);
		bgm.start();
		System.out.println("\n운영하실 카페 이름을 입력해 주세요.");
		String 카페이름 = sc.next(); // 사용자가 콘솔에 입력한 값을 카페명으로 지정
		c.clean();
		System.out.println("===========================================================================");

		home: for (int day = 1; day < 31; day++) { // 1일부터 30일까지 오픈은 반복된다

			if (평판 > 99)
				break; // 평판이 100 이상되면 해피엔딩을 맞이하므로 반복문을 종료한다
			else if (평판 < -9)
				break; // 이하동문
			System.out.println("[HOME]\n카페 오픈 " + day + "일차 입니다.\n무엇을 하시겠습니까?");
			System.out.println("  1. 게임 방법\n  2. 매장 업그레이드\n  3. 현재 상태\n  4. 매장 오픈\n  5. 휴식 (영업 종료)");
			System.out.println("  6. BGM ON/OFF");
			if (체력 <= 30)
				System.out.println("\n ※체력이 부족하므로 휴식을 권장합니다.\n　 현재 체력 : " + 체력 + "/100");
			n = sc.nextInt(); // 오픈 전 준비해야 할 사항들을 선택합니다

			if (n == 1) { // 게임방법을 안내합니다
				매장.방법();
				System.out.println("숫자키를 입력하면 [HOME]으로 돌아갑니다.\n");
				n = sc.nextInt();
				c.clean();
				day--;
				continue home;
			} else if (n == 2) {
				name = 매장.UP(name, 평판);
				System.out.println("숫자키를 입력하면 [HOME]으로 돌아갑니다.\n");
				n = sc.nextInt();
				c.clean();
				day--;
				continue home;
			} else if (n == 3) { // 상태를 확인합니다
				매장.상태(평판, day, name, 카페이름, 체력);
				System.out.println("숫자키를 입력하면 [HOME]으로 돌아갑니다.\n");
				n = sc.nextInt();
				c.clean();
				day--;
				continue home;
			} else if (n == 4) { // ?일차 매장을 오픈합니다
				if (체력 <= 20) {
					System.out.println("체력이 20 이하면 매장을 오픈할 수 없습니다.\n현재체력 : " + 체력);
					System.out.println("숫자키를 입력하면 [HOME]으로 돌아갑니다.\n");
					n = sc.nextInt();
					c.clean();
					day--;
					continue home;
				} else {
					int 손님수 = 날씨.날씨(체력); // 날씨 클래스에서 리턴된 값을 받습니다
					if (손님수 == 0 && 체력 <= 80) {
						체력 += 20; // 태풍때문에 쉬었으면 체력 +20
					} else if (손님수 == 0 && 체력 > 80) {
						체력 = 100;
					} else {
						체력 -= 10; // 오픈하면 일단 체력이 깎임 -10
						if (체력 <= 50) {
							System.out.println(
									"===========================================================================");
							System.out.println("『 체력이 많이 달리네.. 내일 하루는 좀 쉬어야 겠는걸..? 』");
						}
						for (int n1 = 0; n1 < 손님수; n1++) { // 손님수에 따라 입장이 반복됩니다
							if (평판 > 99)
								break; // 평판이 100 이상되면 해피엔딩을 맞이하므로 반복문을 종료한다
							else if (평판 < -9)
								break; // 이하동문
							System.out.println(
									"===========================================================================");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							//주문서 주문 = new 주문서();
							//Thread t = new Thread(주문);
							Music 띵동 = new Music("띵동.mp3", false);
							띵동.start();
							System.out.println("\n\n              ☆★ 손님 입장 ★☆ ");
							try {
								Thread.sleep(400);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							매장.인사(카페이름);
							try {
								Thread.sleep(400);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							// 랜덤 수 생성해서 트럭 - 일반1, 작은 - 일반1 단골2, 브런치 - 일반1 단골2 깐깐3, 다이닝 - 일반1 단골2 깐깐3 전문가4
							int r;
							if (name == "트럭") {
								r = (int) (Math.random() * 1); // 일반손님 뿐이어서 난수 1개 생성 0
							} else if (name == "작은") {
								r = (int) (Math.random() * 2); // 일반+단골 난수 2개 생성 0~1
							} else if (name == "브런치") {
								r = (int) (Math.random() * 3); // 일반+단골+깐깐 난수 3개 생성 0~2
							} else {
								r = (int) (Math.random() * 4); // +전문가 난수 4개 생성 0~3
							}
							if (r == 0) {
//								for (int t = 0; t < 5; t++) {
//									System.out.println(t);
//								}
								try {
									Thread.sleep(600);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								System.out.println("『 처음 본 손님인듯 하다... 첫인상이 좋아야 단골이 되는 법! 실수하지 말자 』");
								m = 일반.주문(name); // 주문 후 리턴된 값을 m에 담는다
								if (m == "베이글" || m == "샌드위치" || m == "케이크" || m == "파스타" || m == "스테이크") {
									b = 일반.재주문(name);
									//t.start();
									String 제조 = 매장.다중제조();
									if (제조.equals(m + b)) { // 주문받은값(m)과 제조(입력받은 문자)가 동일한지 확인하기
										평판 = 일반.만족(평판);
										체력 -= 2;
										//주문.close();
									} else {
										평판 = 일반.화냄(평판);
										체력 -= 10;
										//주문.close();
									}
								} else {
									//t.start();
									System.out.println();
									String 제조 = 매장.제조(); // 제조 후 리턴된 값을 제조에 담는다
									if (제조.equals(m)) { // 주문받은값(m)과 제조(입력받은 문자)가 동일한지 확인하기
										평판 = 일반.만족(평판);
										체력 -= 2;
										//주문.close();
									} else {
										평판 = 일반.화냄(평판);
										체력 -= 10;
										//주문.close();
									}
								}
							} else if (r == 1) {
								try {
									Thread.sleep(600);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								System.out.println("『 자주 오시는 단골 고객이네♡ 실수하지 말아야지 』");
								m = 단골.주문(name); // 주문 후 리턴된 값을 m에 담는다
								if (m == "베이글" || m == "샌드위치" || m == "케이크" || m == "파스타" || m == "스테이크") {
									b = 단골.재주문(name);
									String 제조 = 매장.다중제조();
									if (제조.equals(m + b)) { // 주문받은값(m)과 제조(입력받은 문자)가 동일한지 확인하기
										평판 = 단골.만족(평판);
										체력 -= 2;
									} else {
										평판 = 단골.화냄(평판);
										체력 -= 10;
									}
								} else {
									System.out.println();
									String 제조 = 매장.제조(); // 제조 후 리턴된 값을 제조에 담는다
									if (제조.equals(m)) { // 주문받은값(m)과 제조(입력받은 문자)가 동일한지 확인하기
										평판 = 단골.만족(평판);
										체력 -= 2;
									} else {
										평판 = 단골.화냄(평판);
										체력 -= 10;
									}
								}
							} else if (r == 2) {
								try {
									Thread.sleep(600);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								System.out.println("『 되게 깐깐하게 생긴 손님이다... 실수하면 큰일나겠는걸...』");
								m = 깐깐.주문(name); // 주문 후 리턴된 값을 m에 담는다
								if (m == "베이글" || m == "샌드위치" || m == "케이크" || m == "파스타" || m == "스테이크") {
									b = 깐깐.재주문(name);
									String 제조 = 매장.다중제조();
									if (제조.equals(m + b)) { // 주문받은값(m)과 제조(입력받은 문자)가 동일한지 확인하기
										평판 = 깐깐.만족(평판);
										체력 -= 2;
									} else {
										평판 = 깐깐.화냄(평판);
										체력 -= 10;
									}
								} else {
									System.out.println();
									String 제조 = 매장.제조(); // 제조 후 리턴된 값을 제조에 담는다
									if (제조.equals(m)) { // 주문받은값(m)과 제조(입력받은 문자)가 동일한지 확인하기
										평판 = 깐깐.만족(평판);
										체력 -= 2;
									} else {
										평판 = 깐깐.화냄(평판);
										체력 -= 10;
									}
								}
							} else if (r == 3) {
								try {
									Thread.sleep(600);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								System.out.println("『 왠지 어디서 본 것 같은 사람인데...? 누구더라...』");
								m = 전문가.주문(name); // 주문 후 리턴된 값을 m에 담는다
								if (m == "베이글" || m == "샌드위치" || m == "케이크" || m == "파스타" || m == "스테이크") {
									b = 전문가.재주문(name);
									String 제조 = 매장.다중제조();
									if (제조.equals(m + b)) { // 주문받은값(m)과 제조(입력받은 문자)가 동일한지 확인하기
										평판 = 전문가.만족(평판);
										체력 -= 2;
									} else {
										평판 = 전문가.화냄(평판);
										체력 -= 10;
									}
								} else {
									System.out.println();
									String 제조 = 매장.제조(); // 제조 후 리턴된 값을 제조에 담는다
									if (제조.equals(m)) { // 주문받은값(m)과 제조(입력받은 문자)가 동일한지 확인하기
										평판 = 전문가.만족(평판);
										체력 -= 2;
									} else {
										평판 = 전문가.화냄(평판);
										체력 -= 10;
									}
								}
							}
							if (체력 <= 0) {
								// 체력이 다 소진되면 응급실으로 넘어가고 3일이 흐른다
								Music 구급차 = new Music("응급실.mp3", false);
								구급차.start();
								System.out.println(
										"\n\n===========================================================================\n\n");
								System.out.println(" ※현재 체력이 " + 체력 + "(으)로 0 이하의 상태입니다.");
								System.out.println("『 뭐지...왜이렇게 어지럽지...』");
								for (int i = 0; i < 5; i++) {
									System.out.println(".");
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
								}
								System.out.println("눈을 떠 보니  새하얀 천장이 보인다. 상황을 보니 정신을 잃고 구급차에 실려온 모양이다.");
								System.out.println(
										"\n\n체력 관리를 소홀히 하여 3일 동안 매장을 운영하지 못했습니다.\n평판을 (10)잃었습니다.\n체력을 (80)회복하였습니다.");
								System.out.println(
										"===========================================================================\n\n");
								try {
									Thread.sleep(4000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								평판 -= 10;
								day += 2;
								체력 = 80;
								구급차.close();
								continue home;
							}
							System.out.println("\n\n현재 평판 : " + 평판);
							System.out.println("현재 체력 : " + 체력 + "/100");
						}
						Music 일일영업종료 = new Music("정산.mp3", false);
						일일영업종료.start();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				System.out
						.println("\n\n===========================================================================\n\n");
			} else if (n == 5) { // 휴식을 선택합니다. 운영을 종료하고 체력을 회복합니다. 미니게임 구현하고싶다....
				if (체력 > 50) {
					c.clean();
					System.out.println("※체력이 50 이상이면 쉴 수 없습니다.※");
					System.out.println("현재 체력 : " + 체력 + "/100\n\n\n");
					day--;
					continue home;
				} else {
					c.clean();
					System.out
							.println("\n\n===========================================================================");
					System.out.println("『 집에 가서 쉴까? 오락실을 갈까? 게임이 잘 안풀리면 짜증나는데..』\n");
					Game 게임 = new Game();
					체력 = 게임.Run(체력);
					System.out
							.println("\n\n===========================================================================");
					System.out.println("현재 체력 : " + 체력 + "/100");
					System.out
							.println("===========================================================================\n\n");
				}
			} else if (n == 6) {
				if (/* 음악 실행중이라면 */bgm.isAlive()) {
					bgm.close();// 음악이멈춘다
					c.clean();
					System.out.println("---BGM을 [OFF]합니다---\n\n");
					day--;
					continue home;
				} else {// 음악 재실행
					bgm = new Music("BGM2.mp3", true);
					bgm.start();
				}
				c.clean();
				System.out.println("---BGM을 [ON]합니다---\n\n");
				day--;
				continue home;
			} else {
				c.clean();
				System.out.println("※올바른 번호를 입력해 주세요※\n");
				day--;
				continue home;
			}
		} // 엔딩 실행구간
		엔딩 끝 = new 엔딩();
		if (평판 > 99)
			끝.해피();
		else if (평판 < 51 || 평판 < -9)
			끝.배드(평판);
		else if (평판 > 50 && 평판 < 100)
			끝.노멀();
		sc.close();
		bgm.close();
	}
}
