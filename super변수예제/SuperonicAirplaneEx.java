package super��������;

public class SuperonicAirplaneEx {

	public static void main(String[] args) {
		SuperonicAirplane sa = new SuperonicAirplane();

		// ��ü���� ���� => �޼ҵ� ȣ��
		sa.takeOff();
		sa.fly(); // �ڽ� �޼ҵ� ȣ��
		sa.flyMode = SuperonicAirplane.SUPERSONIC;
		sa.fly(); // �ڽ� �޼ҵ� ȣ��
		sa.flyMode = SuperonicAirplane.NORMAL;
		sa.fly(); // �ڽ� �޼ҵ� ȣ��
		sa.land();

		/*
		 * [���� ���] �̷��մϴ�. �Ϲݺ��� �մϴ�. ������ �����մϴ�. �Ϲݺ��� �մϴ�. ���� �մϴ�.
		 */

	}

}
