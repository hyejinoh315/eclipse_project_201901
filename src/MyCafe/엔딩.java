package MyCafe;

public class 엔딩 {

	public void 해피() { // (TV출연 엔딩, 낯익은손님->전문가:백종원)
		Music happyE = new Music("해피.mp3", false);
		Music 띵동 = new Music("띵동.mp3", false);
		띵동.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" 『 저 손님 참 닟이 익단 말이야...』");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n\n  ??? - 안녕하세요 사장님.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n낯이 익은 그 손님이 내민 명함에는 김커피라고 적혀있었다...\n");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("이 손님, 요새 핫한 TV프로그램에 나오는 [창업의 신] 김커피였어..!\n");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n\n  김커피 - 사장님네 카페가 이달의 맛집에 선정돼서 찾아왔습니다. 저희 프로그램에 출연해 주세요.\n\n\n");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("방송 출연 이후 가게는 더욱 붐비고 많은 손님들이 찾아왔다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(".");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} happyE.start();
		System.out.println("[TV출연] 성공한 엔딩을 맞이합니다.");
		System.out.println("     :::    :::     :::     :::::::::  :::::::::  :::   ::: \r\n"
				+ "     :+:    :+:   :+: :+:   :+:    :+: :+:    :+: :+:   :+: \r\n"
				+ "     +:+    +:+  +:+   +:+  +:+    +:+ +:+    +:+  +:+ +:+  \r\n"
				+ "     +#++:++#++ +#++:++#++: +#++:++#+  +#++:++#+    +#++:   \r\n"
				+ "     +#+    +#+ +#+     +#+ +#+        +#+           +#+    \r\n"
				+ "     #+#    #+# #+#     #+# #+#        #+#           #+#    \r\n"
				+ "     ###    ### ###     ### ###        ###           ###    \n\n");
		System.out.println(":::::::::: ::::    ::: :::::::::  ::::::::::: ::::    :::  ::::::::  \r\n"
				+ ":+:        :+:+:   :+: :+:    :+:     :+:     :+:+:   :+: :+:    :+: \r\n"
				+ "+:+        :+:+:+  +:+ +:+    +:+     +:+     :+:+:+  +:+ +:+        \r\n"
				+ "+#++:++#   +#+ +:+ +#+ +#+    +:+     +#+     +#+ +:+ +#+ :#:        \r\n"
				+ "+#+        +#+  +#+#+# +#+    +#+     +#+     +#+  +#+#+# +#+   +#+# \r\n"
				+ "#+#        #+#   #+#+# #+#    #+#     #+#     #+#   #+#+# #+#    #+# \r\n"
				+ "########## ###    #### #########  ########### ###    ####  ########  ");
	}

	public void 노멀() { // 천천히 잘 하고있어!
		Music ingE = new Music("BGM.mp3", false);// 노래바꾸기
		ingE.start();
		System.out.println(" 『 지난 30일간 정말 힘든날도 많았지만.. 그 덕분에 동네에 이렇게 번듯하게 자리를 잡을 수 있었지.."
				+ "\n                                  꾸준히 열심히 하다 보면 더 좋은날이 올거야!』");
		System.out.println("\n\n  단골 손님 - 여기요~ 주문할게요~");
		System.out.println("\n\n네 어서오세요 주문 도와드리겠습니다. ^^\n");
		// System.out.println("아스키코드이미지넣기");
		System.out
				.println("                _____   _   _    _____ \r\n" + "               |_   _| | \\ | |  / ____|\r\n"
						+ "  ___ ___ ___    | |   |  \\| | | |  __ \r\n" + " |___|___|___|   | |   | . ` | | | |_ |\r\n"
						+ "                _| |_  | |\\  | | |__| |\r\n" + "               |_____| |_| \\_|  \\_____|");
	}

	public void 배드(int 평판) { // 평판 구려서 망함
		// Music badE = new Music("BGM.mp3", false);//노래바꾸기
		// badE.start();
		System.out.println("평판 : " + 평판 + "\n손님이 더이상 오지 않아 폐업합니다.");
		System.out.println("\n\n 『 자영업을 너무 우습게 봤던 결과인가...』" + "\n한푼만 줍쇼~");
		System.out.println("         ■■              \r\n" + "      .$■■■■$,   ■■■        \r\n"
				+ "      ;■■■■■■! #■■■■■■!       \r\n" + "      ■■■■■■■■ #■■■■■■■■.     \r\n"
				+ "      ;■■■■■■! ■■■■■■■■■=.    \r\n" + "      .#■■■■# ■■■■■■■■■■=.   \r\n"
				+ "         ■■    !■■   ■■■■■=.  \r\n" + "              ,■■=   -#■■■■#. \r\n"
				+ "              !■■~    ,$■■■■■ \r\n" + "              $■#.     :■■■■$.\r\n"
				+ "             :■■=    ,!■■■■#: \r\n" + "            !#■■~   :$■■■■=-  \r\n"
				+ "          .=■■■~  .=■■■■#;    \r\n" + " .------. ;■■#- .;#■■■■=~...  \r\n"
				+ " !■■■■■■$ !■#-  !■■■■■■■■■■■#~\r\n" + "-$■■■■■■■-,!-  .$■■■■■■■■■■■■#\r\n"
				+ "!#■■■■■■■■.     ;■■■■■■■■■■■#:");
		System.out.println(" _____       _              _ _         \r\n"
				+ "| __  |___ _| |   ___ ___ _| |_|___ ___ \r\n" + "| __ -| .'| . |  | -_|   | . | |   | . |\r\n"
				+ "|_____|__,|___|  |___|_|_|___|_|_|_|_  |\r\n" + "                                   |___|");
	}

}
