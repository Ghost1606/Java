package week14;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300X300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame mf = new MyFrame();

	}

}
