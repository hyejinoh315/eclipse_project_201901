package MyCafe;

import java.util.Scanner;

public class 매장 {
	Scanner sc = new Scanner(System.in);

	public void 방법() { // 돈?->업그레이드조건/ 체력...??
		System.out.println("===========================================================================");
		System.out.println("1. 트럭카페로 시작해서 30일동안 카페를 운영하며 평판을 쌓는 게임입니다.");
		//System.out.println("　　메뉴 제조는 키보드 입력으로 진행됩니다.\n");
		System.out.println("2. 30일 이전에 평판이 100일 경우 미션 완료입니다.");
		System.out.println("　　초기 평판은 0 이고, 게임 중 평판이 -10이 되면 배드엔딩을 보게 됩니다.");
		System.out.println("　　30일이 지나고 평판이 100 미만일경우, 평판에 따른 엔딩을 갖게 됩니다.\n");
		System.out.println("3. 손님 타입에 따라 각기 다르게 평판이 올라갑니다.");
		System.out.println("　　또 그에 따라 평판이 깎이기도 합니다. (일정 시간이 지나면 손님이 화를 내고 떠납니다.)\n");
		System.out.println("4. 평판에 따라 매장을 업그레이드 할 수 있습니다.");
		System.out.println("　　매장이 업그레이드 될 때마다 메뉴의 가짓수와 손님 타입이 늘어납니다.\n");
		// System.out.println("00. 카페는 나 혼자 운영하므로 운영중 자리를 비울 수 없습니다.");
		// System.out.println(" 때문에 재고는 운영 전 미니게임을 통해 반드시 확보 바랍니다.");
		// 재고가 없으면 음료나 음식을 제조할 수 없습니다.
		System.out.println("5. 매장을 오픈하면 체력이 -10이 되고 자연재해로 운영을 못 했을 경우 체력이 +20이 됩니다.");
		System.out.println("　　손님이 만족한 경우 체력은 -2가 되지만, 손님이 화를 낼 경우 스트레스를 받게 되어 체력이 -10이 됩니다.\n");
		System.out.println("6. 체력이 0이되면 응급실에 실려가 3일동안 회복기간을 갖습니다.\n" + "　　장기 휴식으로 인해 평판은 -10이 되고, 체력은 80이 됩니다.\n");
		System.out.println("7. 체력이 50 미만이 되면 운영을 접고 하루동안 휴식을 취할 수 있습니다.");
		System.out.println("　　집 -> 체력이 80이 됩니다.\n　　오락실 -> 랜덤으로 결정됩니다.( 100 / 60 )\n");
		System.out.println("8. 오픈 전 날씨는 랜덤확률으로 바뀝니다.");
		System.out.println("　　날씨에 따라 매일 손님의 수가 달라집니다.");
		System.out.println("===========================================================================");
	}

	public void 상태(int 평판, int day, String name, String 카페이름, int 체력) { // name= 트럭, 작은, 브런치, 다이닝
		System.out.println("===========================================================================");
		System.out.println("　　　　　　　　　　　　" + 카페이름 + "(cafe)의 현재 상태를 확인합니다");
		System.out.println("===========================================================================");
		System.out.println("　　[" + name + "]카페\n");
		// System.out.println("현재 판매하는 메뉴 적으면 좋을거같다");
		System.out.println("　　오픈 " + day + "일차\n");
		System.out.println("　　평판 : " + 평판);
		System.out.println("\n　　[나]의 체력 : " + 체력 + "/100");
		System.out.println("===========================================================================");
	}

	public void 인사(String 카페이름) {
		System.out.println("\n어서오세요! " + 카페이름 + " 입니다! 주문 도와드리겠습니다.*^.^*");
	}

	커피제조 커피 = new 커피제조();
	주스제조 주스 = new 주스제조();
	빵제조 빵 = new 빵제조();
	음식제조 음식 = new 음식제조();

	public String 제조() {
		int n;
		String 제조 = "다시"; // 돌아가자!
		System.out.println("\n\n고객이 주문한 메뉴를 제조합니다.");
		do {
			if (Main.name.equals("트럭")) {
				제조 = 커피.제조();
			} else if (Main.name.equals("작은")) {
				System.out.println("어디로 이동할까요?\n  1. 커피머신 앞\n  2. 블렌더 앞");
				n = sc.nextInt();
				if (n == 1) {
					제조 = 커피.제조();
				} else if (n == 2) {
					제조 = 주스.제조();
				}
			} else if (Main.name.equals("브런치")) {
				System.out.println("어디로 이동할까요?\n  1. 커피머신 앞\n  2. 블렌더 앞\n  3. 쇼케이스 앞");
				n = sc.nextInt();
				if (n == 1) {
					제조 = 커피.제조();
				} else if (n == 2) {
					제조 = 주스.제조();
				} else if (n == 3) {
					제조 = 빵.제조();
				}

			} else if (Main.name.equals("다이닝")) {
				System.out.println("어디로 이동할까요?\n  1. 커피머신 앞\n  2. 블렌더 앞\n  3. 쇼케이스 앞\n  4. 주방 안");
				n = sc.nextInt();
				if (n == 1) {
					제조 = 커피.제조();
				} else if (n == 2) {
					제조 = 주스.제조();
				} else if (n == 3) {
					제조 = 빵.제조();
				} else if (n == 4) {
					제조 = 음식.제조();
				}
			}
		} while (제조 == "다시");
		if(제조=="") {}
		else
			System.out.println("\n\n주문하신 " + 제조 + " 나왔습니다~");
		return 제조;
	}

