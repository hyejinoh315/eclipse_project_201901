package Customer;

public class _깐깐 extends _손님 {
	
	public _깐깐() {
		this.nameC="깐깐한 손님";
	}

	public int 만족(int 평판) {
		System.out.println("\n\n  "+ nameC +" - 내 입맛에 딱인 집은 여기가 처음이야..!!");
		평판 += 3;
		return 평판;
	}

	public int 화냄(int 평판) {
		System.out.println("\n\n  "+ nameC +" - 이거 제꺼 아니에요! 바빠죽겠는데 똑바로 못 주나요?\n\n\n손님이 화를 내고 떠나버렸습니다.");
		평판 -= 5;
		return 평판;
	}
}
