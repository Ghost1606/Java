package week11;

public class SmartPhone extends Calc implements PhoneInterface{

	@Override
	public void sendcall() {
		System.out.println("띠리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.sendcall();
		phone.receiveCall();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
	}
}