	public String 다중제조() {
		System.out.println("\n\n고객이 주문한 메뉴를 제조합니다. ※순서대로 준비해 주세요※");
		int n;
		String 제조;
		String 제조1 = "다시";
		String 제조2 = "다시";
		do {
			if (Main.name.equals("브런치")) {
				do {
					System.out.println("어디로 이동할까요?\n  1. 커피머신 앞\n  2. 블렌더 앞\n  3. 쇼케이스 앞");
					n = sc.nextInt();
					if (n == 1) {
						제조1 = 커피.제조();
					} else if (n == 2) {
						제조1 = 주스.제조();
					} else if (n == 3) {
						제조1 = 빵.제조();
					}
				} while (제조1 == "다시");
				do {
					System.out.println("어디로 이동할까요?\n  1. 커피머신 앞\n  2. 블렌더 앞\n  3. 쇼케이스 앞");
					n = sc.nextInt();
					if (n == 1) {
						제조2 = 커피.제조();
					} else if (n == 2) {
						제조2 = 주스.제조();
					} else if (n == 3) {
						제조2 = 빵.제조();
					}
				} while (제조2 == "다시");
			} else if (Main.name.equals("다이닝")) {
				do {
					System.out.println("어디로 이동할까요?\n  1. 커피머신 앞\n  2. 블렌더 앞\n  3. 쇼케이스 앞\n  4. 주방 안");
					n = sc.nextInt();
					if (n == 1) {
						제조1 = 커피.제조();
					} else if (n == 2) {
						제조1 = 주스.제조();
					} else if (n == 3) {
						제조1 = 빵.제조();
					} else if (n == 4) {
						제조1 = 음식.제조();
					}
				} while (제조1 == "다시");
				do {
					System.out.println("어디로 이동할까요?\n  1. 커피머신 앞\n  2. 블렌더 앞\n  3. 쇼케이스 앞\n  4. 주방 안");
					n = sc.nextInt();
					if (n == 1) {
						제조2 = 커피.제조();
					} else if (n == 2) {
						제조2 = 주스.제조();
					} else if (n == 3) {
						제조2 = 빵.제조();
					} else if (n == 4) {
						제조2 = 음식.제조();
					}
				} while (제조2 == "다시");
			}
		} while (제조1 == "다시" || 제조2 == "다시");
		제조 = 제조1 + 제조2;
		if (제조1 == "" && 제조2 == "") {}
		else if (제조1 == "" && 제조2 != "") {
			System.out.println("\n\n주문하신 " + 제조2 + " 나왔습니다~");
		}
		else if (제조1 != "" && 제조2 == "") {
			System.out.println("\n\n주문하신 " + 제조1 + " 나왔습니다~");

		}
		else
			System.out.println("\n\n주문하신 " + 제조1 + "와(과) " + 제조2 + " 나왔습니다~");
		return 제조;
	}

	public String UP(String name, int 평판) {
		System.out.println("===========================================================================");
		System.out.println("매장을 업그레이드 합니다.");
		System.out.println("  1. 작은 카페 　( 평판 20 이상 )");
		System.out.println("  2. 브런치 카페 ( 평판 40 이상 )");
		System.out.println("  3. 다이닝 카페 ( 평판 80 이상 )");
		System.out.println("\n\n                                                       현재 평판 : " + 평판);
		System.out.println("===========================================================================");

		int n = sc.nextInt();

		if (n == 1 && name == "트럭" && 평판 > 19 && name != "브런치" && name != "다이닝") { // 19
			System.out.println("\n작은 카페로 업그레이드 하시겠습니까?");
			System.out.println("  1. 예\n  2. 아니오");
			int n1 = sc.nextInt();
			if (n1 == 1) {
				System.out.println("업그레이드 되었습니다. 신메뉴(주스류)가 추가 되었습니다.");
				System.out.println("[딸기주스], [키위주스], [토마토주스]\n");
				return "작은";
			}
		} else if (n == 2 && name == "작은" && 평판 > 39 && name != "트럭" && name != "다이닝") { // 39
			System.out.println("\n브런치 카페로 업그레이드 하시겠습니까?");
			System.out.println("  1. 예\n  2. 아니오");
			int n1 = sc.nextInt();
			if (n1 == 1) {
				System.out.println("업그레이드 되었습니다. 신메뉴(빵류)가 추가 되었습니다.");
				System.out.println("[베이글], [샌드위치], [케이크]\n");
				return "브런치";
			}
		} else if (n == 3 && name == "브런치" && 평판 > 79 && name != "트럭" && name != "작은") { // 79
			System.out.println("\n다이닝 카페로 업그레이드 하시겠습니까?");
			System.out.println("  1. 예\n  2. 아니오");
			int n1 = sc.nextInt();
			if (n1 == 1) {
				System.out.println("업그레이드 되었습니다. 신메뉴(식사류)가 추가 되었습니다.");
				System.out.println("[파스타], [스테이크]\n");
				return "다이닝";
			}
		} else {
			System.out.println("\n---실행할 수 없습니다.---\n");
		}
		return name;
	}

}
