package week11;

public class SamSungPhone implements PhoneInterface{

	@Override
	public void sendcall() {
		System.out.println("띠리리링");	
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");	
	}
}
