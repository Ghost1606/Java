package week11;

public class SmartPhone extends Calc implements PhoneInterface{

	@Override
	public void sendcall() {
		System.out.println("�츮����");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��.");
	}
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.sendcall();
		phone.receiveCall();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3, 5));
		phone.schedule();
	}
}
