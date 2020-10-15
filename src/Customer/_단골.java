package Customer;

public class _단골 extends _손님 {
	
	public _단골() {
		this.nameC="단골 손님";
	}

	public int 만족(int 평판) {
		System.out.println("\n\n  "+ nameC +" - 저 맨날 이거 먹는거 기억하시는구나~^^ 다음에 또 올게요!");
		평판 += 2;
		return 평판;
	}

	public int 화냄(int 평판) {
		System.out.println("\n\n  "+ nameC +" - 늘 먹던건데도 실수하시면 어떡해요?\n\n\n손님이 화를 내고 떠나버렸습니다.");
		평판 -= 4;
		return 평판;
	}
}
