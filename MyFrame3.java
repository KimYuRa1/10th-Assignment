import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame3 extends JFrame{

	public MyFrame3() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        setLayout(new FlowLayout());//��ġ ������ ����!
        JButton button = new JButton("��ư");//������Ʈ ���� �� �߰�
        this.add(button);
        setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame3 f=new MyFrame3();
	}
	
}
