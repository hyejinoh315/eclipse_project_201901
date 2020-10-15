package MyCafe;

import java.util.Random;

public class _날씨 {

	public int 날씨(int 체력) { // 날씨 배열에 확률 넣기
		// 날씨에 따라 손님수가 결정됩니다 -> 결과(리턴) 값
		// 화창 4명, 먼지 2명, 구름 5명, 비 3명, 태풍 0명
		// 화창 30%(6), 미세먼지 30%(6), 구름 20%(4), 비 15%(3), 태풍 5%(1)
		String[] eDay = { "화창", "화창", "화창", "화창", "화창", "화창", "먼지", "먼지", "먼지", "먼지", "먼지", "먼지", "구름", "구름", "구름", "구름", "비", "비", "비", "태풍" };
		Random ran = new Random();
		String day = eDay[ran.nextInt(eDay.length)];

		if (day.equals("화창")) {
			System.out.println("===========================================================================");
			System.out.println("\n해가 쨍쨍하네! 날씨가 너무 좋아서 동네 밖으로 놀러나간 사람이 많겠는걸..\n");
			return 4;
		} else if (day.equals("먼지")) {
			System.out.println("===========================================================================");
			System.out.println("\n미세먼지 수치가 매우 나쁨이라고? 오늘 장사는 망했구만..\n");
			return 2;
		} else if (day.equals("구름")) {
			System.out.println("===========================================================================");
			System.out.println("\n구름이 많이 꼈지만 미세먼지 좋음이라 장사하기 딱 좋은 날씨인걸?\n");
			return 5;
		} else if (day.equals("비")) {
			System.out.println("===========================================================================");
			System.out.println("\n비가 오긴 하지만 미세먼지 나쁨보다는 낫겠지..\n");
			return 3;
		} else if (day.equals("태풍")) {
			System.out.println("===========================================================================");
			System.out.println("\n태풍이 와서 밖으로 나가면 큰일날지도 몰라.. 오늘은 쉬는 수밖에..\n\n--운영을 종료 합니다--");
			System.out.println("체력이 20 상승합니다.");
			return 0;
		}
		return 0;
	}
}
