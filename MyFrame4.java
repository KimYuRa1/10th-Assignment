import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {

	public MyFrame4(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		setSize(300,200);
		
		setLocation(screenSize.width/2, screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img=kit.getImage("icon.gif");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button=new JButton("��ư");
		this.add(button);
		setVisible(true);
	}
}
