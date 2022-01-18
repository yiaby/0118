package super변수예제;

public class SuperonicAirplaneEx {

	public static void main(String[] args) {
		SuperonicAirplane sa = new SuperonicAirplane();

		// 객체에게 동작 => 메소드 호출
		sa.takeOff();
		sa.fly(); // 자식 메소드 호출
		sa.flyMode = SuperonicAirplane.SUPERSONIC;
		sa.fly(); // 자식 메소드 호출
		sa.flyMode = SuperonicAirplane.NORMAL;
		sa.fly(); // 자식 메소드 호출
		sa.land();

		/*
		 * [실행 결과] 이륙합니다. 일반비행 합니다. 초음속 비행합니다. 일반비행 합니다. 착륙 합니다.
		 */

	}

}
