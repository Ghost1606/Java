package week14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e)
	{
		JButton b = (JButton)e.getSource(); //�̺�Ʈ ��������
		if(b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
	}
}

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); 	
		c.add(btn);
		
		setSize(250, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();

	}

}