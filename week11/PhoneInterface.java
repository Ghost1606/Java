package week11;

public interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	void sendcall();
	void receiveCall();
	default void printLogo() { //�ڹ� ���� 8 ���� private�� public�� 9���� ����
		System.out.println("** Phone **");
	} 
	default void printLogo1() { //�ڹ� ���� 8 ���� private�� public�� 9���� ����
		System.out.println("** Phone **");
	}
}