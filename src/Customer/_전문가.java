package Customer;

public class _전문가 extends _손님 {

	public _전문가() {
		this.nameC = "낯이 익은 손님"; // 전문가 손님 ex 백종원..??
	}

	public int 만족(int 평판) {
		System.out.println("\n\n  " + nameC + " - 서비스, 품질, 정확성 전부 합격점이에요.");
		평판 += 5;
		return 평판;
	}

	public int 화냄(int 평판) {
		System.out.println("\n\n  " + nameC + " - 메뉴도 제대로 못 내다니.. 엉망진창이군..\n\n\n손님이 화를 내고 떠나버렸습니다.");
		평판 -= 8;
		return 평판;
	}
}
