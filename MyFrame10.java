import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame10 extends JFrame{

	JPanel p1;
	  
	public MyFrame10() {
		setSize(300, 200);
		setTitle("My Frame");
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++)
			p1.add(new JButton("Button" + i));
		add(p1);
		setVisible(true); // �������� ȭ�鿡 ǥ���Ѵ�.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame10 f = new MyFrame10();
	}

}
