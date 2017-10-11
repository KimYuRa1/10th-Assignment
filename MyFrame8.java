import java.awt.*;
import javax.swing.*;

public class MyFrame8 extends JFrame{

	public MyFrame8() {
		 
        setTitle("GridLayoutTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(0, 3));	// 3개의 열과 필요한 만큼의 행

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("Long Button5"));

        pack();
        setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame8 f=new MyFrame8();
	}

}
