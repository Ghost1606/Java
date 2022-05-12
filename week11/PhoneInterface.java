package week11;

public interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	void sendcall();
	void receiveCall();
	default void printLogo() { //자바 버전 8 부터 private와 public은 9버전 부터
		System.out.println("** Phone **");
	} 
	default void printLogo1() { //자바 버전 8 부터 private와 public은 9버전 부터
		System.out.println("** Phone **");
	}
}
